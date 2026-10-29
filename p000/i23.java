package p000;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i23 implements vq4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21062a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ uq4 f21063b;

    public /* synthetic */ i23(byte b) {
        this.f21062a = b;
    }

    @Override // p000.vq4
    /* JADX INFO: renamed from: a */
    public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
        switch (this.f21062a) {
            case 0:
                if (cs4Var.f16429a == Number.class) {
                    return (j23) this.f21063b;
                }
                return null;
            default:
                Class cls = cs4Var.f16429a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (nr4) this.f21063b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f21062a) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((nr4) this.f21063b) + "]";
            default:
                return super.toString();
        }
    }
}
