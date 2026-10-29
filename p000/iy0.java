package p000;

import java.io.File;
import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class iy0 implements a24 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21871a = 1;

    /* JADX INFO: renamed from: b */
    public int f21872b;

    /* JADX INFO: renamed from: c */
    public Object f21873c;

    /* JADX INFO: renamed from: d */
    public Object f21874d;

    public iy0(CharSequence charSequence, int i, mq1 mq1Var) {
        this.f21873c = charSequence;
        this.f21872b = i;
        this.f21874d = mq1Var;
    }

    @Override // p000.a24
    public final Iterator iterator() {
        switch (this.f21871a) {
            case 0:
                hy0 hy0Var = new hy0();
                hy0Var.f20935f = this;
                hy0Var.f20930a = -1;
                int iM10675p = sc6.m10675p(0, 0, ((CharSequence) this.f21873c).length());
                hy0Var.f20931b = iM10675p;
                hy0Var.f20932c = iM10675p;
                VarHandle.storeStoreFence();
                return hy0Var;
            default:
                of1 of1Var = new of1();
                of1Var.f26669d = this;
                ArrayDeque arrayDeque = new ArrayDeque();
                of1Var.f26668c = arrayDeque;
                File file = (File) this.f21873c;
                if (file.isDirectory()) {
                    arrayDeque.push(of1Var.m9054a(file));
                } else if (file.isFile()) {
                    arrayDeque.push(new mf1(file));
                } else {
                    of1Var.f26666a = (byte) 2;
                }
                VarHandle.storeStoreFence();
                return of1Var;
        }
    }

    public /* synthetic */ iy0() {
    }
}
