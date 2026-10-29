package p000;

import java.util.List;

/* JADX INFO: renamed from: jt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0810jt extends gq0 {

    /* JADX INFO: renamed from: a */
    public String f22597a;

    /* JADX INFO: renamed from: b */
    public int f22598b;

    /* JADX INFO: renamed from: c */
    public List f22599c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gq0) {
            C0810jt c0810jt = (C0810jt) ((gq0) obj);
            if (this.f22597a.equals(c0810jt.f22597a) && this.f22598b == c0810jt.f22598b && this.f22599c.equals(c0810jt.f22599c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22599c.hashCode() ^ ((((this.f22597a.hashCode() ^ 1000003) * 1000003) ^ this.f22598b) * 1000003);
    }

    public final String toString() {
        return "Thread{name=" + this.f22597a + ", importance=" + this.f22598b + ", frames=" + this.f22599c + "}";
    }
}
