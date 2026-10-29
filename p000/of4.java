package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class of4 extends ym0 implements wq1 {
    private final byte arity;

    /* JADX WARN: Multi-variable type inference failed */
    public of4(int i, wm0 wm0Var) {
        super(wm0Var);
        this.arity = i;
    }

    @Override // p000.wq1
    public final int getArity() {
        return this.arity;
    }

    @Override // p000.AbstractC0888lx
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        rl3.f29396a.getClass();
        return sl3.m10870a(this);
    }
}
