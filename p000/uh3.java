package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uh3 implements n23 {

    /* JADX INFO: renamed from: f */
    public static final Charset f31869f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final pe1 f31870g;

    /* JADX INFO: renamed from: h */
    public static final pe1 f31871h;

    /* JADX INFO: renamed from: i */
    public static final t92 f31872i;

    /* JADX INFO: renamed from: a */
    public OutputStream f31873a;

    /* JADX INFO: renamed from: b */
    public HashMap f31874b;

    /* JADX INFO: renamed from: c */
    public HashMap f31875c;

    /* JADX INFO: renamed from: d */
    public t92 f31876d;

    /* JADX INFO: renamed from: e */
    public vh3 f31877e;

    static {
        z32 z32VarM9500a = pe1.m9500a("key");
        C1264vp c1264vp = new C1264vp();
        c1264vp.f32767a = (byte) 1;
        VarHandle.storeStoreFence();
        z32VarM9500a.m13319Q(c1264vp);
        f31870g = z32VarM9500a.m13325s();
        z32 z32VarM9500a2 = pe1.m9500a("value");
        C1264vp c1264vp2 = new C1264vp();
        c1264vp2.f32767a = (byte) 2;
        VarHandle.storeStoreFence();
        z32VarM9500a2.m13319Q(c1264vp2);
        f31871h = z32VarM9500a2.m13325s();
        f31872i = new t92((byte) 1);
    }

    /* JADX INFO: renamed from: k */
    public static int m11544k(pe1 pe1Var) {
        qh3 qh3Var = (qh3) ((Annotation) pe1Var.f27562b.get(qh3.class));
        if (qh3Var != null) {
            return qh3Var.tag();
        }
        throw new k81("Field has no @Protobuf config");
    }

    @Override // p000.n23
    /* JADX INFO: renamed from: a */
    public final n23 mo8479a(pe1 pe1Var, Object obj) {
        m11548i(pe1Var, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m11545b(pe1 pe1Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        m11550l((m11544k(pe1Var) << 3) | 1);
        this.f31873a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    /* JADX INFO: renamed from: c */
    public final void m11546c(pe1 pe1Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        qh3 qh3Var = (qh3) ((Annotation) pe1Var.f27562b.get(qh3.class));
        if (qh3Var == null) {
            throw new k81("Field has no @Protobuf config");
        }
        int iOrdinal = qh3Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            m11550l(qh3Var.tag() << 3);
            m11550l(i);
        } else if (iOrdinal == 1) {
            m11550l(qh3Var.tag() << 3);
            m11550l((i << 1) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m11550l((qh3Var.tag() << 3) | 5);
            this.f31873a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    @Override // p000.n23
    /* JADX INFO: renamed from: d */
    public final n23 mo8480d(pe1 pe1Var, boolean z) {
        m11546c(pe1Var, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.n23
    /* JADX INFO: renamed from: e */
    public final n23 mo8481e(pe1 pe1Var, int i) {
        m11546c(pe1Var, i, true);
        return this;
    }

    @Override // p000.n23
    /* JADX INFO: renamed from: f */
    public final n23 mo8482f(pe1 pe1Var, double d) throws IOException {
        m11545b(pe1Var, d, true);
        return this;
    }

    @Override // p000.n23
    /* JADX INFO: renamed from: g */
    public final n23 mo8483g(pe1 pe1Var, long j) throws IOException {
        m11547h(pe1Var, j, true);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m11547h(pe1 pe1Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        qh3 qh3Var = (qh3) ((Annotation) pe1Var.f27562b.get(qh3.class));
        if (qh3Var == null) {
            throw new k81("Field has no @Protobuf config");
        }
        int iOrdinal = qh3Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            m11550l(qh3Var.tag() << 3);
            m11551m(j);
        } else if (iOrdinal == 1) {
            m11550l(qh3Var.tag() << 3);
            m11551m((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m11550l((qh3Var.tag() << 3) | 1);
            this.f31873a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11548i(pe1 pe1Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            m11550l((m11544k(pe1Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f31869f);
            m11550l(bytes.length);
            this.f31873a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m11548i(pe1Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m11549j(f31872i, pe1Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m11545b(pe1Var, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            m11550l((m11544k(pe1Var) << 3) | 5);
            this.f31873a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            m11547h(pe1Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            m11546c(pe1Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            m11550l((m11544k(pe1Var) << 3) | 2);
            m11550l(bArr.length);
            this.f31873a.write(bArr);
            return;
        }
        m23 m23Var = (m23) this.f31874b.get(obj.getClass());
        if (m23Var != null) {
            m11549j(m23Var, pe1Var, obj, z);
            return;
        }
        lw4 lw4Var = (lw4) this.f31875c.get(obj.getClass());
        if (lw4Var != null) {
            vh3 vh3Var = this.f31877e;
            vh3Var.f32620a = false;
            vh3Var.f32622c = pe1Var;
            vh3Var.f32621b = z;
            lw4Var.mo3114a(obj, vh3Var);
            return;
        }
        if (obj instanceof ln2) {
            m11546c(pe1Var, ((ln2) obj).f24206a, true);
        } else if (obj instanceof Enum) {
            m11546c(pe1Var, ((Enum) obj).ordinal(), true);
        } else {
            m11549j(this.f31876d, pe1Var, obj, z);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m11549j(m23 m23Var, pe1 pe1Var, Object obj, boolean z) throws IOException {
        xj2 xj2Var = new xj2();
        xj2Var.f34321a = 0L;
        try {
            OutputStream outputStream = this.f31873a;
            this.f31873a = xj2Var;
            try {
                m23Var.mo3114a(obj, this);
                this.f31873a = outputStream;
                long j = xj2Var.f34321a;
                xj2Var.close();
                if (z && j == 0) {
                    return;
                }
                m11550l((m11544k(pe1Var) << 3) | 2);
                m11551m(j);
                m23Var.mo3114a(obj, this);
            } catch (Throwable th) {
                this.f31873a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                xj2Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m11550l(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.f31873a;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11551m(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.f31873a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
