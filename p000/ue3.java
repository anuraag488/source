package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ue3 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ye3 f31808a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f31809b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f31810c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ sw2 f31811d;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ye3 ye3Var = this.f31808a;
        long j = this.f31809b;
        List list = this.f31810c;
        sw2 sw2Var = this.f31811d;
        yp1 yp1Var = (yp1) obj;
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((ir1) mi0Var).m6894i(yp1Var) ? 4 : 2;
        }
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
            nc4 nc4Var = ze3.f36022a;
            wp1 wp1Var = (wp1) sw2Var.getValue();
            int i = pe3.f27565d;
            AbstractC0647fd.m5666d(ye3Var, wp1Var, j, list, false, yp1Var, ir1Var, (iIntValue << 15) & 458752);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
