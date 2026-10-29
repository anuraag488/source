package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ju */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0811ju {

    /* JADX INFO: renamed from: a */
    public String f22614a;

    /* JADX INFO: renamed from: b */
    public String f22615b;

    /* JADX INFO: renamed from: a */
    public static C0811ju m7283a(String str, String str2) {
        C0811ju c0811ju = new C0811ju();
        c0811ju.f22614a = str;
        if (str2 == null) {
            xy4.m12782k("Null version");
            return null;
        }
        c0811ju.f22615b = str2;
        VarHandle.storeStoreFence();
        return c0811ju;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0811ju) {
            C0811ju c0811ju = (C0811ju) obj;
            if (this.f22614a.equals(c0811ju.f22614a) && this.f22615b.equals(c0811ju.f22615b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22615b.hashCode() ^ ((this.f22614a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f22614a);
        sb.append(", version=");
        return zi4.m13623w(sb, this.f22615b, "}");
    }
}
