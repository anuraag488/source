package p000;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class nr4 extends uq4 {
    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        if (kb2Var.mo7481R() == 9) {
            kb2Var.mo7477N();
            return null;
        }
        kb2Var.mo7492b();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (kb2Var.mo7481R() == 4) {
                kb2Var.mo7496k();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }
            String strMo7475L = kb2Var.mo7475L();
            int iMo7473J = kb2Var.mo7473J();
            strMo7475L.getClass();
            switch (strMo7475L) {
                case "dayOfMonth":
                    i3 = iMo7473J;
                    break;
                case "minute":
                    i5 = iMo7473J;
                    break;
                case "second":
                    i6 = iMo7473J;
                    break;
                case "year":
                    i = iMo7473J;
                    break;
                case "month":
                    i2 = iMo7473J;
                    break;
                case "hourOfDay":
                    i4 = iMo7473J;
                    break;
            }
        }
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            yb2Var.mo12211t();
            return;
        }
        yb2Var.mo12207e();
        yb2Var.mo12210l("year");
        yb2Var.mo12199D(calendar.get(1));
        yb2Var.mo12210l("month");
        yb2Var.mo12199D(calendar.get(2));
        yb2Var.mo12210l("dayOfMonth");
        yb2Var.mo12199D(calendar.get(5));
        yb2Var.mo12210l("hourOfDay");
        yb2Var.mo12199D(calendar.get(11));
        yb2Var.mo12210l("minute");
        yb2Var.mo12199D(calendar.get(12));
        yb2Var.mo12210l("second");
        yb2Var.mo12199D(calendar.get(13));
        yb2Var.mo12209k();
    }
}
