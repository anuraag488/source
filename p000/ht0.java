package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ht0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public ArrayList f20836t;

    /* JADX INFO: renamed from: u */
    public ql3 f20837u;

    /* JADX INFO: renamed from: v */
    public Iterator f20838v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f20839w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ q50 f20840x;

    /* JADX INFO: renamed from: y */
    public int f20841y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(q50 q50Var, ym0 ym0Var) {
        super(ym0Var);
        this.f20840x = q50Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f20839w = obj;
        this.f20841y |= Integer.MIN_VALUE;
        return this.f20840x.m9732l(null, null, this);
    }
}
