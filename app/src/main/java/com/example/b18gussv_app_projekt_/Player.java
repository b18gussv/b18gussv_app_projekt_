package com.example.b18gussv_app_projekt_;

public class Player {
    private String name;
    private String location;
    private int height;
    private String company;
    private String category;
    private int cost;

    @Override
    public  String toString(){
        return name;
    }

    public Player(){
        name="Saknar namn";
        location="Saknar höjd";
        height=-1;
        company="Saknar lag";
        category="Saknar position";
        cost=-1;
    }

    public Player(String n, String l, int h, String k,String p, int s){
        name=n;
        location=l;
        height=h;
        company=k;
        category=p;
        cost=s;
    }

    public String info(){
        String tmp=new String();
        tmp+="Namn: "+name+"\nLängd: "+location+"m"+"\nPPG: "+height+"\nLag: "+company+"\nPosition: "+category+"\nLön: "+cost+"miljoner USD";
        return tmp;
    }

    public void setName(String n){
        name=n;
    }

    public String getName(){
        return name;
    }
}


