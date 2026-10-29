package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gg2 extends tf2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jg2 f19780b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mq1 f19781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg2(jg2 jg2Var, mq1 mq1Var, String str) {
        super(str);
        this.f19780b = jg2Var;
        this.f19781c = mq1Var;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: f */
    public final yq2 mo5763f(zq2 zq2Var, List list, long j) {
        jg2 jg2Var = this.f19780b;
        eg2 eg2Var = jg2Var.f22237h;
        eg2Var.f18068a = zq2Var.getLayoutDirection();
        eg2Var.f18069b = zq2Var.mo3580c();
        eg2Var.f18070c = zq2Var.mo3585r();
        boolean zMo3587z = zq2Var.mo3587z();
        mq1 mq1Var = this.f19781c;
        byte b = 0;
        if (zMo3587z || jg2Var.f22230a.f33319i == null) {
            jg2Var.f22233d = 0;
            yq2 yq2Var = (yq2) mq1Var.invoke(eg2Var, kl0.m7531a(j));
            int i = jg2Var.f22233d;
            fg2 fg2Var = new fg2((byte) 1);
            fg2Var.f18960c = jg2Var;
            fg2Var.f18961d = i;
            fg2Var.f18962e = yq2Var;
            fg2Var.f18959b = yq2Var;
            VarHandle.storeStoreFence();
            return fg2Var;
        }
        jg2Var.f22234e = 0;
        yq2 yq2Var2 = (yq2) mq1Var.invoke(jg2Var.f22238i, kl0.m7531a(j));
        int i2 = jg2Var.f22234e;
        fg2 fg2Var2 = new fg2(b);
        fg2Var2.f18960c = jg2Var;
        fg2Var2.f18961d = i2;
        fg2Var2.f18962e = yq2Var2;
        fg2Var2.f18959b = yq2Var2;
        VarHandle.storeStoreFence();
        return fg2Var2;
    }
}
