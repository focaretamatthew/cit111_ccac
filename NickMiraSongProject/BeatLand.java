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
import java.util.Scanner;

/**
 *
 * @author codhi
 */
public class BeatLand {
    
    //public class BeatLand is modeled off of public Class ArrayOfObjects by
    //nicolas lankes.  It has been modified and structured to more closely align
    // with the parameters of a beat made by Hip Hop Producer Nick Mira.
    //In addition, a song selection abilty has been added which displays the lyrics
    //of the song that the user chooses after being presented the song information.
    
    public static void main(String[] args){
        
        System.out.println("()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()");
        System.out.println("Welcome to a Nick Mira Beat Simulator/Lyric Generator Program!");
        System.out.println("Take a moment to look over the song information, and at the end, you can");
        System.out.println("choose a song that you would like to know the lyrics of!");
        System.out.println("()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()");
        
        Songs firstBeat = new Songs();
        firstBeat.setSongNumber("One");
        firstBeat.setSongName("This Song is Called : Pistols and Tears");
        firstBeat.setMelodyType("Energetic Piano Melody");
        firstBeat.setDrumType("Simple --> 2 Step Pattern ");
        firstBeat.setArtistFeature("Dro Kenji");
        firstBeat.setSongLength(2.12);
        firstBeat.setReleasedSong(true);
        
        
        Songs secondBeat = new Songs();
        secondBeat.setSongNumber("Two");
        secondBeat.setSongName("This Song is Called : Maybe");
        secondBeat.setMelodyType("Electric Guitar Melody");
        secondBeat.setDrumType("Bouncy --> Hi Hat Rolls");
        secondBeat.setArtistFeature("The Kid Laroi");
        secondBeat.setSongLength(3.25);
        firstBeat.setReleasedSong(true);
        
        
        
        Songs thirdBeat = new Songs();
        thirdBeat.setSongNumber("Three");
        thirdBeat.setSongName("This Song is Called : Blood On My Jeans");
        thirdBeat.setMelodyType("Acoustic Guitar Melody");
        thirdBeat.setDrumType("Simple --> 2 Step Pattern");
        thirdBeat.setArtistFeature("Juice Wrld");
        thirdBeat.setSongLength(2.55);
        thirdBeat.setReleasedSong(false);
        
        
        
        Songs fourthBeat = new Songs();
        fourthBeat.setSongNumber("Four");
        fourthBeat.setSongName("This Song is Called : JLO");
        fourthBeat.setMelodyType("Dancehall Melody");
        fourthBeat.setDrumType("Bouncy With Breaks");
        fourthBeat.setArtistFeature("Lil Tecca");
        fourthBeat.setSongLength(2.19);
        fourthBeat.setReleasedSong(true);
        
        
        
        Songs fifthBeat = new Songs();
        fifthBeat.setSongNumber("Five");
        fifthBeat.setSongName("This Song is Called : The Bigger Picture");
        fifthBeat.setMelodyType("Dark Cinematic Melody");
        fifthBeat.setDrumType("Hard Trap");
        fifthBeat.setArtistFeature("Lil Baby");
        fifthBeat.setSongLength(3.34);
        fifthBeat.setReleasedSong(false);
        
        
        Songs[] Songs = new Songs[5];
        
        Songs[0] = firstBeat;
        Songs[1] = secondBeat;
        Songs[2] = thirdBeat;
        Songs[3] = fourthBeat;
        Songs[4] = fifthBeat;
        
        for(int i = 0; i <= 4; i += 1){
            Songs usedSongs = Songs[i];
            System.out.println("Getting beat specifications!");
            System.out.println();
            System.out.println("*********************************************");
            System.out.println("Song number : " + usedSongs.getSongNumber());
            System.out.println("*********************************************");
            System.out.println("Song Name : " + usedSongs.getSongName());
            System.out.println("*********************************************");
            System.out.println("Melody Type : " + usedSongs.getMelodyType());
            System.out.println("*********************************************");
            System.out.println("Drum Type : " + usedSongs.getDrumType());
            System.out.println("*********************************************");
            System.out.println("Featured Artist : " + usedSongs.getArtistFeature());
            System.out.println("*********************************************");
            System.out.println("Song Length : " + usedSongs.getSongLength());
            System.out.println("*********************************************");
            System.out.println(" Is this a released song? " + usedSongs.getReleasedSong());
            System.out.println("*********************************************");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
        
        
         Scanner Scanner = new Scanner(System.in);
        int userInput;

        System.out.println("*************************************************");
        System.out.println("Lets get some lyrics pumpin!!");
        System.out.println("Enter the number of the song that you would like the");
        System.out.println("lyrics for.  The number of the song corresponds to the");
        System.out.println("order in which they were listed!");
        System.out.println("*************************************************");

        userInput = Scanner.nextInt();

        switch(userInput){
            case 1:
                Songs accessedSong0 = Songs[0];
                System.out.println("Getting the lyrics for : Dro Kenji - Pistols and Tears");
                System.out.println("......................................................");
                System.out.println("In a brand new wraith...");
                System.out.println("Shorty tryna pull my strings");
                System.out.println("Perky got my goin up up up outerspace stratosphere");
                System.out.println("Countin money, I'll remain right here!");
                break; 
            case 2:
                Songs accessedSong1 = Songs[1];
                System.out.println("Getting the lyrics for : The Kid Laroi - Maybe");
                System.out.println("......................................................");
                System.out.println("Drown my sorrows in this bottle,");
                System.out.println("Won't like waking up tomorrow");
                System.out.println("I'm the only one who cares about myself!");
                System.out.println("Only you can't fix my problems, like you once did I'm too hollow");
                System.out.println("I can't talk to you no more and I can't tell...");
                break;
            case 3:
                Songs accessedSong2 = Songs[2];
                System.out.println("Getting the lyrics for : Juice Wrld - Blood On My Jeans");
                System.out.println("......................................................");
                System.out.println("Baby I been on the run,");
                System.out.println("But I will never run from your love.");
                System.out.println("If you feel on my **** there's a gun.");
                System.out.println("Not right there, just a little above.");
                System.out.println("I value my relationship it's forever,");
                System.out.println("but I've been cheatin' on the drugs...");
                break;
            case 4:
                Songs accessedSong3 = Songs[3];
                System.out.println("Getting the lyrics for : Lil Tecca - JLO");
                System.out.println("......................................................");
                System.out.println("Wwhen I'm gone please don't tell me that,");
                System.out.println("you love and you miss a *****");
                System.out.println("Don't play my songs,");
                System.out.println("Cause when I'm around, you didnt f*** with a *****");
                System.out.println("And you know I'm wrong...");
                break;
            case 5:
                Songs accessedSong4 = Songs[4];
                System.out.println("Getting the lyrics for : Lil Baby - The Bigger Picture");
                System.out.println("......................................................");
                System.out.println("Trade my 4 by 4 for G63 ain't no more free Lil Steve,");
                System.out.println("I gave 'em chance and chance again,");
                System.out.println("I even had done told them, Please");
                System.out.println("I find it crazy the police will shoot you and know that you dead,");
                System.out.println("but still tell you to freeze....");
                break;
                        
        }// close switch userInput


    }// close main method
    
}// close class BeatLand
