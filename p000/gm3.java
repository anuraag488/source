package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gm3 extends x12 {

    /* JADX INFO: renamed from: d */
    public final transient jm3 f19881d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f19882e;

    /* JADX INFO: renamed from: f */
    public final transient int f19883f;

    public gm3(jm3 jm3Var, Object[] objArr, int i) {
        this.f19881d = jm3Var;
        this.f19882e = objArr;
        this.f19883f = i;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: b */
    public final int mo5199b(Object[] objArr) {
        return mo6445a().mo5199b(objArr);
    }

    @Override // p000.o12, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f19881d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: g */
    public final boolean mo5203g() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: l */
    public final ru4 iterator() {
        return mo6445a().listIterator(0);
    }

    @Override // p000.x12
    /* JADX INFO: renamed from: r */
    public final u12 mo6039r() {
        return new fm3(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19883f;
    }
}
