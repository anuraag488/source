package p000;

import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yr5 extends lc6 {

    /* JADX INFO: renamed from: g */
    public long f35481g;

    /* JADX INFO: renamed from: h */
    public String f35482h;

    @Override // p000.lc6
    /* JADX INFO: renamed from: u */
    public final boolean mo4615u() {
        Calendar calendar = Calendar.getInstance();
        this.f35481g = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f35482h = c75.m3881m(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final long m13228y() {
        m7955v();
        return this.f35481g;
    }

    /* JADX INFO: renamed from: z */
    public final String m13229z() {
        m7955v();
        return this.f35482h;
    }
}
