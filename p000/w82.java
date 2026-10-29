package p000;

import java.lang.invoke.VarHandle;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class w82 extends fn2 implements w01, c22 {

    /* JADX INFO: renamed from: d */
    public e92 f33153d;

    @Override // p000.w01
    /* JADX INFO: renamed from: a */
    public final void mo3937a() {
        Object objM4983O;
        e92 e92VarM12167m = m12167m();
        do {
            objM4983O = e92VarM12167m.m4983O();
            if (objM4983O instanceof w82) {
                if (objM4983O != this) {
                    return;
                }
            } else {
                if (!(objM4983O instanceof c22) || ((c22) objM4983O).mo148d() == null) {
                    return;
                }
                while (true) {
                    Object objM5752i = this.m5752i();
                    if (objM5752i instanceof bn3) {
                        return;
                    }
                    if (objM5752i == this) {
                        return;
                    }
                    fn2 fn2Var = (fn2) objM5752i;
                    Unsafe unsafe = AbstractC1078qo.f28633a;
                    long j = fn2.f19133c;
                    bn3 bn3Var = (bn3) unsafe.getObjectVolatile(fn2Var, j);
                    if (bn3Var == null) {
                        bn3Var = new bn3();
                        bn3Var.f15436a = fn2Var;
                        VarHandle.storeStoreFence();
                        unsafe.putObjectVolatile(fn2Var, j, bn3Var);
                    }
                    w82 w82Var = this;
                    if (unsafe.compareAndSwapObject(w82Var, fn2.f19131a, objM5752i, bn3Var)) {
                        fn2Var.m5750g();
                        return;
                    }
                    this = w82Var;
                }
            }
        } while (!AbstractC1078qo.f28633a.compareAndSwapObject(e92VarM12167m, e92.f17908b, objM4983O, f92.f18861g));
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: b */
    public final boolean mo146b() {
        return true;
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: d */
    public final g13 mo148d() {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final e92 m12167m() {
        e92 e92Var = this.f33153d;
        if (e92Var != null) {
            return e92Var;
        }
        z62.m13366Y("job");
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo3514n() {
        return true;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo3515o(Throwable th);

    @Override // p000.fn2
    public final String toString() {
        return getClass().getSimpleName() + '@' + ev0.m5354d0(this) + "[job@" + ev0.m5354d0(m12167m()) + ']';
    }
}
