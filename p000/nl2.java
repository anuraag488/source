package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nl2 extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pl2 f25932b;

    public /* synthetic */ nl2(pl2 pl2Var, byte b) {
        this.f25931a = b;
        this.f25932b = pl2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.f25931a;
        pl2 pl2Var = this.f25932b;
        switch (b) {
            case 0:
                pl2Var.clear();
                break;
            default:
                pl2Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        ol2 ol2VarM9561a;
        byte b = this.f25931a;
        pl2 pl2Var = this.f25932b;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                ol2 ol2Var = null;
                if (key != null) {
                    try {
                        ol2VarM9561a = pl2Var.m9561a(key, false);
                    } catch (ClassCastException unused) {
                        ol2VarM9561a = null;
                    }
                    break;
                } else {
                    ol2VarM9561a = null;
                }
                if (ol2VarM9561a != null && Objects.equals(ol2VarM9561a.f26849h, entry.getValue())) {
                    ol2Var = ol2VarM9561a;
                }
                return ol2Var != null;
            default:
                return pl2Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.f25931a;
        pl2 pl2Var = this.f25932b;
        switch (b) {
            case 0:
                return new ml2(pl2Var, (byte) 0);
            default:
                return new ml2(pl2Var, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ol2 ol2VarM9561a;
        byte b = this.f25931a;
        ol2 ol2VarM9561a2 = null;
        pl2 pl2Var = this.f25932b;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        ol2VarM9561a = pl2Var.m9561a(key, false);
                    } catch (ClassCastException unused) {
                        ol2VarM9561a = null;
                    }
                    break;
                } else {
                    ol2VarM9561a = null;
                }
                if (ol2VarM9561a != null && Objects.equals(ol2VarM9561a.f26849h, entry.getValue())) {
                    ol2VarM9561a2 = ol2VarM9561a;
                }
                if (ol2VarM9561a2 == null) {
                    return false;
                }
                pl2Var.m9563c(ol2VarM9561a2, true);
                return true;
            default:
                if (obj != null) {
                    try {
                        ol2VarM9561a2 = pl2Var.m9561a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (ol2VarM9561a2 != null) {
                    pl2Var.m9563c(ol2VarM9561a2, true);
                }
                return ol2VarM9561a2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.f25931a;
        pl2 pl2Var = this.f25932b;
        switch (b) {
            case 0:
                break;
        }
        return pl2Var.f27731d;
    }
}
