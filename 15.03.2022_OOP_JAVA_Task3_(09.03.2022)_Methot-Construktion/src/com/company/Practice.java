package com.company;

public class Practice {
   public String subject;
    Human tutor;
    Human intern;
     MyDate myDateStart;
     MyDate myDateFinish;

  public Practice(String subject, Human tutor, Human intern, MyDate myDateStart, MyDate myDateFinish){
       this.subject=subject;
       this.tutor=tutor;
       this.intern=intern;
      this.myDateStart = myDateStart;
      this.myDateFinish=myDateFinish;
   }

    @Override
    public String toString() {
        return "Practice{" +
                "subject:" + subject.toString() + ' ' +
                ", Tutor: " + tutor.toString() +
                ", Intern: "+ intern.toString()+
                ", Date Practice Start: " + myDateStart.toString()+
                ",  Date  Practice Finish: " + myDateFinish.toString()+
                '}';
    }
}
