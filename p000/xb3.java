package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xb3 {

    /* JADX INFO: renamed from: a */
    public static final nc4 f34138a = new nc4(new da2(26));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final void m12646a(ej2 ej2Var, C1031pe c1031pe, ym0 ym0Var) {
        vb3 vb3Var;
        if (ym0Var instanceof vb3) {
            vb3Var = (vb3) ym0Var;
            int i = vb3Var.f32508u;
            if ((i & Integer.MIN_VALUE) != 0) {
                vb3Var.f32508u = i - Integer.MIN_VALUE;
            } else {
                vb3Var = new vb3(ym0Var);
            }
        } else {
            vb3Var = new vb3(ym0Var);
        }
        Object obj = vb3Var.f32507t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = vb3Var.f32508u;
        if (i2 != 0) {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                k43.m7376J(obj);
                xy4.m12794w();
                return;
            }
        }
        k43.m7376J(obj);
        if (!ej2Var.f25195a.f25208n) {
            C1077qn.m9987m("establishTextInputSession called from an unattached node");
            return;
        }
        r63 r63VarM10653Y = sc6.m10653Y(ej2Var);
        ga3 ga3Var = (ga3) sc6.m10652X(ej2Var).f33295C;
        ga3Var.getClass();
        if (i25.m6603B(ga3Var, f34138a) != null) {
            xy4.m12778e();
        } else {
            vb3Var.f32508u = 1;
            m12647b(r63VarM10653Y, c1031pe, vb3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final void m12647b(r63 r63Var, mq1 mq1Var, ym0 ym0Var) {
        wb3 wb3Var;
        if (ym0Var instanceof wb3) {
            wb3Var = (wb3) ym0Var;
            int i = wb3Var.f33219u;
            if ((i & Integer.MIN_VALUE) != 0) {
                wb3Var.f33219u = i - Integer.MIN_VALUE;
            } else {
                wb3Var = new wb3(ym0Var);
            }
        } else {
            wb3Var = new wb3(ym0Var);
        }
        Object obj = wb3Var.f33218t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = wb3Var.f33219u;
        if (i2 == 0) {
            k43.m7376J(obj);
            wb3Var.f33219u = 1;
            ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63Var).m10605J(mq1Var, wb3Var);
        } else if (i2 == 1) {
            k43.m7376J(obj);
            xy4.m12794w();
        } else if (i2 != 2) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
        } else {
            k43.m7376J(obj);
            xy4.m12794w();
        }
    }
}
