package p000;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xb2 implements n23, mw4 {

    /* JADX INFO: renamed from: a */
    public boolean f34132a;

    /* JADX INFO: renamed from: b */
    public JsonWriter f34133b;

    /* JADX INFO: renamed from: c */
    public HashMap f34134c;

    /* JADX INFO: renamed from: d */
    public HashMap f34135d;

    /* JADX INFO: renamed from: e */
    public t92 f34136e;

    /* JADX INFO: renamed from: f */
    public boolean f34137f;

    @Override // p000.n23
    /* JADX INFO: renamed from: a */
    public final n23 mo8479a(pe1 pe1Var, Object obj) throws IOException {
        m12644i(obj, pe1Var.f27561a);
        return this;
    }

    @Override // p000.mw4
    /* JADX INFO: renamed from: b */
    public final mw4 mo8422b(String str) throws IOException {
        m12645j();
        this.f34133b.value(str);
        return this;
    }

    @Override // p000.mw4
    /* JADX INFO: renamed from: c */
    public final mw4 mo8423c(boolean z) throws IOException {
        m12645j();
        this.f34133b.value(z);
        return this;
    }

    @Override // p000.n23
    /* JADX INFO: renamed from: d */
    public final n23 mo8480d(pe1 pe1Var, boolean z) throws IOException {
        String str = pe1Var.f27561a;
        m12645j();
        JsonWriter jsonWriter = this.f34133b;
        jsonWriter.name(str);
        m12645j();
        jsonWriter.value(z);
        return this;
    }

    @Override // p000.n23
    /* JADX INFO: renamed from: e */
    public final n23 mo8481e(pe1 pe1Var, int i) throws IOException {
        String str = pe1Var.f27561a;
        m12645j();
        JsonWriter jsonWriter = this.f34133b;
        jsonWriter.name(str);
        m12645j();
        jsonWriter.value(i);
        return this;
    }

    @Override // p000.n23
    /* JADX INFO: renamed from: f */
    public final n23 mo8482f(pe1 pe1Var, double d) throws IOException {
        String str = pe1Var.f27561a;
        m12645j();
        JsonWriter jsonWriter = this.f34133b;
        jsonWriter.name(str);
        m12645j();
        jsonWriter.value(d);
        return this;
    }

    @Override // p000.n23
    /* JADX INFO: renamed from: g */
    public final n23 mo8483g(pe1 pe1Var, long j) throws IOException {
        String str = pe1Var.f27561a;
        m12645j();
        JsonWriter jsonWriter = this.f34133b;
        jsonWriter.name(str);
        m12645j();
        jsonWriter.value(j);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final xb2 m12643h(Object obj) {
        JsonWriter jsonWriter = this.f34133b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m12643h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m12644i(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new k81(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            m23 m23Var = (m23) this.f34134c.get(obj.getClass());
            if (m23Var != null) {
                jsonWriter.beginObject();
                m23Var.mo3114a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            lw4 lw4Var = (lw4) this.f34135d.get(obj.getClass());
            if (lw4Var != null) {
                lw4Var.mo3114a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                t92 t92Var = this.f34136e;
                jsonWriter.beginObject();
                t92Var.mo3114a(obj, this);
                throw null;
            }
            if (obj instanceof k23) {
                int number = ((k23) obj).getNumber();
                m12645j();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj).name();
            m12645j();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            m12645j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                m12645j();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                m12643h(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                m12643h(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final xb2 m12644i(Object obj, String str) throws IOException {
        JsonWriter jsonWriter = this.f34133b;
        if (this.f34137f) {
            if (obj == null) {
                return this;
            }
            m12645j();
            jsonWriter.name(str);
            m12643h(obj);
            return this;
        }
        m12645j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        m12643h(obj);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m12645j() {
        if (this.f34132a) {
            return;
        }
        C1077qn.m9989o("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
