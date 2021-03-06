/*
 * Copyright 2015 Tamir Shomer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sabres;

final class Column {
    private final String name;
    private final SqlType type;
    private String foreignTable;
    private boolean primaryKey = false;
    private boolean notNull = false;

    Column(String name, SqlType type) {
        this.name = name;
        this.type = type;
    }

    Column foreignKeyIn(String foreignTable) {
        this.foreignTable = foreignTable;
        return this;
    }

    Column primaryKey() {
        primaryKey = true;
        return this;
    }

    Column notNull() {
        notNull = true;
        return this;
    }

    @Override
    public String toString() {
        return toSql();
    }

    String toSql() {
        StringBuilder sb = new StringBuilder(String.format("%s %s", name, type.toString()));

        if (primaryKey) {
            sb.append(" PRIMARY KEY");
        }

        if (notNull) {
            sb.append(" NOT NULL");
        }

        if (foreignTable != null) {
            sb.append(" REFERENCES ").append(foreignTable);
        }

        return sb.toString();
    }
}
