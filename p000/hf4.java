package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hf4 implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ nt2 f20532a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ p44 f20533b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ long f20534c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ float f20535d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ float f20536e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ pg0 f20537f;

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        nt2 nt2Var = this.f20532a;
        p44 p44Var = this.f20533b;
        long j = this.f20534c;
        float f = this.f20535d;
        float f2 = this.f20536e;
        pg0 pg0Var = this.f20537f;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6871T = ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2);
        ju4 ju4Var = ju4.f22634a;
        if (!zM6871T) {
            ir1Var.m6874W();
            return ju4Var;
        }
        nt2 nt2VarM7513c = kf4.m7513c(nt2Var, p44Var, kf4.m7514d(j, f, ir1Var), null, ((ky0) ir1Var.m6898k(ij0.f21473h)).mo3575E(f2));
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = new r54((byte) 6);
            ir1Var.m6905n0(objM6869O);
        }
        nt2 nt2VarM5458a = f14.m5458a(nt2VarM7513c, false, (yp1) objM6869O);
        Object objM6869O2 = ir1Var.m6869O();
        if (objM6869O2 == i50Var) {
            objM6869O2 = C0765il.f21524d;
            ir1Var.m6905n0(objM6869O2);
        }
        nt2 nt2VarM10327a = rf4.m10327a(nt2VarM5458a, ju4Var, (PointerInputEventHandler) objM6869O2);
        xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, true);
        int iHashCode = Long.hashCode(ir1Var.f21683T);
        ga3 ga3VarM6902m = ir1Var.m6902m();
        nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM10327a);
        bi0.f15310ap.getClass();
        if (ir1Var.f21685a == null) {
            dt0.m4682E();
            throw null;
        }
        ir1Var.m6893h0();
        if (ir1Var.f21682S) {
            ir1Var.m6900l(wf2.f33290T);
        } else {
            ir1Var.m6911q0();
        }
        C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
        C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
        C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
        C0006a5.m50F(ir1Var);
        C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
        pg0Var.invoke(ir1Var, 0);
        ir1Var.m6912r(true);
        return ju4Var;
    }
}
