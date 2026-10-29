package p000;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rv0 extends uq4 {

    /* JADX INFO: renamed from: c */
    public static final ov0 f29656c = new ov0();

    /* JADX INFO: renamed from: a */
    public qv0 f29657a;

    /* JADX INFO: renamed from: b */
    public ArrayList f29658b;

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        Date dateM3382b;
        if (kb2Var.mo7481R() == 9) {
            kb2Var.mo7477N();
            return null;
        }
        String strMo7479P = kb2Var.mo7479P();
        synchronized (this.f29658b) {
            try {
                ArrayList arrayList = this.f29658b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    DateFormat dateFormat = (DateFormat) obj;
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateM3382b = dateFormat.parse(strMo7479P);
                            dateFormat.setTimeZone(timeZone);
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (Throwable th) {
                        dateFormat.setTimeZone(timeZone);
                        throw th;
                    }
                }
                try {
                    dateM3382b = b02.m3382b(strMo7479P, new ParsePosition(0));
                } catch (ParseException e) {
                    StringBuilder sbM10844j = sk5.m10844j("Failed parsing '", strMo7479P, "' as Date; at path ");
                    sbM10844j.append(kb2Var.mo7500u());
                    throw new lb2(sbM10844j.toString(), e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f29657a.mo6740a(dateM3382b);
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            yb2Var.mo12211t();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f29658b.get(0);
        synchronized (this.f29658b) {
            str = dateFormat.format(date);
        }
        yb2Var.mo12202L(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f29658b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
