package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wg0 implements sq1 {
    @Override // p000.sq1
    /* JADX INFO: renamed from: a */
    public final Object mo9512a(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, ir1 ir1Var, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        om0 om0Var = (om0) obj2;
        nq1 nq1Var = (nq1) obj3;
        wp1 wp1Var = (wp1) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        kt2 kt2Var = kt2.f23428a;
        if (i2 == 0) {
            i = (ir1Var.m6890g(kt2Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ir1Var.m6890g(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= ir1Var.m6892h(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= ir1Var.m6890g(om0Var) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= ir1Var.m6894i(nq1Var) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= ir1Var.m6894i(wp1Var) ? 131072 : 65536;
        }
        if (ir1Var.m6871T(i & 1, (599187 & i) != 599186)) {
            tm0.m11063c(str, zBooleanValue, om0Var, kt2Var, nq1Var, wp1Var, ir1Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
