package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a72 extends ap3 {

    /* JADX INFO: renamed from: t */
    public byte f146t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ mq1 f147u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ wm0 f148v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a72(wm0 wm0Var, wm0 wm0Var2, mq1 mq1Var) {
        super(wm0Var);
        this.f147u = mq1Var;
        this.f148v = wm0Var2;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f146t;
        if (b == 0) {
            this.f146t = (byte) 1;
            k43.m7376J(obj);
            mq1 mq1Var = this.f147u;
            as4.m3259r(2, mq1Var);
            return mq1Var.invoke(this.f148v, this);
        }
        if (b != 1) {
            C1077qn.m9989o("This coroutine had already completed");
            return null;
        }
        this.f146t = (byte) 2;
        k43.m7376J(obj);
        return obj;
    }
}
