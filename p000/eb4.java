package p000;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eb4 extends uq4 {

    /* JADX INFO: renamed from: b */
    public static final C0606a f17953b = new C0606a();

    /* JADX INFO: renamed from: a */
    public final SimpleDateFormat f17954a;

    /* JADX INFO: renamed from: eb4$a */
    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public class C0606a implements vq4 {
        @Override // p000.vq4
        /* JADX INFO: renamed from: a */
        public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
            if (cs4Var.f16429a == Date.class) {
                return new eb4(0);
            }
            return null;
        }
    }

    private eb4() {
        this.f17954a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        Date date;
        if (kb2Var.mo7481R() == 9) {
            kb2Var.mo7477N();
            return null;
        }
        String strMo7479P = kb2Var.mo7479P();
        synchronized (this) {
            TimeZone timeZone = this.f17954a.getTimeZone();
            try {
                try {
                    date = new Date(this.f17954a.parse(strMo7479P).getTime());
                    this.f17954a.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new lb2("Failed parsing '" + strMo7479P + "' as SQL Date; at path " + kb2Var.mo7500u(), e);
                }
            } catch (Throwable th) {
                this.f17954a.setTimeZone(timeZone);
                throw th;
            }
        }
        return date;
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
        synchronized (this) {
            str = this.f17954a.format((java.util.Date) date);
        }
        yb2Var.mo12202L(str);
    }

    public /* synthetic */ eb4(int i) {
        this();
    }
}
