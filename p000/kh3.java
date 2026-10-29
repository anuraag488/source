package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class kh3 extends i60 implements ic2 {

    /* JADX INFO: renamed from: b */
    public final boolean f23129b;

    public kh3(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f23129b = false;
    }

    @Override // p000.i60
    public final ac2 compute() {
        return this.f23129b ? this : super.compute();
    }

    /* JADX INFO: renamed from: e */
    public final ic2 m7520e() {
        if (this.f23129b) {
            qm5.m9919j("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        ac2 ac2VarCompute = compute();
        if (ac2VarCompute != this) {
            return (ic2) ac2VarCompute;
        }
        throw new oe2("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kh3) {
            kh3 kh3Var = (kh3) obj;
            return getOwner().equals(kh3Var.getOwner()) && getName().equals(kh3Var.getName()) && getSignature().equals(kh3Var.getSignature()) && z62.m13387o(this.receiver, kh3Var.receiver);
        }
        if (obj instanceof ic2) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        ac2 ac2VarCompute = compute();
        if (ac2VarCompute != this) {
            return ac2VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
