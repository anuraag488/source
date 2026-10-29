package p000;

import java.io.Serializable;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dp3 implements Serializable {

    /* JADX INFO: renamed from: a */
    public Object f17257a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ dp3 m4637a(Object obj) {
        dp3 dp3Var = new dp3();
        dp3Var.f17257a = obj;
        VarHandle.storeStoreFence();
        return dp3Var;
    }

    /* JADX INFO: renamed from: b */
    public static final Throwable m4638b(Object obj) {
        if (obj instanceof cp3) {
            return ((cp3) obj).f16333a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dp3) && z62.m13387o(this.f17257a, ((dp3) obj).f17257a);
    }

    public final int hashCode() {
        Object obj = this.f17257a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f17257a;
        if (obj instanceof cp3) {
            return ((cp3) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
