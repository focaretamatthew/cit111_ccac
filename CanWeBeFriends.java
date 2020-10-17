/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canwebefriends;

import java.util.Scanner;

/**
 *
 * @author Matthew Focareta
 */
public class CanWeBeFriends {
    public static void main(String[] args){
        System.out.println("Might we be friends?");
        
        int correctResponse;
        // this is to store responses in, not a set value
        
        int friendScore = 0;
        //value to compare against threshold to determine if we will be friends or not
        
        final int FRIEND_THRESHOLD = 15;
        // final value to compare.  Minimum point requirement to be friends.
        
        System.out.println("First things first, Do you like music?    1 = yes, 0 = no");
        // ask the first quetion.
        
        //Set up scanner
        Scanner userResponse = new Scanner(System.in);
        correctResponse = userResponse.nextInt();
        
        //SEGMENT ONE BEGINS
        
        // compare CorrectResponse variable to input from UserResponse Scanner to determine the next step
        if(correctResponse == 1){
            System.out.println("How about internet money songs? Do you like those?  1 = yes, 0 = no");  
        }else{ 
            System.out.println("We are simply not compatible.");
            //update friendscore
            friendScore = friendScore - 150;
            //display friendscore
            System.out.println("Your Friend Score is " + friendScore);
                  
            // since the program is over, execute friend threshold comparison.
            System.out.println("******************************************");
        System.out.println("What is your friendscore?");
        correctResponse = userResponse.nextInt();
        if(correctResponse >= FRIEND_THRESHOLD){
            System.out.println("How do you do, friend?");
        }else{
            System.out.println("Im sorry, but I just don't see how we are gonna be friends.");
        }// end of if else for completed program
        
        }// end of first segment if else
        
        
        // SEGMENT TWO BEGINS
        
        
        // take question two, compute the answer, progress the flow chart
        correctResponse = userResponse.nextInt();
        if(correctResponse == 1){
            System.out.println("Okay, so do you follow nick mira on Twitter/IG?  1 = yes, 0 = no");
            //update friend score
            friendScore = friendScore + 10;
            //display friend score
            System.out.println("Your friend score is " + friendScore);
        }else{
            //if false, update friend score
            friendScore = friendScore - 10;
            //display friendscore
            System.out.println("Your friend Score is " + friendScore);
            //Ask Pierre Question
            System.out.println("Hmm. So do you like Pi'erre Bourne beats?  1 = yes, 0 = no");
            // call on scanner
            correctResponse = userResponse.nextInt();
            if(correctResponse == 1){
                System.out.println("Okay, I guess we can give friends a shot...maybe?");
                //update friend score
                friendScore = friendScore + 25;
                //display friend score
                System.out.println("Your friendScore is " + friendScore);
                
                // the program is over at this point due to the path that was taken, so display
                // the ending scanner and compare the friend Threshold to the given friendscore
                
                        System.out.println("******************************************");
        System.out.println("What is your friendscore?");
        correctResponse = userResponse.nextInt();
        if(correctResponse >= FRIEND_THRESHOLD){
            System.out.println("How do you do, friend?");
        }else{
            System.out.println("Im sorry, but I just don't see how we are gonna be friends.");
        }    
                
             // return to if else to continue prompt from before.   
            }else{
                friendScore = friendScore - 10;
                System.out.println("Your friend score is " + friendScore);
               System.out.println("Do you at least lke carti?   1 = yes, 0 = no");
               // call on scanner
               correctResponse = userResponse.nextInt();
            if(correctResponse == 1){
                System.out.println("Okay bet. Good answer.");
                //update friendScore
                friendScore = friendScore + 10;
                // display friendScore
                System.out.println("Your friend score is " + friendScore);
                
                //the program is over at this point due to the path that was taken
                // compare the users friend score to the friendscore threshold.
                
        System.out.println("******************************************");
        System.out.println("What is your friendscore?");
        correctResponse = userResponse.nextInt();
        if(correctResponse >= FRIEND_THRESHOLD){
            System.out.println("How do you do, friend?");
        }else{
            
        }
            System.out.println("Im sorry, but I just don't see how we are gonna be friends.");
            System.out.println("However, I do like that you like Playboi Carti!!");
            
            // resume else statemennt from before if/else to determine what happens if the user does
            //not like Carti.
            }else{
                System.out.println("Bad Answer.  We can't be friends.");
                        friendScore = friendScore - 100;
                        System.out.println("Your friend score is " + friendScore);
                        
                        // since the user cannot attain a score of at least 15 here, the ending scanner
                        //is implimented, and the program is ended.
                    
        System.out.println("******************************************");
        System.out.println("What is your friendscore?");
        correctResponse = userResponse.nextInt();
        if(correctResponse >= FRIEND_THRESHOLD){
            System.out.println("How do you do, friend?");
        }else{
            System.out.println("Im sorry, but I just don't see how we are gonna be friends.");
        }
                        
            }// end of if else for incorrect answer of carti question
            }//close of else for "I guess we can give friends a shot."
        }// end of second if else
        
        
        //take NickMira question, compute the answer, process flow chart.  Also take 
        //Pierre question, compute answer, and process flow chart.
        correctResponse = userResponse.nextInt();
        if(correctResponse == 1){
            System.out.println("We can be friends for sure!");
            friendScore = friendScore + 25;
            System.out.println("Your friend Score is " + friendScore);
             
        }else{
            System.out.println("So do you follow the Kid Laroi?  1 = yes, 0 = no");
            friendScore = friendScore - 5;
            correctResponse = userResponse.nextInt();
            if(correctResponse == 1){
                System.out.println("Ahh, great aspiring artist isn't he?");
                friendScore = friendScore + 10;
                System.out.println("Your friend score is " + friendScore);
            }else{
                System.out.println("Hmmm. I don't know that our interests align enough to be friends.");
                friendScore = friendScore - 5;
                System.out.println("Your friend score is " + friendScore);
            }
        }// close if else
        
        System.out.println("******************************************");
        System.out.println("What is your friendscore?");
        correctResponse = userResponse.nextInt();
        if(correctResponse >= FRIEND_THRESHOLD){
            System.out.println("How do you do, friend?");
        }else{
            System.out.println("Im sorry, but I just don't see how we are gonna be friends.");
        }// close if else
        
        
    }// close of main method
    
}//close of public class
