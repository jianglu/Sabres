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
package com.example.sabres.controller;

import com.example.sabres.model.Director;

public class DirectorController {
    public static Director createQuentinTarantino() {
        Director director = new Director();
        director.setName(Director.QuentinTarantino.NAME);
        director.setDateOfBirth(Director.QuentinTarantino.DATE_OF_BIRTH);
        return director;
    }

    public static Director createDavidFincher() {
        Director director = new Director();
        director.setName(Director.DavidFincher.NAME);
        director.setDateOfBirth(Director.DavidFincher.DATE_OF_BIRTH);
        return director;
    }

    public static Director createGuyRitchie() {
        Director director = new Director();
        director.setName(Director.GuyRitchie.NAME);
        director.setDateOfBirth(Director.GuyRitchie.DATE_OF_BIRTH);
        return director;
    }
}
