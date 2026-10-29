package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hf0 implements m62, bp6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20527a;

    /* JADX INFO: renamed from: b */
    public int f20528b;

    /* JADX INFO: renamed from: c */
    public Object f20529c;

    public hf0(C1122rv c1122rv, int i) {
        this.f20527a = (byte) 7;
        this.f20529c = c1122rv;
        this.f20527a = (byte) 7;
        this.f20528b = i;
    }

    /* JADX INFO: renamed from: h */
    public static hf0 m6368h(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        int i2;
        int color;
        float f;
        float f2;
        z32 z32Var;
        int i3;
        int i4;
        Shader radialGradient;
        int i5;
        TypedArray typedArrayObtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new hf0((Shader) null, ed0.m5090b(resources, xml, attributeSetAsAttributeSet, theme).getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = bj3.f15332b;
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayObtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayObtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayObtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayObtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayObtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayObtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayObtainAttributes.getInt(2, 0) : 0;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayObtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayObtainAttributes.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            i2 = 0;
            color = typedArrayObtainAttributes.getColor(1, 0);
        } else {
            i2 = 0;
            color = 0;
        }
        int i7 = 1;
        int i8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayObtainAttributes.getInt(6, i2) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayObtainAttributes.getFloat(5, 0.0f) : 0.0f;
        typedArrayObtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f3;
            if (next2 == i7) {
                f2 = f4;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f4;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = bj3.f15333c;
                if (theme == null) {
                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                    i5 = 0;
                } else {
                    i5 = 0;
                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                }
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i5);
                boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayObtainStyledAttributes.getColor(0, 0);
                float f11 = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f3 = f;
            f4 = f2;
            i7 = 1;
        }
        byte b = 16;
        if (arrayList2.size() > 0) {
            z32Var = new z32(b);
            int size = arrayList2.size();
            z32Var.f35738b = new int[size];
            z32Var.f35739c = new float[size];
            for (int i9 = 0; i9 < size; i9++) {
                ((int[]) z32Var.f35738b)[i9] = ((Integer) arrayList2.get(i9)).intValue();
                ((float[]) z32Var.f35739c)[i9] = ((Float) arrayList.get(i9)).floatValue();
            }
            VarHandle.storeStoreFence();
        } else {
            z32Var = null;
        }
        if (z32Var != null) {
            i4 = 1;
            i3 = 2;
        } else if (z) {
            z32Var = new z32(b);
            z32Var.f35738b = new int[]{color2, color3, color};
            z32Var.f35739c = new float[]{0.0f, 0.5f, 1.0f};
            VarHandle.storeStoreFence();
            i4 = 1;
            i3 = 2;
        } else {
            z32Var = new z32(b);
            z32Var.f35738b = new int[]{color2, color};
            i3 = 2;
            z32Var.f35739c = new float[]{0.0f, 1.0f};
            VarHandle.storeStoreFence();
            i4 = 1;
        }
        if (i6 == i4) {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f7, f8, f10, (int[]) z32Var.f35738b, (float[]) z32Var.f35739c, i8 != 1 ? i8 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i6 != i3) {
            radialGradient = new LinearGradient(f, f2, f5, f6, (int[]) z32Var.f35738b, (float[]) z32Var.f35739c, i8 != i4 ? i8 != i3 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            radialGradient = new SweepGradient(f7, f8, (int[]) z32Var.f35738b, (float[]) z32Var.f35739c);
        }
        return new hf0(radialGradient, 0);
    }

    /* JADX INFO: renamed from: i */
    public static void m6369i(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = z62.m13393u(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    @Override // p000.m62
    /* JADX INFO: renamed from: a */
    public void mo6370a(char c) {
        m6376j(this.f20528b, 1);
        char[] cArr = (char[]) this.f20529c;
        int i = this.f20528b;
        this.f20528b = i + 1;
        cArr[i] = c;
    }

    @Override // p000.bp6
    /* JADX INFO: renamed from: b */
    public String mo3660b(dm6 dm6Var) {
        C0927mz c0927mz = (C0927mz) this.f20529c;
        int i = this.f20528b;
        pq3 pq3Var = new pq3((byte) 11);
        pq3Var.f27896b = dm6Var;
        pq3Var.f27897c = c0927mz;
        VarHandle.storeStoreFence();
        c0927mz.m8436E(pq3Var, i);
        return "reconnectIfNeeded";
    }

    @Override // p000.m62
    /* JADX INFO: renamed from: c */
    public void mo6371c(String str) {
        byte b;
        m6376j(this.f20528b, str.length() + 2);
        char[] cArr = (char[]) this.f20529c;
        int i = this.f20528b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            String[] strArr = ed4.f18023a;
            if (c <= 31 || c == '\"' || c == '\\') {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    m6376j(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr = ed4.f18024b;
                    if (cCharAt >= bArr.length || (b = bArr[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) this.f20529c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = ed4.f18023a[cCharAt];
                        m6376j(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) this.f20529c, i4);
                        int length3 = str2.length() + i4;
                        this.f20528b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) this.f20529c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        this.f20528b = i4;
                    }
                }
                m6376j(i4, 1);
                ((char[]) this.f20529c)[i4] = '\"';
                this.f20528b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        this.f20528b = i3 + 1;
    }

    @Override // p000.m62
    /* JADX INFO: renamed from: d */
    public void mo6372d(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        m6376j(this.f20528b, length);
        str.getChars(0, str.length(), (char[]) this.f20529c, this.f20528b);
        this.f20528b += length;
    }

    /* JADX INFO: renamed from: e */
    public void m6373e(long j) {
        if (m6375g(j)) {
            return;
        }
        int i = this.f20528b;
        long[] jArrCopyOf = (long[]) this.f20529c;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.f20529c = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.f20528b) {
            this.f20528b = i + 1;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m6374f() {
        WeakReference weakReference;
        this.f20528b = 0;
        Iterator it = ((LinkedHashMap) this.f20529c).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                wk3 wk3Var = (wk3) hb0.m6301M0(arrayList);
                if (((wk3Var == null || (weakReference = wk3Var.f33448b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((wk3) arrayList.get(i3)).f33448b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m6375g(long j) {
        int i = this.f20528b;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.f20529c)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m6376j(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f20529c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f20529c = Arrays.copyOf(cArr, i3);
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m6377k() {
        return this.f20528b < ((ArrayList) this.f20529c).size();
    }

    /* JADX INFO: renamed from: l */
    public void m6378l(int i, C1116rp c1116rp) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            C1116rp c1116rp2 = ((C1116rp[]) this.f20529c)[i2];
            if (z62.m13394v(0L, c1116rp.f29494g - c1116rp2.f29494g) <= 0) {
                break;
            }
            c1116rp2.f29493f = i;
            ((C1116rp[]) this.f20529c)[i] = c1116rp2;
            i = i2;
        }
        ((C1116rp[]) this.f20529c)[i] = c1116rp;
        c1116rp.f29493f = i;
    }

    /* JADX INFO: renamed from: m */
    public void m6379m(uo1 uo1Var) {
        C1122rv c1122rv = (C1122rv) this.f20529c;
        ve4 ve4Var = new ve4(uo1Var);
        vq3 vq3Var = (vq3) c1122rv.f29652c;
        gf4 gf4VarM11888b = ve4Var.m11888b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (gf4VarM11888b.mo5112g() && gf4VarM11888b.getLong(0) == 0) {
                z = true;
            }
            sc6.m10672m(gf4VarM11888b, null);
            vq3Var.mo3412a(ve4Var);
            if (!z) {
                uq3 uq3VarMo3418g = vq3Var.mo3418g(ve4Var);
                if (!uq3VarMo3418g.f32104b) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + uq3VarMo3418g.f32103a).toString());
                }
            }
            c1122rv.m10466y(ve4Var);
            vq3Var.mo3414c();
            Iterator it = ((List) c1122rv.f29653d).iterator();
            while (it.hasNext()) {
                ((w90) it.next()).getClass();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                sc6.m10672m(gf4VarM11888b, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m6380n(uo1 uo1Var) throws Throwable {
        Object objM7389n;
        C1122rv c1122rv = (C1122rv) this.f20529c;
        ve4 ve4Var = new ve4(uo1Var);
        vq3 vq3Var = (vq3) c1122rv.f29652c;
        gf4 gf4VarM11888b = ve4Var.m11888b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = gf4VarM11888b.mo5112g() && gf4VarM11888b.getLong(0) != 0;
            sc6.m10672m(gf4VarM11888b, null);
            if (z) {
                gf4 gf4VarM11888b2 = ve4Var.m11888b("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strMo5110b = gf4VarM11888b2.mo5112g() ? gf4VarM11888b2.mo5110b(0) : null;
                    sc6.m10672m(gf4VarM11888b2, null);
                    if (!vq3Var.f32801b.equals(strMo5110b) && !vq3Var.f32802c.equals(strMo5110b)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + vq3Var.f32801b + ", found: " + strMo5110b).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        sc6.m10672m(gf4VarM11888b2, th);
                        throw th2;
                    }
                }
            } else {
                zy5.m13843G(ve4Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    uq3 uq3VarMo3418g = vq3Var.mo3418g(ve4Var);
                    if (!uq3VarMo3418g.f32104b) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + uq3VarMo3418g.f32103a).toString());
                    }
                    vq3Var.mo3416e();
                    c1122rv.m10466y(ve4Var);
                    objM7389n = ju4.f22634a;
                    if (!(objM7389n instanceof cp3)) {
                        zy5.m13843G(ve4Var, "END TRANSACTION");
                    }
                    Throwable thM4638b = dp3.m4638b(objM7389n);
                    if (thM4638b != null) {
                        zy5.m13843G(ve4Var, "ROLLBACK TRANSACTION");
                        throw thM4638b;
                    }
                    dp3.m4637a(objM7389n);
                } catch (Throwable th3) {
                    objM7389n = k43.m7389n(th3);
                }
            }
            vq3Var.mo3415d(ve4Var);
            for (w90 w90Var : (List) c1122rv.f29653d) {
                w90Var.getClass();
                if (ve4Var instanceof ve4) {
                    byte b = w90Var.f33166a;
                    uo1 uo1Var2 = ve4Var.f32560a;
                    switch (b) {
                        case 0:
                            uo1Var2.m11589a();
                            try {
                                ((i50) w90Var.f33167b).getClass();
                                uo1Var2.m11593j("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - 86400000) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                uo1Var2.m11596q();
                                uo1Var2.m11592g();
                            } catch (Throwable th4) {
                                uo1Var2.m11592g();
                                throw th4;
                            }
                            break;
                        default:
                            ((b71) w90Var.f33167b).invoke(uo1Var2);
                            break;
                    }
                }
            }
            c1122rv.f29655f = uo1Var;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                sc6.m10672m(gf4VarM11888b, th5);
                throw th6;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[LOOP:4: B:9:0x002e->B:114:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX INFO: renamed from: o */
    public void m6381o(uo1 uo1Var, int i, int i2) {
        Iterable iterable;
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        l73 l73Var;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        C1122rv c1122rv = (C1122rv) this.f20529c;
        ve4 ve4Var = new ve4(uo1Var);
        vq3 vq3Var = (vq3) c1122rv.f29652c;
        wu0 wu0Var = (wu0) c1122rv.f29651b;
        cp2 cp2Var = wu0Var.f33729a;
        if (i == i2) {
            iterable = v71.f32439a;
        } else {
            boolean z2 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            while (true) {
                if (z2) {
                    if (i3 < i2) {
                        linkedHashMap = cp2Var.f16332a;
                        if (z2) {
                            treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap2 == null) {
                                l73Var = null;
                            } else {
                                l73Var = new l73(treeMap2, treeMap2.descendingKeySet());
                            }
                        } else {
                            treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap == null) {
                                l73Var = null;
                            } else {
                                l73Var = new l73(treeMap, treeMap.keySet());
                            }
                        }
                        if (l73Var == null) {
                            Map map = (Map) l73Var.f23833a;
                            it = ((Iterable) l73Var.f23834b).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (!z2) {
                                    if (i2 <= iIntValue && iIntValue < i3) {
                                        arrayList.add(map.get(Integer.valueOf(iIntValue)));
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                        break;
                                    }
                                } else if (i3 + 1 <= iIntValue && iIntValue <= i2) {
                                    arrayList.add(map.get(Integer.valueOf(iIntValue)));
                                    z = true;
                                    i3 = iIntValue;
                                    break;
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                } else if (i3 > i2) {
                    linkedHashMap = cp2Var.f16332a;
                    if (z2) {
                        treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 == null) {
                            l73Var = null;
                        } else {
                            l73Var = new l73(treeMap2, treeMap2.descendingKeySet());
                        }
                    } else {
                        treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            l73Var = null;
                        } else {
                            l73Var = new l73(treeMap, treeMap.keySet());
                        }
                    }
                    if (l73Var == null) {
                        Map map2 = (Map) l73Var.f23833a;
                        it = ((Iterable) l73Var.f23834b).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (!z2) {
                                if (i3 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i2 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    iterable = null;
                } else {
                    iterable = arrayList;
                }
            }
        }
        if (iterable != null) {
            vq3Var.mo3417f(ve4Var);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((at2) it2.next()).mo3295b(ve4Var);
            }
            uq3 uq3VarMo3418g = vq3Var.mo3418g(ve4Var);
            if (uq3VarMo3418g.f32104b) {
                vq3Var.mo3416e();
                c1122rv.m10466y(ve4Var);
                return;
            } else {
                throw new IllegalStateException(("Migration didn't properly handle: " + uq3VarMo3418g.f32103a).toString());
            }
        }
        if (sj3.m10828x(wu0Var, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (wu0Var.f33739k) {
            gf4 gf4VarM11888b = ve4Var.m11888b("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                sl2 sl2VarM7680G = kx5.m7680G();
                while (gf4VarM11888b.mo5112g()) {
                    String strMo5110b = gf4VarM11888b.mo5110b(0);
                    if (!od4.m9043X(strMo5110b, "sqlite_", false) && !strMo5110b.equals("android_metadata")) {
                        sl2VarM7680G.add(new l73(strMo5110b, Boolean.valueOf(z62.m13387o(gf4VarM11888b.mo5110b(1), "view"))));
                    }
                }
                sl2 sl2VarM7740w = kx5.m7740w(sl2VarM7680G);
                sc6.m10672m(gf4VarM11888b, null);
                ListIterator listIterator = sl2VarM7740w.listIterator(0);
                while (true) {
                    ow1 ow1Var = (ow1) listIterator;
                    if (!ow1Var.hasNext()) {
                        break;
                    }
                    l73 l73Var2 = (l73) ow1Var.next();
                    String str = (String) l73Var2.f23833a;
                    if (((Boolean) l73Var2.f23834b).booleanValue()) {
                        zy5.m13843G(ve4Var, "DROP VIEW IF EXISTS " + str);
                    } else {
                        zy5.m13843G(ve4Var, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    sc6.m10672m(gf4VarM11888b, th);
                    throw th2;
                }
            }
        } else {
            vq3Var.mo3413b(ve4Var);
        }
        Iterator it3 = ((List) c1122rv.f29653d).iterator();
        while (it3.hasNext()) {
            ((w90) it3.next()).getClass();
        }
        vq3Var.mo3412a(ve4Var);
    }

    /* JADX INFO: renamed from: p */
    public void m6382p(long j) {
        int i = this.f20528b;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.f20529c)[i2]) {
                int i3 = this.f20528b - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.f20529c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.f20528b--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m6383q(C1116rp c1116rp) {
        C1116rp c1116rp2;
        int i = c1116rp.f29493f;
        if (i == -1) {
            C1077qn.m9987m("Failed requirement.");
            return;
        }
        int i2 = this.f20528b;
        C1116rp[] c1116rpArr = (C1116rp[]) this.f20529c;
        C1116rp c1116rp3 = c1116rpArr[i2];
        c1116rp.f29493f = -1;
        c1116rpArr[i2] = null;
        this.f20528b = i2 - 1;
        if (c1116rp == c1116rp3) {
            return;
        }
        int iM13394v = z62.m13394v(0L, c1116rp3.f29494g - c1116rp.f29494g);
        if (iM13394v == 0) {
            ((C1116rp[]) this.f20529c)[i] = c1116rp3;
            c1116rp3.f29493f = i;
            return;
        }
        if (iM13394v >= 0) {
            m6378l(i, c1116rp3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.f20528b;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                } else {
                    c1116rp2 = ((C1116rp[]) this.f20529c)[i3];
                }
            } else {
                C1116rp[] c1116rpArr2 = (C1116rp[]) this.f20529c;
                c1116rp2 = c1116rpArr2[i3];
                C1116rp c1116rp4 = c1116rpArr2[i4];
                if (z62.m13394v(0L, c1116rp4.f29494g - c1116rp2.f29494g) >= 0) {
                    c1116rp2 = c1116rp4;
                }
            }
            if (z62.m13394v(0L, c1116rp2.f29494g - c1116rp3.f29494g) <= 0) {
                break;
            }
            int i6 = c1116rp2.f29493f;
            c1116rp2.f29493f = i;
            ((C1116rp[]) this.f20529c)[i] = c1116rp2;
            i = i6;
        }
        ((C1116rp[]) this.f20529c)[i] = c1116rp3;
        c1116rp3.f29493f = i;
    }

    /* JADX INFO: renamed from: r */
    public synchronized void m6384r(gs2 gs2Var, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f20529c;
            Object arrayList = linkedHashMap.get(gs2Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(gs2Var, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            WeakReference weakReference = new WeakReference(bitmap);
            wk3 wk3Var = new wk3();
            wk3Var.f33447a = iIdentityHashCode;
            wk3Var.f33448b = weakReference;
            wk3Var.f33449c = map;
            wk3Var.f33450d = i;
            VarHandle.storeStoreFence();
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList2.add(wk3Var);
                    break;
                }
                wk3 wk3Var2 = (wk3) arrayList2.get(i2);
                if (i >= wk3Var2.f33450d) {
                    if (wk3Var2.f33447a != iIdentityHashCode || wk3Var2.f33448b.get() != bitmap) {
                        arrayList2.add(i2, wk3Var);
                        break;
                    } else {
                        arrayList2.set(i2, wk3Var);
                        break;
                    }
                }
                i2++;
            }
            int i3 = this.f20528b;
            this.f20528b = i3 + 1;
            if (i3 >= 10) {
                m6374f();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        switch (this.f20527a) {
            case 9:
                return new String((char[]) this.f20529c, 0, this.f20528b);
            default:
                return super.toString();
        }
    }

    @Override // p000.m62
    public void writeLong(long j) {
        mo6372d(String.valueOf(j));
    }

    public hf0(Shader shader, int i) {
        this.f20527a = (byte) 0;
        this.f20529c = shader;
        this.f20528b = i;
    }

    public /* synthetic */ hf0(byte b) {
        this.f20527a = b;
    }
}
