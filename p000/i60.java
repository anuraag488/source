package p000;

import java.io.Serializable;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class i60 implements ac2, Serializable {
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient ac2 reflected;
    private final String signature;

    public i60(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    /* JADX INFO: renamed from: b */
    public ac2 mo6399b() {
        rl3.f29396a.getClass();
        return this;
    }

    public ac2 compute() {
        ac2 ac2Var = this.reflected;
        if (ac2Var != null) {
            return ac2Var;
        }
        ac2 ac2VarMo6399b = mo6399b();
        this.reflected = ac2VarMo6399b;
        return ac2VarMo6399b;
    }

    public final String getName() {
        return this.name;
    }

    public final p90 getOwner() {
        boolean z = this.isTopLevel;
        Class cls = this.owner;
        if (!z) {
            return rl3.m10361a(cls);
        }
        rl3.f29396a.getClass();
        z63 z63Var = new z63();
        z63Var.f35792a = cls;
        VarHandle.storeStoreFence();
        return z63Var;
    }

    public final String getSignature() {
        return this.signature;
    }
}
