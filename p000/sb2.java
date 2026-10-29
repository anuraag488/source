package p000;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sb2 extends ym0 {

    /* JADX INFO: renamed from: t */
    public nv0 f30052t;

    /* JADX INFO: renamed from: u */
    public tb2 f30053u;

    /* JADX INFO: renamed from: v */
    public LinkedHashMap f30054v;

    /* JADX INFO: renamed from: w */
    public String f30055w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f30056x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ tb2 f30057y;

    /* JADX INFO: renamed from: z */
    public int f30058z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb2(tb2 tb2Var, AbstractC0888lx abstractC0888lx) {
        super(abstractC0888lx);
        this.f30057y = tb2Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f30056x = obj;
        this.f30058z |= Integer.MIN_VALUE;
        return this.f30057y.m11021c(null, this);
    }
}
