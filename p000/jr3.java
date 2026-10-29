package p000;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jr3 {

    /* JADX INFO: renamed from: a */
    public C1394z6 f22543a;

    /* JADX INFO: renamed from: b */
    public Proxy f22544b;

    /* JADX INFO: renamed from: c */
    public InetSocketAddress f22545c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof jr3)) {
            return false;
        }
        jr3 jr3Var = (jr3) obj;
        return jr3Var.f22543a.equals(this.f22543a) && jr3Var.f22544b.equals(this.f22544b) && jr3Var.f22545c.equals(this.f22545c);
    }

    public final int hashCode() {
        return this.f22545c.hashCode() + ((this.f22544b.hashCode() + ((this.f22543a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f22545c + '}';
    }
}
