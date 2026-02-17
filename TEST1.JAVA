PUBLIC CLASS OPTION {
    PUBLIC STRING TEXT;
    public boolean istrue;
    public OPTION(STRING TEXT,boolean istrue){
     this.TEXT=TEXT;
     this.istrue=istrue;
    }
void setTEXT(string TEXT){
    this.TEXT = TEXT;
}
void set istrue(boolean istrue){
    this.true = istrue;
}

}
public class question{
    public string question;
    public OPTION[] options;
    public question(string question, OPTION[] options) {
        this.question = question;
        this.options = options;
    }
    void setquestion(string question){
        this.question = question;
    }
    void setoptions(OPTION[] options){
        this.options = options;
    }
    OPTION[] getoptions(){
        return this.options;
    }
    string getquestion(){
        return this.question;
    }
    public class sujet extends question{
        public int note globale;
        public sujet(string question, OPTION[] options, int note globale){
            super(question,options);
            this.note globale = note globale;
        }
        void setnote globale(int note globale){
            this.note globale = note globale;
        }
        int get note globale(){
            return this.note globale;
        }

    }
    public class test extends sujet{
        publuc string date;
        public int heure;
        publc string salle;
        public test(string question, options[] options, int note globale, string date, int heure, string salle){
            super(question, optiond , note globale);
            thid.date = date;
            this.heure = heure;
            this.salle = salle;
        }
        void setdate(string date){
            this.date = date;
        }
        string getdate(){
            return this.date;
        }
        void setheure(int heure){
            this.heure = heure;
        }
        int getheure(){
            return this.heure;
        }
        void setsalle(string salle){
            this.salle = salle;
        }
        string getsalle(){
            return this.salle;
        }

    } 

    
} 
viod main(string[] args){
    OPTION option1 = new OPTION("option 1", true);
    OPTION option2 = new OPTION("option 2", false);
    OPTION[] options = {option1, option2};
    test test1 = new test("Quelle est la capitale de la France?", options, 10, "2024-06-15", 10, "Salle A");
    system.out.println("Question: " + test1.getquestion());
    for (OPTION opt : test1.getoptions()) {
        system.out.println("Option: " + opt.TEXT + ", istrue: " + opt.istrue);
    }
    system.out.println("Date: " + test1.getdate());
    system.out.println("Heure: " + test1.getheure());
    system.out.println("Salle: " + test1.getsalle());
    system.out.println("Note Globale: " + test1.get note globale());
}