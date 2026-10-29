package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class xi1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f34300t;

    /* JADX INFO: renamed from: u */
    public int f34301u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ yi1 f34302v;

    /* JADX INFO: renamed from: w */
    public ti1 f34303w;

    /* JADX INFO: renamed from: x */
    public Serializable f34304x;

    /* JADX INFO: renamed from: y */
    public int f34305y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi1(yi1 yi1Var, wm0 wm0Var) {
        super(wm0Var);
        this.f34302v = yi1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f34300t = obj;
        this.f34301u |= Integer.MIN_VALUE;
        return this.f34302v.collect(null, this);
    }
}
