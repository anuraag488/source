package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class vp2 implements Map.Entry, cc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32771a = 1;

    /* JADX INFO: renamed from: b */
    public Object f32772b;

    /* JADX INFO: renamed from: c */
    public Object f32773c;

    public vp2(Object obj, Object obj2) {
        this.f32772b = obj;
        this.f32773c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f32771a) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && z62.m13387o(entry.getKey(), this.f32772b) && z62.m13387o(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f32771a) {
            case 0:
                break;
        }
        return this.f32772b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f32771a) {
            case 0:
                break;
        }
        return this.f32773c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f32771a) {
            case 0:
                Object obj = this.f32772b;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f32771a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f32771a) {
            case 0:
                return this.f32772b + "=" + getValue();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ vp2() {
    }
}
