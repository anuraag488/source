package p000;

import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class bp2 {

    /* JADX INFO: renamed from: a */
    public final int f15478a;

    /* JADX INFO: renamed from: b */
    public final cp2 f15479b;

    /* JADX INFO: renamed from: c */
    public final r50 f15480c;

    /* JADX INFO: renamed from: d */
    public int f15481d;

    /* JADX INFO: renamed from: e */
    public int f15482e;

    /* JADX INFO: renamed from: f */
    public int f15483f;

    public bp2(int i) {
        this.f15478a = i;
        if (i <= 0) {
            kx5.m7731r0("maxSize <= 0");
            throw null;
        }
        cp2 cp2Var = new cp2();
        cp2Var.f16332a = new LinkedHashMap(0, 0.75f, true);
        VarHandle.storeStoreFence();
        this.f15479b = cp2Var;
        this.f15480c = new r50((byte) 12);
    }

    /* JADX INFO: renamed from: a */
    public Object mo3646a(Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Object m3648c(Object obj) {
        Object objPut;
        synchronized (this.f15480c) {
            Object obj2 = this.f15479b.f16332a.get(obj);
            if (obj2 != null) {
                this.f15482e++;
                return obj2;
            }
            this.f15483f++;
            Object objMo3646a = mo3646a(obj);
            if (objMo3646a == null) {
                return null;
            }
            synchronized (this.f15480c) {
                try {
                    objPut = this.f15479b.f16332a.put(obj, objMo3646a);
                    if (objPut != null) {
                        this.f15479b.f16332a.put(obj, objPut);
                    } else {
                        this.f15481d += m3651f(obj, objMo3646a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                mo3647b(obj, objMo3646a, objPut);
                return objPut;
            }
            m3653h(this.f15478a);
            return objMo3646a;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m3649d(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.f15480c) {
            this.f15481d += m3651f(obj, obj2);
            objPut = this.f15479b.f16332a.put(obj, obj2);
            if (objPut != null) {
                this.f15481d -= m3651f(obj, objPut);
            }
        }
        if (objPut != null) {
            mo3647b(obj, objPut, obj2);
        }
        m3653h(this.f15478a);
        return objPut;
    }

    /* JADX INFO: renamed from: e */
    public final Object m3650e(Object obj) {
        Object objRemove;
        synchronized (this.f15480c) {
            objRemove = this.f15479b.f16332a.remove(obj);
            if (objRemove != null) {
                this.f15481d -= m3651f(obj, objRemove);
            }
        }
        if (objRemove != null) {
            mo3647b(obj, objRemove, null);
        }
        return objRemove;
    }

    /* JADX INFO: renamed from: f */
    public final int m3651f(Object obj, Object obj2) {
        int iMo3652g = mo3652g(obj, obj2);
        if (iMo3652g >= 0) {
            return iMo3652g;
        }
        throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
    }

    /* JADX INFO: renamed from: g */
    public int mo3652g(Object obj, Object obj2) {
        return 1;
    }

    /* JADX INFO: renamed from: h */
    public final void m3653h(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.f15480c) {
                try {
                    if (this.f15481d < 0 || (this.f15479b.f16332a.isEmpty() && this.f15481d != 0)) {
                        break;
                    }
                    if (this.f15481d > i && !this.f15479b.f16332a.isEmpty()) {
                        Map.Entry entry = (Map.Entry) hb0.m6300L0(this.f15479b.f16332a.entrySet());
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        this.f15479b.f16332a.remove(key);
                        this.f15481d -= m3651f(key, value);
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mo3647b(key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.f15480c) {
            try {
                int i = this.f15482e;
                int i2 = this.f15483f + i;
                str = "LruCache[maxSize=" + this.f15478a + ",hits=" + this.f15482e + ",misses=" + this.f15483f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public void mo3647b(Object obj, Object obj2, Object obj3) {
    }
}
