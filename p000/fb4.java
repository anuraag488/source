package p000;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fb4 extends uq4 {

    /* JADX INFO: renamed from: b */
    public static final C0645a f18895b = new C0645a();

    /* JADX INFO: renamed from: a */
    public final SimpleDateFormat f18896a;

    /* JADX INFO: renamed from: fb4$a */
    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public class C0645a implements vq4 {
        @Override // p000.vq4
        /* JADX INFO: renamed from: a */
        public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
            if (cs4Var.f16429a == Time.class) {
                return new fb4(0);
            }
            return null;
        }
    }

    private fb4() {
        this.f18896a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        Time time;
        if (kb2Var.mo7481R() == 9) {
            kb2Var.mo7477N();
            return null;
        }
        String strMo7479P = kb2Var.mo7479P();
        synchronized (this) {
            TimeZone timeZone = this.f18896a.getTimeZone();
            try {
                try {
                    time = new Time(this.f18896a.parse(strMo7479P).getTime());
                    this.f18896a.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new lb2("Failed parsing '" + strMo7479P + "' as SQL Time; at path " + kb2Var.mo7500u(), e);
                }
            } catch (Throwable th) {
                this.f18896a.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            yb2Var.mo12211t();
            return;
        }
        synchronized (this) {
            str = this.f18896a.format((Date) time);
        }
        yb2Var.mo12202L(str);
    }

    public /* synthetic */ fb4(int i) {
        this();
    }
}
