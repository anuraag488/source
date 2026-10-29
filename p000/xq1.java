package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class xq1 extends i60 implements wq1, ac2, iq1 {
    private final byte arity;

    /* JADX WARN: Multi-variable type inference failed */
    public xq1(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xq1) {
            xq1 xq1Var = (xq1) obj;
            return getName().equals(xq1Var.getName()) && getSignature().equals(xq1Var.getSignature()) && z62.m13387o(this.receiver, xq1Var.receiver) && getOwner().equals(xq1Var.getOwner());
        }
        if (obj instanceof xq1) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // p000.wq1
    public final int getArity() {
        return this.arity;
    }

    public final int hashCode() {
        getOwner();
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        ac2 ac2VarCompute = compute();
        if (ac2VarCompute != this) {
            return ac2VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public xq1(int i, Class cls, String str, String str2, int i2) {
        this(i, h60.f20405a, cls, str, str2, i2);
    }
}
