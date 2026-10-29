package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ms4 implements Comparable {

    /* JADX INFO: renamed from: a */
    public byte f25180a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return z62.m13393u(this.f25180a & 255, ((ms4) obj).f25180a & 255);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ms4) && this.f25180a == ((ms4) obj).f25180a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f25180a);
    }

    public final String toString() {
        return String.valueOf(this.f25180a & 255);
    }
}
