package p000;

import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z35 extends AbstractC0640f7 {

    /* JADX INFO: renamed from: a */
    public C0641f8 f35742a;

    /* JADX INFO: renamed from: b */
    public int f35743b;

    /* JADX INFO: renamed from: b */
    public static z35 m13330b(C0641f8 c0641f8, int i) throws GeneralSecurityException {
        if (i < 8 || i > 12) {
            xy4.m12788q("Salt size must be between 8 and 12 bytes");
            return null;
        }
        z35 z35Var = new z35();
        z35Var.f35742a = c0641f8;
        z35Var.f35743b = i;
        VarHandle.storeStoreFence();
        return z35Var;
    }

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f35742a != C0641f8.f18825z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z35)) {
            return false;
        }
        z35 z35Var = (z35) obj;
        return z35Var.f35742a == this.f35742a && z35Var.f35743b == this.f35743b;
    }

    public final int hashCode() {
        return Objects.hash(z35.class, this.f35742a, Integer.valueOf(this.f35743b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("X-AES-GCM Parameters (variant: ");
        sb.append(this.f35742a);
        sb.append("salt_size_bytes: ");
        return c75.m3880l(sb, this.f35743b, ")");
    }
}
