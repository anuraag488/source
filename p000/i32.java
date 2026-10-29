package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i32 {

    /* JADX INFO: renamed from: a */
    public uw2 f21094a;

    /* JADX INFO: renamed from: b */
    public d83 f21095b;

    /* JADX INFO: renamed from: c */
    public long f21096c;

    /* JADX INFO: renamed from: d */
    public d83 f21097d;

    /* JADX INFO: renamed from: a */
    public final void m6636a(int i, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-318043801);
        int i2 = i | (ir1Var.m6894i(this) ? 4 : 2);
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            Object objM6869O = ir1Var.m6869O();
            wm0 wm0Var = null;
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = k43.m7398w(null);
                ir1Var.m6905n0(objM6869O);
            }
            sw2 sw2Var = (sw2) objM6869O;
            if (((Boolean) this.f21097d.getValue()).booleanValue() || ((Boolean) this.f21095b.getValue()).booleanValue()) {
                ir1Var.m6885d0(-144841960);
                boolean zM6894i = ir1Var.m6894i(this);
                Object objM6869O2 = ir1Var.m6869O();
                if (zM6894i || objM6869O2 == i50Var) {
                    objM6869O2 = new C1312wz((Object) sw2Var, (Object) this, wm0Var, (byte) 3);
                    ir1Var.m6905n0(objM6869O2);
                }
                lb5.m7926g(ir1Var, (mq1) objM6869O2, this);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(-143455237);
                ir1Var.m6912r(false);
            }
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1017p0 c1017p0 = new C1017p0((byte) 22);
            c1017p0.f27254b = this;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1017p0;
        }
    }
}
