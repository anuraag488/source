package p000;

import ads_mobile_sdk.ga1;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.os.Trace;
import android.text.Annotation;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: a5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0006a5 {

    /* JADX INFO: renamed from: b */
    public static final int[] f102b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c */
    public static final pg0 f103c = new pg0(-751071018, false, new tg0(25));

    /* JADX INFO: renamed from: d */
    public static final jl3 f104d = new jl3(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX INFO: renamed from: e */
    public static final z45 f105e = new z45(7);

    /* JADX INFO: renamed from: f */
    public static final kh5 f106f = new kh5(9);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f107a;

    public /* synthetic */ C0006a5(byte b) {
        this.f107a = b;
    }

    /* JADX INFO: renamed from: A */
    public static final nt2 m46A(nt2 nt2Var, jh2 jh2Var) {
        q01 q01Var = new q01();
        q01Var.f28117a = jh2Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(q01Var);
    }

    /* JADX INFO: renamed from: B */
    public static final void m47B(Context context) {
        Map mapSingletonMap;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            wn2.m12326e().m12328b(y15.f34815a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            String[] strArr = y15.f34816b;
            int iM5779K = fq2.m5779K(strArr.length);
            if (iM5779K < 16) {
                iM5779K = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM5779K);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath.getPath() + str), new File(file.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                mapSingletonMap = Collections.singletonMap(databasePath, file);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath, file);
                mapSingletonMap = linkedHashMap2;
            }
            for (Map.Entry entry : mapSingletonMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        wn2.m12326e().m12332h(y15.f34815a, "Over-writing contents of " + file3);
                    }
                    wn2.m12326e().m12328b(y15.f34815a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:44:0x00b8, B:46:0x00c0, B:48:0x00cf, B:50:0x00db, B:41:0x009b), top: B:99:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:44:0x00b8, B:46:0x00c0, B:48:0x00cf, B:50:0x00db, B:41:0x009b), top: B:99:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00db A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:44:0x00b8, B:46:0x00c0, B:48:0x00cf, B:50:0x00db, B:41:0x009b), top: B:99:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0174, code lost:
    
        if (r3 == r9) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m48C(uf4 uf4Var, rd6 rd6Var, C0795je c0795je, ec3 ec3Var, AbstractC0888lx abstractC0888lx) {
        r04 r04Var;
        boolean z;
        ml3 ml3Var;
        uj2 uj2Var;
        boolean z2;
        List list;
        int size;
        lc3 lc3Var;
        uf4 uf4Var2 = uf4Var;
        rd6 rd6Var2 = rd6Var;
        ds3 ds3Var = wv1.f33773p;
        if (abstractC0888lx instanceof r04) {
            r04Var = (r04) abstractC0888lx;
            int i = r04Var.f28935x;
            if ((i & Integer.MIN_VALUE) != 0) {
                r04Var.f28935x = i - Integer.MIN_VALUE;
            } else {
                r04Var = new r04(abstractC0888lx);
            }
        } else {
            r04Var = new r04(abstractC0888lx);
        }
        r04 r04Var2 = r04Var;
        Object objM9710e = r04Var2.f28934w;
        ap0 ap0Var = ap0.f14763a;
        int i2 = r04Var2.f28935x;
        byte b = 0;
        try {
            try {
                if (i2 == 0) {
                    k43.m7376J(objM9710e);
                    lc3 lc3Var2 = (lc3) ec3Var.f18000a.get(0);
                    if ((ec3Var.f18004e & 1) != 0) {
                        long j = lc3Var2.f23937c;
                        pk4 pk4Var = (pk4) rd6Var2.f29198d;
                        uj2 uj2Var2 = pk4Var.f27696d;
                        if (uj2Var2 == null || uj2Var2.m11577d() == null || !pk4Var.m9547i()) {
                            z2 = false;
                        } else {
                            pk4Var.f27711s = -1;
                            jl1 jl1Var = pk4Var.f27703k;
                            if (jl1Var != null) {
                                jl1.m7164a(jl1Var);
                            }
                            rd6Var2.m10305d(pk4Var.m9550l(), j, false, wv1.f33773p);
                            z2 = true;
                        }
                        if (z2) {
                            lc3Var2.m7952a();
                            long j2 = lc3Var2.f23935a;
                            o04 o04Var = new o04(b);
                            o04Var.f26271b = rd6Var2;
                            VarHandle.storeStoreFence();
                            r04Var2.f28931t = uf4Var2;
                            r04Var2.f28932u = rd6Var2;
                            r04Var2.f28935x = 1;
                            objM9710e = q21.m9710e(uf4Var2, j2, o04Var, r04Var2);
                            if (objM9710e == ap0Var) {
                                return ap0Var;
                            }
                            if (((Boolean) objM9710e).booleanValue()) {
                                list = uf4Var2.f31830f.f32573s.f18000a;
                                size = list.size();
                                while (b < size) {
                                    lc3Var = (lc3) list.get(b);
                                    if (AbstractC1356y5.m12922p(lc3Var)) {
                                        lc3Var.m7952a();
                                    }
                                    b++;
                                }
                            }
                            rd6Var2.m10304c();
                        }
                    } else {
                        int i3 = c0795je.f22193b;
                        ds3 ds3Var2 = i3 != 1 ? i3 != 2 ? wv1.f33775r : wv1.f33774q : ds3Var;
                        long j3 = lc3Var2.f23937c;
                        pk4 pk4Var2 = (pk4) rd6Var2.f29198d;
                        if (!pk4Var2.m9547i() || pk4Var2.m9550l().f34341a.f24092b.length() == 0 || (uj2Var = pk4Var2.f27696d) == null || uj2Var.m11577d() == null) {
                            z = false;
                        } else {
                            jl1 jl1Var2 = pk4Var2.f27703k;
                            if (jl1Var2 != null) {
                                jl1.m7164a(jl1Var2);
                            }
                            pk4Var2.f27706n = j3;
                            pk4Var2.f27711s = -1;
                            pk4Var2.m9543e(true);
                            long jM10305d = rd6Var2.m10305d(pk4Var2.m9550l(), pk4Var2.f27706n, true, ds3Var2);
                            if (i3 >= 2) {
                                rd6Var2.f29196b = true;
                                rd6Var2.f29197c = ql4.m9897a(jM10305d);
                            }
                            z = true;
                        }
                        if (z) {
                            ml3Var = new ml3();
                            ml3Var.f25002a = !ds3Var2.equals(ds3Var);
                            long j4 = lc3Var2.f23935a;
                            C1164t c1164t = new C1164t((byte) 25);
                            c1164t.f30700c = rd6Var2;
                            c1164t.f30699b = ds3Var2;
                            c1164t.f30701d = ml3Var;
                            VarHandle.storeStoreFence();
                            r04Var2.f28931t = uf4Var2;
                            r04Var2.f28932u = rd6Var2;
                            r04Var2.f28933v = ml3Var;
                            r04Var2.f28935x = 2;
                            objM9710e = q21.m9710e(uf4Var2, j4, c1164t, r04Var2);
                        }
                    }
                } else if (i2 == 1) {
                    rd6Var2 = r04Var2.f28932u;
                    uf4Var2 = r04Var2.f28931t;
                    k43.m7376J(objM9710e);
                    if (((Boolean) objM9710e).booleanValue()) {
                        list = uf4Var2.f31830f.f32573s.f18000a;
                        size = list.size();
                        while (b < size) {
                            lc3Var = (lc3) list.get(b);
                            if (AbstractC1356y5.m12922p(lc3Var)) {
                                lc3Var.m7952a();
                            }
                            b++;
                        }
                    }
                    rd6Var2.m10304c();
                } else {
                    if (i2 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ml3 ml3Var2 = r04Var2.f28933v;
                    rd6Var2 = r04Var2.f28932u;
                    uf4 uf4Var3 = r04Var2.f28931t;
                    k43.m7376J(objM9710e);
                    ml3Var = ml3Var2;
                    uf4Var2 = uf4Var3;
                    if (((Boolean) objM9710e).booleanValue() && ml3Var.f25002a) {
                        List list2 = uf4Var2.f31830f.f32573s.f18000a;
                        int size2 = list2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            lc3 lc3Var3 = (lc3) list2.get(i4);
                            if (AbstractC1356y5.m12922p(lc3Var3)) {
                                lc3Var3.m7952a();
                            }
                        }
                    }
                    rd6Var2.m10304c();
                }
                return ju4.f22634a;
            } catch (Throwable th) {
                rd6Var2.m10304c();
                throw th;
            }
        } catch (Throwable th2) {
            rd6Var2.m10304c();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m49D(xk4 xk4Var, wj4 wj4Var, jl4 jl4Var, cf2 cf2Var, el4 el4Var, boolean z, vi3 vi3Var) {
        jl3 jl3VarM7176b;
        if (z) {
            int iM9902f = ql4.m9902f(xk4Var.f34342b);
            vi3Var.m11898a(iM9902f);
            String str = zj4.f36153a;
            if (iM9902f < jl4Var.f22400a.f21533a.f24092b.length()) {
                jl3VarM7176b = jl4Var.m7176b(iM9902f);
            } else {
                jl3VarM7176b = iM9902f != 0 ? jl4Var.m7176b(iM9902f - 1) : new jl3(0.0f, 0.0f, 1.0f, (int) (w52.m12106a(zj4.m13627a(wj4Var.f33432b, wj4Var.f33434d, wj4Var.f33435e)).f33109a & 4294967295L));
            }
            float f = jl3VarM7176b.f22397b;
            float f2 = jl3VarM7176b.f22396a;
            long jMo4005S = cf2Var.mo4005S((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            jl3 jl3VarM5672j = AbstractC0647fd.m5672j((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo4005S & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo4005S >> 32)))) << 32), (((long) Float.floatToRawIntBits(jl3VarM7176b.f22398c - f2)) << 32) | (((long) Float.floatToRawIntBits(jl3VarM7176b.f22399d - f)) & 4294967295L));
            if (z62.m13387o((el4) el4Var.f18239a.f15405b.get(), el4Var)) {
                el4Var.f18240b.mo4552h(jl3VarM5672j);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static final void m50F(mi0 mi0Var) {
        n14 n14Var = new n14((byte) 18);
        VarHandle.storeStoreFence();
        ((ir1) mi0Var).m6880b(n14Var, ju4.f22634a);
    }

    /* JADX INFO: renamed from: G */
    public static final float m51G(long j, float f, ky0 ky0Var) {
        float fM3634d;
        long jM3633c = bm4.m3633c(j);
        if (cm4.m4048b(jM3633c, 4294967296L)) {
            if (ky0Var.mo3585r() <= 1.05d) {
                return ky0Var.mo3582h0(j);
            }
            fM3634d = bm4.m3634d(j) / bm4.m3634d(ky0Var.mo3584o0(f));
        } else {
            if (!cm4.m4048b(jM3633c, 8589934592L)) {
                return Float.NaN;
            }
            fM3634d = bm4.m3634d(j);
        }
        return fM3634d * f;
    }

    /* JADX INFO: renamed from: H */
    public static final nt2 m52H(nt2 nt2Var) {
        return se0.m10694G(nt2Var, 0.0f, 0.0f, null, false, 1048319);
    }

    /* JADX INFO: renamed from: I */
    public static final void m53I(mi0 mi0Var, mq1 mq1Var, Object obj) {
        if (((ir1) mi0Var).f21682S || !z62.m13387o(((ir1) mi0Var).m6869O(), obj)) {
            ir1 ir1Var = (ir1) mi0Var;
            ir1Var.m6905n0(obj);
            ir1Var.m6880b(mq1Var, obj);
        }
    }

    /* JADX INFO: renamed from: J */
    public static final void m54J(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(zy5.m13858V(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: K */
    public static final void m55K(Spannable spannable, long j, ky0 ky0Var, int i, int i2) {
        long jM3633c = bm4.m3633c(j);
        if (cm4.m4048b(jM3633c, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(qq2.m10010E(ky0Var.mo3582h0(j)), false), i, i2, 33);
        } else if (cm4.m4048b(jM3633c, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(bm4.m3634d(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: L */
    public static final void m56L(Spannable spannable, zm2 zm2Var, int i, int i2) {
        if (zm2Var != null) {
            ArrayList arrayList = new ArrayList(ib0.m6717y0(zm2Var, 10));
            Iterator it = zm2Var.f36183a.iterator();
            while (it.hasNext()) {
                arrayList.add(((ym2) it.next()).f35328a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: M */
    public static byte[] m57M(zs0 zs0Var) {
        HashMap map = zs0Var.f36339a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    m58N(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    lb5.m7941v(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            wn2.m12326e().m12330d(vu0.f32875a, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    /* JADX INFO: renamed from: N */
    public static final void m58N(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                C1077qn.m9987m(zi4.m13620t("Unsupported value type ", rl3.m10361a(obj.getClass()).m10249b()));
                return;
            }
            Object[] objArr = (Object[]) obj;
            r90 r90VarM10361a = rl3.m10361a(objArr.getClass());
            if (r90VarM10361a.equals(rl3.m10361a(Boolean[].class))) {
                i = 8;
            } else if (r90VarM10361a.equals(rl3.m10361a(Byte[].class))) {
                i = 9;
            } else if (r90VarM10361a.equals(rl3.m10361a(Integer[].class))) {
                i = 10;
            } else if (r90VarM10361a.equals(rl3.m10361a(Long[].class))) {
                i = 11;
            } else if (r90VarM10361a.equals(rl3.m10361a(Float[].class))) {
                i = 12;
            } else if (r90VarM10361a.equals(rl3.m10361a(Double[].class))) {
                i = 13;
            } else {
                if (!r90VarM10361a.equals(rl3.m10361a(String[].class))) {
                    C1077qn.m9987m(zi4.m13620t("Unsupported value type ", rl3.m10361a(objArr.getClass()).m10248a()));
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c5  */
    /* JADX INFO: renamed from: O */
    public static final ga0 m59O(C0875lk c0875lk) {
        List list = c0875lk.f24093c;
        v71 v71Var = v71.f32439a;
        List list2 = list == null ? v71Var : list;
        CharSequence charSequence = c0875lk.f24092b;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            ar3 ar3Var = new ar3((byte) 24);
            ar3Var.f14813b = Parcel.obtain();
            if (list == null) {
                list = v71Var;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                C0838kk c0838kk = (C0838kk) list.get(i);
                pa4 pa4Var = (pa4) c0838kk.f23186a;
                int i2 = c0838kk.f23187b;
                int i3 = c0838kk.f23188c;
                ((Parcel) ar3Var.f14813b).recycle();
                ar3Var.f14813b = Parcel.obtain();
                yk4 yk4Var = pa4Var.f27478a;
                long j = pa4Var.f27489l;
                long j2 = pa4Var.f27485h;
                int i4 = i;
                long j3 = pa4Var.f27479b;
                List list3 = list;
                int i5 = size;
                long jMo5689a = yk4Var.mo5689a();
                long j4 = pb0.f27501h;
                if (!ws4.m12408a(jMo5689a, j4)) {
                    ar3Var.m3147o((byte) 1);
                    ((Parcel) ar3Var.f14813b).writeLong(pa4Var.f27478a.mo5689a());
                }
                long j5 = bm4.f15419c;
                byte b = 2;
                if (!bm4.m3632b(j3, j5)) {
                    ar3Var.m3147o((byte) 2);
                    ar3Var.m3149q(j3);
                }
                xm1 xm1Var = pa4Var.f27480c;
                if (xm1Var != null) {
                    ar3Var.m3147o((byte) 3);
                    ((Parcel) ar3Var.f14813b).writeInt(xm1Var.f34418a);
                }
                tm1 tm1Var = pa4Var.f27481d;
                if (tm1Var != null) {
                    int i6 = tm1Var.f31237a;
                    ar3Var.m3147o((byte) 4);
                    ar3Var.m3147o((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                um1 um1Var = pa4Var.f27482e;
                if (um1Var != null) {
                    int i7 = um1Var.f31990a;
                    ar3Var.m3147o((byte) 5);
                    if (i7 == 0) {
                        b = 0;
                    } else if (i7 == 65535) {
                        b = 1;
                    } else if (i7 != 1) {
                        if (i7 == 2) {
                            b = 3;
                        } else {
                            b = 0;
                        }
                    }
                    ar3Var.m3147o(b);
                }
                String str = pa4Var.f27484g;
                if (str != null) {
                    ar3Var.m3147o((byte) 6);
                    ((Parcel) ar3Var.f14813b).writeString(str);
                }
                if (!bm4.m3632b(j2, j5)) {
                    ar3Var.m3147o((byte) 7);
                    ar3Var.m3149q(j2);
                }
                C0471ay c0471ay = pa4Var.f27486i;
                if (c0471ay != null) {
                    float f = c0471ay.f14938a;
                    ar3Var.m3147o((byte) 8);
                    ar3Var.m3148p(f);
                }
                zk4 zk4Var = pa4Var.f27487j;
                if (zk4Var != null) {
                    ar3Var.m3147o((byte) 9);
                    ar3Var.m3148p(zk4Var.f36161a);
                    ar3Var.m3148p(zk4Var.f36162b);
                }
                if (!ws4.m12408a(j, j4)) {
                    ar3Var.m3147o((byte) 10);
                    ((Parcel) ar3Var.f14813b).writeLong(j);
                }
                uj4 uj4Var = pa4Var.f27490m;
                if (uj4Var != null) {
                    ar3Var.m3147o((byte) 11);
                    ((Parcel) ar3Var.f14813b).writeInt(uj4Var.f31941a);
                }
                m44 m44Var = pa4Var.f27491n;
                if (m44Var != null) {
                    ar3Var.m3147o((byte) 12);
                    ((Parcel) ar3Var.f14813b).writeLong(m44Var.f24643a);
                    long j6 = m44Var.f24644b;
                    ar3Var.m3148p(Float.intBitsToFloat((int) (j6 >> 32)));
                    ar3Var.m3148p(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    ar3Var.m3148p(m44Var.f24645c);
                }
                SpannableString spannableString2 = spannableString;
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) ar3Var.f14813b).marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i5;
            }
            charSequence = spannableString;
        }
        return new ga0(ClipData.newPlainText("plain text", charSequence));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        if (r15 == r1) goto L35;
     */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m60P(uf4 uf4Var, yj4 yj4Var, ec3 ec3Var, AbstractC0888lx abstractC0888lx) {
        s04 s04Var;
        lc3 lc3Var;
        if (abstractC0888lx instanceof s04) {
            s04Var = (s04) abstractC0888lx;
            int i = s04Var.f29799x;
            if ((i & Integer.MIN_VALUE) != 0) {
                s04Var.f29799x = i - Integer.MIN_VALUE;
            } else {
                s04Var = new s04(abstractC0888lx);
            }
        } else {
            s04Var = new s04(abstractC0888lx);
        }
        Object objM9707b = s04Var.f29798w;
        ap0 ap0Var = ap0.f14763a;
        int i2 = s04Var.f29799x;
        byte b = 1;
        try {
            if (i2 == 0) {
                k43.m7376J(objM9707b);
                lc3Var = (lc3) hb0.m6299K0(ec3Var.f18000a);
                long j = lc3Var.f23935a;
                s04Var.f29795t = uf4Var;
                s04Var.f29796u = yj4Var;
                s04Var.f29797v = lc3Var;
                s04Var.f29799x = 1;
                objM9707b = q21.m9707b(uf4Var, j, s04Var);
                if (objM9707b == ap0Var) {
                }
                return ap0Var;
            }
            if (i2 == 1) {
                lc3 lc3Var2 = s04Var.f29797v;
                yj4Var = s04Var.f29796u;
                uf4 uf4Var2 = s04Var.f29795t;
                k43.m7376J(objM9707b);
                lc3Var = lc3Var2;
                uf4Var = uf4Var2;
            } else {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yj4Var = s04Var.f29796u;
                uf4Var = s04Var.f29795t;
                k43.m7376J(objM9707b);
            }
            if (((Boolean) objM9707b).booleanValue()) {
                List list = uf4Var.f31830f.f32573s.f18000a;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    lc3 lc3Var3 = (lc3) list.get(i3);
                    if (AbstractC1356y5.m12922p(lc3Var3)) {
                        lc3Var3.m7952a();
                    }
                }
                yj4Var.onStop();
            } else {
                yj4Var.onCancel();
            }
            return ju4.f22634a;
            lc3 lc3Var4 = (lc3) objM9707b;
            if (lc3Var4 != null) {
                long j2 = lc3Var4.f23937c;
                if (b33.m3426d(b33.m3429g(lc3Var.f23937c, j2)) < q21.m9712g(uf4Var.m11540k(), lc3Var.f23943i)) {
                    yj4Var.mo8000c(j2, w04.f33010a);
                    long j3 = lc3Var4.f23935a;
                    jo2 jo2Var = new jo2(b);
                    jo2Var.f22470b = yj4Var;
                    VarHandle.storeStoreFence();
                    s04Var.f29795t = uf4Var;
                    s04Var.f29796u = yj4Var;
                    s04Var.f29797v = null;
                    s04Var.f29799x = 2;
                    objM9707b = q21.m9710e(uf4Var, j3, jo2Var, s04Var);
                }
            }
            return ju4.f22634a;
        } catch (CancellationException e) {
            yj4Var.onCancel();
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c6, code lost:
    
        if (r15 == r1) goto L48;
     */
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m61Q(uf4 uf4Var, yj4 yj4Var, ec3 ec3Var, int i, AbstractC0888lx abstractC0888lx) {
        t04 t04Var;
        long j;
        pl3 pl3Var;
        if (abstractC0888lx instanceof t04) {
            t04Var = (t04) abstractC0888lx;
            int i2 = t04Var.f30709y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t04Var.f30709y = i2 - Integer.MIN_VALUE;
            } else {
                t04Var = new t04(abstractC0888lx);
            }
        } else {
            t04Var = new t04(abstractC0888lx);
        }
        Object objM11542n = t04Var.f30708x;
        ap0 ap0Var = ap0.f14763a;
        int i3 = t04Var.f30709y;
        ju4 ju4Var = ju4.f22634a;
        byte b = 2;
        try {
            if (i3 == 0) {
                k43.m7376J(objM11542n);
                lc3 lc3Var = (lc3) hb0.m6299K0(ec3Var.f18000a);
                j = lc3Var.f23935a;
                yj4Var.mo8000c(lc3Var.f23937c, i > 2 ? wv1.f33775r : wv1.f33774q);
                pl3Var = new pl3();
                pl3Var.f27736a = 9205357640488583168L;
                long jMo5858c = uf4Var.m11540k().mo5858c();
                v04 v04Var = new v04(j, pl3Var, null);
                t04Var.f30704t = uf4Var;
                t04Var.f30705u = yj4Var;
                t04Var.f30706v = pl3Var;
                t04Var.f30707w = j;
                t04Var.f30709y = 1;
                objM11542n = uf4Var.m11542n(jMo5858c, v04Var, t04Var);
                if (objM11542n == ap0Var) {
                }
                return ap0Var;
            }
            if (i3 == 1) {
                long j2 = t04Var.f30707w;
                pl3Var = t04Var.f30706v;
                yj4 yj4Var2 = t04Var.f30705u;
                uf4 uf4Var2 = t04Var.f30704t;
                try {
                    k43.m7376J(objM11542n);
                    j = j2;
                    yj4Var = yj4Var2;
                    uf4Var = uf4Var2;
                } catch (CancellationException e) {
                    e = e;
                    yj4Var = yj4Var2;
                    yj4Var.onCancel();
                    throw e;
                }
            } else {
                if (i3 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yj4Var = t04Var.f30705u;
                uf4Var = t04Var.f30704t;
                k43.m7376J(objM11542n);
            }
            if (!((Boolean) objM11542n).booleanValue()) {
                yj4Var.onCancel();
                return ju4Var;
            }
            List list = uf4Var.f31830f.f32573s.f18000a;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                lc3 lc3Var2 = (lc3) list.get(i4);
                if (AbstractC1356y5.m12922p(lc3Var2)) {
                    lc3Var2.m7952a();
                }
            }
            yj4Var.onStop();
            return ju4Var;
            n11 n11Var = (n11) objM11542n;
            if (n11Var == null) {
                n11Var = n11.f25379c;
            }
            if (n11Var == n11.f25380d) {
                yj4Var.onCancel();
                return ju4Var;
            }
            if (n11Var == n11.f25377a) {
                yj4Var.onStop();
                return ju4Var;
            }
            if (n11Var == n11.f25378b) {
                yj4Var.mo8001d(pl3Var.f27736a);
            }
            jo2 jo2Var = new jo2(b);
            jo2Var.f22470b = yj4Var;
            VarHandle.storeStoreFence();
            t04Var.f30704t = uf4Var;
            t04Var.f30705u = yj4Var;
            t04Var.f30706v = null;
            t04Var.f30709y = 2;
            objM11542n = q21.m9710e(uf4Var, j, jo2Var, t04Var);
        } catch (CancellationException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: R */
    public static Object m62R(mq1 mq1Var, Object obj, wm0 wm0Var) {
        ro0 context = wm0Var.getContext();
        Object c72Var = context == r71.f29063a ? new c72(wm0Var) : new d72(wm0Var, context);
        as4.m3259r(2, mq1Var);
        return mq1Var.invoke(obj, c72Var);
    }

    /* JADX INFO: renamed from: a */
    public static final long m63a(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final void m64b(hi2 hi2Var, Object obj, int i, Object obj2, mi0 mi0Var, int i2) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1439843069);
        int i3 = i2 | (ir1Var.m6890g(hi2Var) ? 4 : 2) | (ir1Var.m6890g(obj) ? 32 : 16) | (ir1Var.m6886e(i) ? 256 : 128) | (ir1Var.m6890g(obj2) ? 2048 : 1024);
        byte b = 0;
        if (ir1Var.m6871T(i3 & 1, (i3 & 1171) != 1170)) {
            mh2 mh2Var = new mh2(b);
            mh2Var.f24914b = hi2Var;
            mh2Var.f24915c = i;
            mh2Var.f24916d = obj2;
            VarHandle.storeStoreFence();
            ((gu3) obj).mo6170e(obj2, vd6.m11834R(980966366, mh2Var, ir1Var), ir1Var, 48);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1403zf c1403zf = new C1403zf((byte) 6);
            c1403zf.f36036c = hi2Var;
            c1403zf.f36037d = obj;
            c1403zf.f36035b = i;
            c1403zf.f36038e = obj2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1403zf;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final wa2 m65c(bo3 bo3Var) {
        wa2 wa2Var = new wa2();
        wa2 wa2Var2 = new wa2();
        wa2Var2.m12183w("uri", bo3Var.f15462a.f17525h);
        wa2Var2.m12183w("verb", bo3Var.f15463b);
        wa2Var.m12180t("firstline", wa2Var2);
        uv1 uv1Var = bo3Var.f15464c;
        if (uv1Var.size() > 0) {
            o92 o92Var = new o92();
            Iterator it = uv1Var.iterator();
            while (true) {
                C1018p1 c1018p1 = (C1018p1) it;
                if (!c1018p1.hasNext()) {
                    break;
                }
                l73 l73Var = (l73) c1018p1.next();
                wa2 wa2Var3 = new wa2();
                wa2Var3.m12183w("name", (String) l73Var.f23833a);
                wa2Var3.m12183w("value", (String) l73Var.f23834b);
                o92Var.m9006t(wa2Var3);
            }
            wa2Var.m12180t("headers", o92Var);
        }
        zi3 zi3Var = bo3Var.f15465d;
        if (zi3Var != null) {
            wa2Var.m12183w("body", Base64.encodeToString(zi3Var.toString().getBytes(z80.f35863a), 0));
        }
        return wa2Var;
    }

    /* JADX INFO: renamed from: d */
    public static final wa2 m66d(ga1 ga1Var) {
        wa2 wa2Var = new wa2();
        wa2 wa2Var2 = new wa2();
        wa2Var2.m12183w("uri", ga1Var.f3903a.toString());
        wa2Var2.m12183w("verb", ga1Var.f3904b);
        wa2Var.m12180t("firstline", wa2Var2);
        Map map = ga1Var.f3905c;
        if (!map.isEmpty()) {
            o92 o92Var = new o92();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                wa2 wa2Var3 = new wa2();
                wa2Var3.m12183w("name", str);
                wa2Var3.m12183w("value", str2);
                o92Var.m9006t(wa2Var3);
            }
            wa2Var.m12180t("headers", o92Var);
        }
        byte[] bArr = ga1Var.f3906d;
        if (bArr != null) {
            wa2Var.m12183w("body", Base64.encodeToString(bArr.toString().getBytes(z80.f35863a), 0));
        }
        return wa2Var;
    }

    /* JADX INFO: renamed from: e */
    public static final void m67e(bj4 bj4Var, Context context, boolean z, String str, long j) {
        if (ql4.m9900d(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) ev0.f18503k.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        cw2 cw2Var = bj4Var.f15334a;
        cw2 cw2Var2 = bj4Var.f15334a;
        oj4 oj4Var = oj4.f26787b;
        cw2Var.m4200a(oj4Var);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            fg3 fg3Var = new fg3();
            fg3Var.f18963a = i;
            VarHandle.storeStoreFence();
            String string = resolveInfo.loadLabel(packageManager).toString();
            gg3 gg3Var = new gg3();
            gg3Var.f19782a = context;
            gg3Var.f19783b = resolveInfo;
            gg3Var.f19784c = z;
            gg3Var.f19785d = str;
            gg3Var.f19786e = j;
            VarHandle.storeStoreFence();
            kj4 kj4Var = new kj4(fg3Var);
            kj4Var.f23180b = string;
            kj4Var.f23181c = 0;
            kj4Var.f23182d = gg3Var;
            VarHandle.storeStoreFence();
            cw2Var2.m4200a(kj4Var);
        }
        cw2Var2.m4200a(oj4Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b A[LOOP:0: B:19:0x004c->B:23:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    /* JADX INFO: renamed from: f */
    public static final java.lang.Object m68f(p000.uf4 r7, p000.AbstractC0888lx r8) {
        /*
            boolean r0 = r8 instanceof p000.p04
            if (r0 == 0) goto L13
            r0 = r8
            p04 r0 = (p000.p04) r0
            int r1 = r0.f27264v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27264v = r1
            goto L18
        L13:
            p04 r0 = new p04
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27263u
            ap0 r1 = p000.ap0.f14763a
            int r2 = r0.f27264v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            uf4 r7 = r0.f27262t
            p000.k43.m7376J(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1077qn.m9989o(r7)
            r7 = 0
            return r7
        L30:
            p000.k43.m7376J(r8)
        L33:
            fc3 r8 = p000.fc3.f18904b
            r0.f27262t = r7
            r0.f27264v = r3
            java.lang.Object r8 = r7.m11538a(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            ec3 r8 = (p000.ec3) r8
            java.util.List r2 = r8.f18000a
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L4c:
            if (r5 >= r4) goto L5e
            java.lang.Object r6 = r2.get(r5)
            lc3 r6 = (p000.lc3) r6
            boolean r6 = p000.AbstractC1356y5.m12920n(r6)
            if (r6 != 0) goto L5b
            goto L33
        L5b:
            int r5 = r5 + 1
            goto L4c
        L5e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0006a5.m68f(uf4, lx):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    public static final Object m69g(pc3 pc3Var, rd6 rd6Var, yj4 yj4Var, wm0 wm0Var) {
        vf4 vf4Var = (vf4) pc3Var;
        vf4Var.getClass();
        fy4 fy4Var = sc6.m10652X(vf4Var).f33294B;
        C0795je c0795je = new C0795je((byte) 1);
        c0795je.f22194c = fy4Var;
        VarHandle.storeStoreFence();
        Object objM6084i = gq6.m6084i(pc3Var, new q04(c0795je, rd6Var, yj4Var, null), wm0Var);
        return objM6084i == ap0.f14763a ? objM6084i : ju4.f22634a;
    }

    /* JADX INFO: renamed from: h */
    public static final Object m70h(px0 px0Var, wp1 wp1Var, ym0 ym0Var) {
        Object obj;
        C0940nb c0940nb;
        if (((mt2) px0Var).f25195a.f25208n) {
            mt2 mt2Var = (mt2) px0Var;
            if (!mt2Var.f25195a.f25208n) {
                q32.m9721c("visitAncestors called on an unattached node");
            }
            mt2 mt2Var2 = mt2Var.f25195a.f25199e;
            wf2 wf2VarM10652X = sc6.m10652X(px0Var);
            loop0: while (true) {
                obj = null;
                if (wf2VarM10652X == null) {
                    break;
                }
                if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 524288) != 0) {
                    while (mt2Var2 != null) {
                        if ((mt2Var2.f25197c & 524288) != 0) {
                            mt2 mt2VarM10644P = mt2Var2;
                            uw2 uw2Var = null;
                            while (mt2VarM10644P != null) {
                                if (mt2VarM10644P instanceof z20) {
                                    obj = mt2VarM10644P;
                                    break loop0;
                                }
                                if ((mt2VarM10644P.f25197c & 524288) != 0 && (mt2VarM10644P instanceof qx0)) {
                                    int i = 0;
                                    for (mt2 mt2Var3 = ((qx0) mt2VarM10644P).f28863p; mt2Var3 != null; mt2Var3 = mt2Var3.f25200f) {
                                        if ((mt2Var3.f25197c & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                mt2VarM10644P = mt2Var3;
                                            } else {
                                                if (uw2Var == null) {
                                                    uw2Var = new uw2(new mt2[16]);
                                                }
                                                if (mt2VarM10644P != null) {
                                                    uw2Var.m11663b(mt2VarM10644P);
                                                    mt2VarM10644P = null;
                                                }
                                                uw2Var.m11663b(mt2Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                mt2VarM10644P = sc6.m10644P(uw2Var);
                            }
                        }
                        mt2Var2 = mt2Var2.f25199e;
                    }
                }
                wf2VarM10652X = wf2VarM10652X.m12295v();
                mt2Var2 = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
            }
            z20 z20Var = (z20) obj;
            if (z20Var != null) {
                e13 e13VarM10651W = sc6.m10651W(px0Var);
                C0675g4 c0675g4 = new C0675g4((byte) 11);
                c0675g4.f19600b = wp1Var;
                c0675g4.f19601c = e13VarM10651W;
                VarHandle.storeStoreFence();
                Object objMo6207u0 = z20Var.mo6207u0(e13VarM10651W, c0675g4, ym0Var);
                if (objMo6207u0 == ap0.f14763a) {
                    return objMo6207u0;
                }
            }
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: i */
    public static ik0 m71i() {
        Executor executor;
        Executor executorMo6176O;
        ik0 ik0Var = new ik0();
        pw0 pw0Var = l01.f23664a;
        so0 so0VarMo5042N = pw0Var.mo5042N(Math.max(1, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), null);
        tb1 tb1Var = so0VarMo5042N instanceof tb1 ? (tb1) so0VarMo5042N : null;
        if (tb1Var == null || (executorMo6176O = tb1Var.mo6176O()) == null) {
            executor = executorMo6176O;
            j01 j01Var = new j01();
            j01Var.f21923a = so0VarMo5042N;
            VarHandle.storeStoreFence();
            executor = j01Var;
        }
        executor = executorMo6176O;
        ik0Var.f21504a = executor;
        Executor executorMo6176O2 = pw0Var.mo6176O();
        Executor executor2 = executorMo6176O2;
        if (executorMo6176O2 == null) {
            j01 j01Var2 = new j01();
            j01Var2.f21923a = pw0Var;
            VarHandle.storeStoreFence();
            executor2 = j01Var2;
        }
        ik0Var.f21505b = executor2;
        byte b = 20;
        ik0Var.f21506c = new i50(b);
        ik0Var.f21507d = ig1.f21395s;
        ik0Var.f21508e = ia5.f21225p;
        ar3 ar3Var = new ar3(b);
        ar3Var.f14813b = Handler.createAsync(Looper.getMainLooper());
        VarHandle.storeStoreFence();
        ik0Var.f21509f = ar3Var;
        ik0Var.f21510g = (byte) 4;
        ik0Var.f21511h = Integer.MAX_VALUE;
        ik0Var.f21513j = (byte) 20;
        ik0Var.f21512i = (byte) 8;
        ik0Var.f21514k = true;
        ik0Var.f21515l = new r50((byte) 2);
        ik0Var.f21516m = true;
        VarHandle.storeStoreFence();
        return ik0Var;
    }

    /* JADX INFO: renamed from: j */
    public static void m72j(long j, w30 w30Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            C1077qn.m9987m("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((s50) arrayList4.get(i8)).mo4261b() < i7) {
                C1077qn.m9987m("Failed requirement.");
                return;
            }
        }
        s50 s50Var = (s50) arrayList.get(i2);
        s50 s50Var2 = (s50) arrayList4.get(i3 - 1);
        if (i7 == s50Var.mo4261b()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            s50 s50Var3 = (s50) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            s50Var = s50Var3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (s50Var.mo4265g(i7) == s50Var2.mo4265g(i7)) {
            int iMin = Math.min(s50Var.mo4261b(), s50Var2.mo4261b());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && s50Var.mo4265g(i11) == s50Var2.mo4265g(i11); i11++) {
                i10++;
            }
            long j3 = (w30Var.f33056b / 4) + j + 2 + ((long) i10) + 1;
            w30Var.m12056Q(-i10);
            w30Var.m12056Q(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                w30Var.m12056Q(s50Var.mo4265g(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((s50) arrayList4.get(i4)).mo4261b()) {
                    w30Var.m12056Q(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    C1077qn.m9989o("Check failed.");
                    return;
                }
            }
            w30 w30Var2 = new w30();
            w30Var.m12056Q(((int) ((w30Var2.f33056b / 4) + j3)) * (-1));
            m72j(j3, w30Var2, i12, arrayList4, i4, i3, arrayList5);
            w30Var.m12053N(w30Var2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((s50) arrayList4.get(i14 - 1)).mo4265g(i7) != ((s50) arrayList4.get(i14)).mo4265g(i7)) {
                i13++;
            }
        }
        long j4 = (w30Var.f33056b / 4) + j + 2 + ((long) (i13 * 2));
        w30Var.m12056Q(i13);
        w30Var.m12056Q(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iMo4265g = ((s50) arrayList4.get(i15)).mo4265g(i7);
            if (i15 == i4 || iMo4265g != ((s50) arrayList4.get(i15 - 1)).mo4265g(i7)) {
                w30Var.m12056Q(iMo4265g & 255);
            }
        }
        w30 w30Var3 = new w30();
        int i16 = i4;
        while (i16 < i3) {
            byte bMo4265g = ((s50) arrayList4.get(i16)).mo4265g(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bMo4265g != ((s50) arrayList4.get(i18)).mo4265g(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((s50) arrayList4.get(i16)).mo4261b()) {
                w30Var.m12056Q(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                w30Var.m12056Q(((int) ((w30Var3.f33056b / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                m72j(j2, w30Var3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        w30Var.m12053N(w30Var3);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public static final Serializable m73k(si1 si1Var, ti1 ti1Var, ym0 ym0Var) throws Throwable {
        cj1 cj1Var;
        ql3 ql3Var;
        Throwable th;
        t82 t82Var;
        CancellationException cancellationExceptionMo5006u;
        if (ym0Var instanceof cj1) {
            cj1Var = (cj1) ym0Var;
            int i = cj1Var.f16061v;
            if ((i & Integer.MIN_VALUE) != 0) {
                cj1Var.f16061v = i - Integer.MIN_VALUE;
            } else {
                cj1Var = new cj1(ym0Var);
            }
        } else {
            cj1Var = new cj1(ym0Var);
        }
        Object obj = cj1Var.f16060u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = cj1Var.f16061v;
        byte b = 1;
        if (i2 == 0) {
            k43.m7376J(obj);
            ql3 ql3Var2 = new ql3();
            try {
                try {
                    c11 c11Var = new c11(b);
                    c11Var.f15753b = ti1Var;
                    c11Var.f15754c = ql3Var2;
                    VarHandle.storeStoreFence();
                    cj1Var.f16059t = ql3Var2;
                    cj1Var.f16061v = 1;
                    if (si1Var.collect(c11Var, cj1Var) == ap0Var) {
                        return ap0Var;
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    ql3Var = ql3Var2;
                    th = (Throwable) ql3Var.f28555a;
                    if (th == null) {
                        if (th == null) {
                            return th;
                        }
                        if (th instanceof CancellationException) {
                            se0.m10720f(th, th);
                            throw th;
                        }
                        se0.m10720f(th, th);
                        throw th;
                    }
                    if (th == null) {
                        return th;
                    }
                    if (th instanceof CancellationException) {
                        se0.m10720f(th, th);
                        throw th;
                    }
                    se0.m10720f(th, th);
                    throw th;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql3Var = cj1Var.f16059t;
            try {
                k43.m7376J(obj);
                return null;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        th = (Throwable) ql3Var.f28555a;
        if ((th == null && th.equals(th)) || ((t82Var = (t82) cj1Var.getContext().get(o85.f26448h)) != null && t82Var.isCancelled() && (cancellationExceptionMo5006u = t82Var.mo5006u()) != null && cancellationExceptionMo5006u.equals(th))) {
            throw th;
        }
        if (th == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            se0.m10720f(th, th);
            throw th;
        }
        se0.m10720f(th, th);
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static wm0 m74l(wm0 wm0Var, wm0 wm0Var2, mq1 mq1Var) {
        if (mq1Var instanceof AbstractC0888lx) {
            return ((AbstractC0888lx) mq1Var).create(wm0Var2, wm0Var);
        }
        ro0 context = wm0Var2.getContext();
        return context == r71.f29063a ? new a72(wm0Var2, wm0Var, mq1Var) : new b72(wm0Var2, context, mq1Var, wm0Var);
    }

    /* JADX INFO: renamed from: m */
    public static final nt2 m75m(nt2 nt2Var, C0940nb c0940nb, mq1 mq1Var) {
        d63 d63Var = d63.f16814a;
        z21 z21Var = new z21();
        z21Var.f35708a = c0940nb;
        z21Var.f35709b = mq1Var;
        z21Var.f35710c = d63Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(z21Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0055 A[RETURN] */
    /* JADX INFO: renamed from: n */
    public static double m76n(double d, double d2) {
        double dM10640L = sc6.m10640L(d, d2);
        if (dM10640L < 0.0d) {
            dM10640L = 100.0d;
        }
        double dMax = Math.max(0.0d, sc6.m10682w(d, d2));
        double dM10646R = sc6.m10646R(dM10640L, d);
        double dM10646R2 = sc6.m10646R(dMax, d);
        if (Math.rint(d) >= 60.0d) {
            if (dM10646R2 >= d2 || dM10646R2 >= dM10646R) {
                return dMax;
            }
            return dM10640L;
        }
        boolean z = Math.abs(dM10646R - dM10646R2) < 0.1d && dM10646R < d2 && dM10646R2 < d2;
        if (dM10646R >= d2 || dM10646R >= dM10646R2 || z) {
            return dM10640L;
        }
        return dMax;
    }

    /* JADX INFO: renamed from: o */
    public static zs0 m77o(byte[] bArr) {
        if (bArr.length > 10240) {
            C1077qn.m9989o("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return zs0.f36338b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    while (i < i2) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        lb5.m7941v(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s == -21521) {
                        short s2 = dataInputStream.readShort();
                        if (s2 != 1) {
                            xy4.m12780h(c75.m3877i(s2, "Unsupported version number: "));
                        }
                    } else {
                        xy4.m12780h(c75.m3877i(s, "Magic number doesn't match: "));
                    }
                    int i3 = dataInputStream.readInt();
                    while (i < i3) {
                        linkedHashMap.put(dataInputStream.readUTF(), m78p(dataInputStream, dataInputStream.readByte()));
                        i++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        lb5.m7941v(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException e) {
            wn2.m12326e().m12330d(vu0.f32875a, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            wn2.m12326e().m12330d(vu0.f32875a, "Error in Data#fromByteArray: ", e2);
        }
        return new zs0(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: p */
    public static final Serializable m78p(DataInputStream dataInputStream, byte b) throws IOException {
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b == 8) {
            int i2 = dataInputStream.readInt();
            ?? r0 = new Boolean[i2];
            while (i < i2) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b == 9) {
            int i3 = dataInputStream.readInt();
            ?? r1 = new Byte[i3];
            while (i < i3) {
                r1[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r1;
        }
        if (b == 10) {
            int i4 = dataInputStream.readInt();
            ?? r2 = new Integer[i4];
            while (i < i4) {
                r2[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r2;
        }
        if (b == 11) {
            int i5 = dataInputStream.readInt();
            ?? r3 = new Long[i5];
            while (i < i5) {
                r3[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r3;
        }
        if (b == 12) {
            int i6 = dataInputStream.readInt();
            ?? r4 = new Float[i6];
            while (i < i6) {
                r4[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r4;
        }
        if (b == 13) {
            int i7 = dataInputStream.readInt();
            ?? r5 = new Double[i7];
            while (i < i7) {
                r5[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r5;
        }
        if (b != 14) {
            C1077qn.m9989o(c75.m3877i(b, "Unsupported type "));
            return null;
        }
        int i8 = dataInputStream.readInt();
        ?? r6 = new String[i8];
        while (i < i8) {
            String utf = dataInputStream.readUTF();
            if (z62.m13387o(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r6[i] = utf;
            i++;
        }
        return r6;
    }

    /* JADX INFO: renamed from: q */
    public static final lv2 m79q(l14 l14Var, yp1 yp1Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            i14 i14VarM7810a = l14Var.m7810a();
            wf2 wf2Var = i14VarM7810a.f21011c;
            if (wf2Var.m12257K() && wf2Var.m12256J()) {
                jl3 jl3VarM6546g = i14VarM7810a.m6546g();
                lv2 lv2Var = new lv2(48);
                w42 w42VarM7708g = kx5.m7708g();
                w42VarM7708g.m12092w(y62.m12964d0(jl3VarM6546g));
                m82t(yp1Var, kx5.m7708g(), w42VarM7708g, lv2Var, i14VarM7810a, i14VarM7810a);
                return lv2Var;
            }
            return n52.f25469a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m80r(yp1 yp1Var, w42 w42Var, w42 w42Var2, lv2 lv2Var, i14 i14Var, i14 i14Var2) {
        w42 w42Var3 = w42Var;
        Region region = (Region) w42Var3.f33090b;
        w42 w42Var4 = w42Var2;
        Region region2 = (Region) w42Var4.f33090b;
        wf2 wf2Var = i14Var2.f21011c;
        wf2 wf2Var2 = i14Var2.f21011c;
        if (!wf2Var.m12257K() || !wf2Var2.m12256J() || region2.isEmpty()) {
            if (i14Var2.m6552n()) {
                m81s(lv2Var, i14Var, i14Var2);
                return;
            }
            return;
        }
        jl3 jl3VarM6551m = i14Var2.m6551m();
        if (jl3VarM6551m.m7171g()) {
            px0 px0VarM6545f = i14Var2.m6545f();
            if (px0VarM6545f == null) {
                w32 w32Var = (w32) wf2Var2.f33299G.f25607d;
                jl3VarM6551m = y42.m12861j0(w32Var).mo4003Q(w32Var, false);
            } else {
                mt2 mt2Var = ((mt2) px0VarM6545f).f25195a;
                Object objM8132g = i14Var2.f21012d.f17631a.m8132g(d14.f16705b);
                if (objM8132g == null) {
                    objM8132g = null;
                }
                jl3VarM6551m = y70.m13039s(mt2Var, objM8132g != null, false);
            }
        }
        s52 s52VarM12964d0 = y62.m12964d0(jl3VarM6551m);
        w42Var3.m12092w(s52VarM12964d0);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = i14Var2.f21014f;
            i14 i14Var3 = i14Var;
            if (i == i14Var3.f21014f) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            k14 k14Var = new k14(i14Var2, new s52(bounds.left, bounds.top, bounds.right, bounds.bottom));
            lv2 lv2Var2 = lv2Var;
            lv2Var2.m8121h(i, k14Var);
            List listM6548i = i14Var2.m6548i((4 & 1) != 0 ? !i14Var2.f21010b : false, (4 & 2) == 0);
            int size = listM6548i.size() - 1;
            while (-1 < size) {
                if (!((Boolean) yp1Var.invoke(listM6548i.get(size))).booleanValue()) {
                    m80r(yp1Var, w42Var3, w42Var4, lv2Var2, i14Var3, (i14) listM6548i.get(size));
                }
                size--;
                w42Var3 = w42Var;
                w42Var4 = w42Var2;
                lv2Var2 = lv2Var;
                i14Var3 = i14Var;
            }
            if (m88z(i14Var2)) {
                region2.op(s52VarM12964d0.f29916a, s52VarM12964d0.f29917b, s52VarM12964d0.f29918c, s52VarM12964d0.f29919d, Region.Op.DIFFERENCE);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m81s(lv2 lv2Var, i14 i14Var, i14 i14Var2) {
        wf2 wf2Var;
        i14 i14VarM6550l = i14Var2.m6550l();
        jl3 jl3VarM6546g = (i14VarM6550l == null || (wf2Var = i14VarM6550l.f21011c) == null || !wf2Var.m12257K()) ? f104d : i14VarM6550l.m6546g();
        int i = i14Var2.f21014f;
        if (i == i14Var.f21014f) {
            i = -1;
        }
        lv2Var.m8121h(i, new k14(i14Var2, y62.m12964d0(jl3VarM6546g)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x0157  */
    /* JADX WARN: Code duplicated, block: B:80:0x0161  */
    /* JADX WARN: Code duplicated, block: B:82:0x0171  */
    /* JADX WARN: Code duplicated, block: B:83:0x0174  */
    /* JADX INFO: renamed from: t */
    public static final void m82t(yp1 yp1Var, w42 w42Var, w42 w42Var2, lv2 lv2Var, i14 i14Var, i14 i14Var2) {
        int size;
        boolean z;
        jl3 jl3VarM13039s;
        yp1 yp1Var2 = yp1Var;
        i14 i14Var3 = i14Var;
        int i = i14Var3.f21014f;
        Region region = (Region) w42Var.f33090b;
        w42 w42Var3 = w42Var2;
        Region region2 = (Region) w42Var3.f33090b;
        wf2 wf2Var = i14Var2.f21011c;
        e14 e14Var = i14Var2.f21012d;
        wf2 wf2Var2 = i14Var2.f21011c;
        int i2 = i14Var2.f21014f;
        boolean z2 = (wf2Var.m12257K() && wf2Var2.m12256J()) ? false : true;
        if (!region2.isEmpty() || i2 == i) {
            if (!z2 || i14Var2.m6552n()) {
                s52 s52VarM12964d0 = y62.m12964d0(i14Var2.m6551m());
                w42Var.m12092w(s52VarM12964d0);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (i14Var2.m6552n()) {
                        m81s(lv2Var, i14Var, i14Var2);
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            lv2Var.m8121h(i2, new k14(i14Var2, new s52(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                lv2Var.m8121h(i2, new k14(i14Var2, new s52(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listM6548i = i14Var2.m6548i((4 & 1) != 0 ? !i14Var2.f21010b : false, (4 & 2) == 0);
                if (e14Var.f17633c) {
                    i14 i14VarM6550l = i14Var2.m6550l();
                    while (true) {
                        if (i14VarM6550l == null) {
                            i14VarM6550l = null;
                            break;
                        }
                        lw2 lw2Var = i14VarM6550l.f21012d.f17631a;
                        if (lw2Var.m8128c(m14.f24574w) || lw2Var.m8128c(m14.f24573v)) {
                            break;
                        } else {
                            i14VarM6550l = i14VarM6550l.m6550l();
                        }
                    }
                    if (i14VarM6550l == null) {
                        z = false;
                    } else {
                        e13 e13VarM6543d = i14Var2.m6543d();
                        if (e13VarM6543d == null) {
                            e13VarM6543d = null;
                        } else {
                            if (!e13VarM6543d.mo4871Z0().f25208n) {
                                e13VarM6543d = null;
                            }
                            if (e13VarM6543d == null) {
                                e13VarM6543d = null;
                            }
                        }
                        e13 e13VarM6543d2 = i14VarM6550l.m6543d();
                        if (e13VarM6543d2 == null) {
                            e13VarM6543d2 = null;
                        } else {
                            if (!e13VarM6543d2.mo4871Z0().f25208n) {
                                e13VarM6543d2 = null;
                            }
                            if (e13VarM6543d2 == null) {
                                e13VarM6543d2 = null;
                            }
                        }
                        if (e13VarM6543d == null || e13VarM6543d2 == null) {
                            z = false;
                        } else {
                            jl3 jl3VarMo4003Q = e13VarM6543d2.mo4003Q(e13VarM6543d, false);
                            z = !jl3VarMo4003Q.equals(jl3VarMo4003Q.m7170f(AbstractC0647fd.m5672j(0L, z62.m13369a0(e13VarM6543d2.f16901c))));
                        }
                    }
                    if (z) {
                        w42 w42VarM7708g = kx5.m7708g();
                        px0 px0VarM6545f = i14Var2.m6545f();
                        if (px0VarM6545f == null) {
                            w32 w32Var = (w32) wf2Var2.f33299G.f25607d;
                            jl3VarM13039s = y42.m12861j0(w32Var).mo4003Q(w32Var, false);
                        } else {
                            mt2 mt2Var = ((mt2) px0VarM6545f).f25195a;
                            Object objM8132g = e14Var.f17631a.m8132g(d14.f16705b);
                            jl3VarM13039s = y70.m13039s(mt2Var, (objM8132g == null ? null : objM8132g) != null, false);
                        }
                        w42VarM7708g.m12092w(y62.m12964d0(jl3VarM13039s));
                        int size2 = listM6548i.size() - 1;
                        while (-1 < size2) {
                            if (!((Boolean) yp1Var2.invoke(listM6548i.get(size2))).booleanValue()) {
                                m80r(yp1Var2, kx5.m7708g(), w42VarM7708g, lv2Var, i14Var3, (i14) listM6548i.get(size2));
                            }
                            size2--;
                            i14Var3 = i14Var;
                        }
                    } else {
                        size = listM6548i.size() - 1;
                        while (-1 < size) {
                            if (((Boolean) yp1Var2.invoke(listM6548i.get(size))).booleanValue()) {
                                m82t(yp1Var2, w42Var, w42Var3, lv2Var, i14Var, (i14) listM6548i.get(size));
                            }
                            size--;
                            yp1Var2 = yp1Var;
                            w42Var3 = w42Var2;
                        }
                    }
                } else {
                    size = listM6548i.size() - 1;
                    while (-1 < size) {
                        if (((Boolean) yp1Var2.invoke(listM6548i.get(size))).booleanValue()) {
                            m82t(yp1Var2, w42Var, w42Var3, lv2Var, i14Var, (i14) listM6548i.get(size));
                        }
                        size--;
                        yp1Var2 = yp1Var;
                        w42Var3 = w42Var2;
                    }
                }
                if (m88z(i14Var2)) {
                    region2.op(s52VarM12964d0.f29916a, s52VarM12964d0.f29917b, s52VarM12964d0.f29918c, s52VarM12964d0.f29919d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static Drawable m83u(Context context, int i) {
        to3 to3Var;
        to3 to3Var2 = to3.f31288d;
        synchronized (to3.class) {
            to3Var = to3.f31288d;
            if (to3Var == null) {
                to3Var = new to3();
                to3Var.f31289a = new WeakHashMap(0);
                VarHandle.storeStoreFence();
                to3.f31288d = to3Var;
            }
        }
        return to3Var.m11078b(context, i);
    }

    /* JADX INFO: renamed from: v */
    public static final vt2 m84v(ro0 ro0Var) {
        vt2 vt2Var = (vt2) ro0Var.get(wv1.f33767j);
        if (vt2Var != null) {
            return vt2Var;
        }
        C1077qn.m9989o("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static final void m85w(mi0 mi0Var, Integer num) {
        jh0 jh0Var = ia5.f21217h;
        if (((ir1) mi0Var).f21682S) {
            ((ir1) mi0Var).m6880b(jh0Var, num);
        }
    }

    /* JADX INFO: renamed from: x */
    public static wm0 m86x(wm0 wm0Var) {
        ym0 ym0Var = wm0Var instanceof ym0 ? (ym0) wm0Var : null;
        return ym0Var != null ? ym0Var.intercepted() : wm0Var;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m87y(i14 i14Var) {
        e13 e13VarM6543d = i14Var.m6543d();
        lw2 lw2Var = i14Var.f21012d.f17631a;
        return (e13VarM6543d != null ? e13VarM6543d.m4880i1() : false) || lw2Var.m8128c(m14.f24568q) || lw2Var.m8128c(m14.f24567p);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[LOOP:0: B:11:0x001d->B:24:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c A[SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public static final boolean m88z(i14 i14Var) {
        if (!m87y(i14Var)) {
            e14 e14Var = i14Var.f21012d;
            if (e14Var.f17633c) {
                return true;
            }
            lw2 lw2Var = e14Var.f17631a;
            Object[] objArr = lw2Var.f24419b;
            Object[] objArr2 = lw2Var.f24420c;
            long[] jArr = lw2Var.f24418a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((p14) obj).f27294c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final Object m89E(Intent intent, int i) {
        switch (this.f107a) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayListM9209d0 = AbstractC0990oo.m9209d0(stringArrayExtra);
                        Iterator it = arrayListM9209d0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(ib0.m6717y0(arrayListM9209d0, 10), ib0.m6717y0(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new l73(it.next(), it2.next()));
                        }
                        return eq2.m5277P(arrayList2);
                    }
                }
                return w71.f33134a;
            case 1:
                return new C1318x4(intent, i);
            case 2:
                return new C1318x4(intent, i);
            default:
                return new C1318x4(intent, i);
        }
    }
}
