package p000;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xe1 {

    /* JADX INFO: renamed from: a */
    public final boolean f34190a;

    /* JADX INFO: renamed from: b */
    public final boolean f34191b;

    /* JADX INFO: renamed from: c */
    public final p83 f34192c;

    /* JADX INFO: renamed from: d */
    public final Long f34193d;

    /* JADX INFO: renamed from: e */
    public final Long f34194e;

    /* JADX INFO: renamed from: f */
    public final Long f34195f;

    /* JADX INFO: renamed from: g */
    public final Long f34196g;

    /* JADX INFO: renamed from: h */
    public final Map f34197h;

    public xe1(boolean z, boolean z2, p83 p83Var, Long l, Long l2, Long l3, Long l4, Map map) {
        this.f34190a = z;
        this.f34191b = z2;
        this.f34192c = p83Var;
        this.f34193d = l;
        this.f34194e = l2;
        this.f34195f = l3;
        this.f34196g = l4;
        this.f34197h = eq2.m5278Q(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f34190a) {
            arrayList.add("isRegularFile");
        }
        if (this.f34191b) {
            arrayList.add("isDirectory");
        }
        Long l = this.f34193d;
        if (l != null) {
            arrayList.add("byteCount=" + l.longValue());
        }
        Long l2 = this.f34194e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2.longValue());
        }
        Long l3 = this.f34195f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3.longValue());
        }
        Long l4 = this.f34196g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4.longValue());
        }
        Map map = this.f34197h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return hb0.m6305Q0(arrayList, ", ", "FileMetadata(", ")", 0, null, 56);
    }

    public /* synthetic */ xe1(boolean z, boolean z2, p83 p83Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, p83Var, l, l2, l3, l4, w71.f33134a);
    }
}
