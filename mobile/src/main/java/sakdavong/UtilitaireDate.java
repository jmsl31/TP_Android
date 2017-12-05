package sakdavong;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import sakdavong.tangotoulousenet.Bal;

/**
 * Created by jcs on 22/04/2016.
 */
public class UtilitaireDate {

    public static Calendar dateDebut(Bal b)
    {
        Date debutBal = (Date) b.getDateBal().clone();
        debutBal.setTime(debutBal.getTime() + 3600 * 1000 * 10);
        Date heureFinBal = (Date)b.getHoraireFin().clone();
        heureFinBal.setTime(heureFinBal.getTime()- 3600 * 1000 * 1);

        //SimpleDateFormat sdfDebut = new SimpleDateFormat("EEE d MMM yyy àà kk:mm", Locale.FRANCE);
        //SimpleDateFormat sdfFin = new SimpleDateFormat("HH:mm", Locale.FRANCE);
        //System.out.println("Débute le " + sdfDebut.format(debut));
        //System.out.println("Fini à " + sdfFin.format(fin));

        Calendar startTime = Calendar.getInstance(Locale.FRANCE);
        startTime.setTime(debutBal);

//        System.out.println(b.getTitre()+" à lieu le "+b.getDateBal().toString()+" MOIS = "+startTime.get(Calendar.MONTH)+"  =?= "+newMonth);

        int hourStart = startTime.get(Calendar.HOUR_OF_DAY);
        int minStart = startTime.get(Calendar.MINUTE);
        Calendar endTime = Calendar.getInstance(Locale.FRANCE);
        endTime.setTime((Date)heureFinBal.clone());
        int hourEnd = endTime.get(Calendar.HOUR_OF_DAY);
        int minEnd = endTime.get(Calendar.MINUTE);

        long duration= (hourEnd*60+minEnd - hourStart*60+minStart)*60*1000;
        if (duration<0) duration+=24*3600*1000;
        Date endDate = new Date(debutBal.getTime()+duration);
        endTime.setTime(endDate);

        System.out.println("===>"+startTime.get(Calendar.HOUR_OF_DAY)+":"+startTime.get(Calendar.MINUTE)+" à "+endTime.get(Calendar.HOUR_OF_DAY)+":"+endTime.get(Calendar.MINUTE)+" le "+(startTime.get(Calendar.DAY_OF_MONTH))+"/"+(startTime.get(Calendar.MONTH)+1)+"/"+startTime.get(Calendar.YEAR)
            +" jusqu'au "+(endTime.get(Calendar.DAY_OF_MONTH))+"/"+(endTime.get(Calendar.MONTH)+1)+"/"+endTime.get(Calendar.YEAR));

        return startTime;
    }


    public static Calendar dateFin(Bal b)
    {
        Date debutBal = (Date) b.getDateBal().clone();
        debutBal.setTime(debutBal.getTime() + 3600 * 1000 * 10);
        Date heureFinBal = (Date)b.getHoraireFin().clone();
        heureFinBal.setTime(heureFinBal.getTime()- 3600 * 1000 * 1);

        //SimpleDateFormat sdfDebut = new SimpleDateFormat("EEE d MMM yyy àà kk:mm", Locale.FRANCE);
        //SimpleDateFormat sdfFin = new SimpleDateFormat("HH:mm", Locale.FRANCE);
        //System.out.println("Débute le " + sdfDebut.format(debut));
        //System.out.println("Fini à " + sdfFin.format(fin));

        Calendar startTime = Calendar.getInstance(Locale.FRANCE);
        startTime.setTime(debutBal);

//        System.out.println(b.getTitre()+" à lieu le "+b.getDateBal().toString()+" MOIS = "+startTime.get(Calendar.MONTH)+"  =?= "+newMonth);

        int hourStart = startTime.get(Calendar.HOUR_OF_DAY);
        int minStart = startTime.get(Calendar.MINUTE);
        Calendar endTime = Calendar.getInstance(Locale.FRANCE);
        endTime.setTime((Date)heureFinBal.clone());
        int hourEnd = endTime.get(Calendar.HOUR_OF_DAY);
        int minEnd = endTime.get(Calendar.MINUTE);

        long duration= (hourEnd*60+minEnd - hourStart*60+minStart)*60*1000;
        if (duration<0) duration+=24*3600*1000;
        Date endDate = new Date(debutBal.getTime()+duration);
        endTime.setTime(endDate);

        System.out.println("===>"+startTime.get(Calendar.HOUR_OF_DAY)+":"+startTime.get(Calendar.MINUTE)+" à "+endTime.get(Calendar.HOUR_OF_DAY)+":"+endTime.get(Calendar.MINUTE)+" le "+(startTime.get(Calendar.DAY_OF_MONTH))+"/"+(startTime.get(Calendar.MONTH)+1)+"/"+startTime.get(Calendar.YEAR)
                +" jusqu'au "+(endTime.get(Calendar.DAY_OF_MONTH))+"/"+(endTime.get(Calendar.MONTH)+1)+"/"+endTime.get(Calendar.YEAR));

        return endTime;
    }


    public static String descriptionDate(Bal b)
    {
        Date debutBal = (Date) b.getDateBal().clone();
        debutBal.setTime(debutBal.getTime() + 3600 * 1000 * 10);
        Date heureFinBal = (Date)b.getHoraireFin().clone();
        heureFinBal.setTime(heureFinBal.getTime()- 3600 * 1000 * 1);

        //SimpleDateFormat sdfDebut = new SimpleDateFormat("EEE d MMM yyy àà kk:mm", Locale.FRANCE);
        //SimpleDateFormat sdfFin = new SimpleDateFormat("HH:mm", Locale.FRANCE);
        //System.out.println("Débute le " + sdfDebut.format(debut));
        //System.out.println("Fini à " + sdfFin.format(fin));

        Calendar startTime = Calendar.getInstance(Locale.FRANCE);
        startTime.setTime(debutBal);

//        System.out.println(b.getTitre()+" à lieu le "+b.getDateBal().toString()+" MOIS = "+startTime.get(Calendar.MONTH)+"  =?= "+newMonth);

        int hourStart = startTime.get(Calendar.HOUR_OF_DAY);
        int minStart = startTime.get(Calendar.MINUTE);
        Calendar endTime = Calendar.getInstance(Locale.FRANCE);
        endTime.setTime((Date)heureFinBal.clone());
        int hourEnd = endTime.get(Calendar.HOUR_OF_DAY);
        int minEnd = endTime.get(Calendar.MINUTE);

        long duration= (hourEnd*60+minEnd - hourStart*60+minStart)*60*1000;
        if (duration<0) duration+=24*3600*1000;
        Date endDate = new Date(debutBal.getTime()+duration);
        endTime.setTime(endDate);

        System.out.println("===>"+startTime.get(Calendar.HOUR_OF_DAY)+":"+startTime.get(Calendar.MINUTE)+" à "+endTime.get(Calendar.HOUR_OF_DAY)+":"+endTime.get(Calendar.MINUTE)+" le "+(startTime.get(Calendar.DAY_OF_MONTH))+"/"+(startTime.get(Calendar.MONTH)+1)+"/"+startTime.get(Calendar.YEAR)
                +" jusqu'au "+(endTime.get(Calendar.DAY_OF_MONTH))+"/"+(endTime.get(Calendar.MONTH)+1)+"/"+endTime.get(Calendar.YEAR));

        return startTime.get(Calendar.HOUR_OF_DAY)+":"+startTime.get(Calendar.MINUTE)+" à "+endTime.get(Calendar.HOUR_OF_DAY)+":"+endTime.get(Calendar.MINUTE)+" le "+(startTime.get(Calendar.DAY_OF_MONTH))+"/"+(startTime.get(Calendar.MONTH)+1)+"/"+startTime.get(Calendar.YEAR)
                +" jusqu'au "+(endTime.get(Calendar.DAY_OF_MONTH))+"/"+(endTime.get(Calendar.MONTH)+1)+"/"+endTime.get(Calendar.YEAR);

    }

}
