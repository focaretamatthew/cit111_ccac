/*
 * Copyright 2020 codhi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package NickMiraSongProject;

/**
 *
 * @author codhi
 */
public class Songs {
    
    // public class songs is modelled off of nicolas lankes "songs" class, but is
    // modified and adapted to fit more closely the model of a beat by popular
    // hip hop producer Nick Mira.
    
   
    private String melodyType;
    private String drumType;
    private double songLength;
    private String artistFeature;
    private boolean releasedSong;
    private String songName;
    private String songNumber;
    
    
    
    
    public String getSongNumber(){
        return songNumber;  
    }// close getSongNumber
    
    public void setSongNumber(String songNumber){
        this.songNumber = songNumber;
    }//close setSongNumber
    
    
    
    
    public String getSongName(){
        return songName;
    }// lose getSongName
    
    
    public void setSongName(String songName){
        this.songName = songName;
    }//close setSongName
    
    
    
    
    public String getMelodyType(){
        return melodyType; 
    }// close getMelodyType
   
    public void setMelodyType(String melodyType) {
        this.melodyType = melodyType;
    }// close setMelodyType
    
    
    
    
    public String getDrumType() { 
        return drumType;
    }// close getDrumType
    
    public void setDrumType(String drumType) {
        this.drumType = drumType;
    }// close setDrumType
    
    
   
    
    public double getSongLength() {
        return songLength;
    }// close getSongLength
    
    public void setSongLength(double songLength){
        this.songLength = songLength;
    }// close setSongLength
    
    
    
    
    public String getArtistFeature() {
        return artistFeature;
    }// close getArtistFeature
    
    public void setArtistFeature(String artistFeature){
        this.artistFeature = artistFeature;
    }// close artistFeature
    
    
    
    
    public boolean getReleasedSong() {
        return releasedSong;
    }//close getReleasedSong
    
    public void setReleasedSong(boolean releasedSong){
        this.releasedSong = releasedSong;
    }// close setReleasedSong
    
    
    
}// close Songs

