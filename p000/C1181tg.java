package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Trace;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: tg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1181tg implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31130a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31131b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f31132c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f31133d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f31134e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f31135f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f31136g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f31137h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f31138i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f31139j;

    public /* synthetic */ C1181tg(byte b) {
        this.f31130a = b;
    }

    /* JADX WARN: Code duplicated, block: B:281:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x01b4 A[LOOP:4: B:83:0x0179->B:98:0x01b4, LOOP_END] */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        boolean zM5166D;
        ju4 ju4Var;
        char c;
        long j;
        List list;
        List list2;
        boolean z;
        switch (this.f31130a) {
            case 0:
                ContentResolver contentResolver = (ContentResolver) this.f31131b;
                Method method = (Method) this.f31132c;
                String str = (String) this.f31134e;
                C1292wg c1292wg = new C1292wg((zo0) this.f31135f, (C1367yg) this.f31136g, (C0459am) this.f31137h, (Class) this.f31138i, (Method) this.f31133d, contentResolver, str, (Integer) this.f31139j);
                contentResolver.registerContentObserver((Uri) method.invoke(null, str), false, c1292wg);
                C0562d4 c0562d4 = new C0562d4((byte) 2);
                c0562d4.f16768b = contentResolver;
                c0562d4.f16769c = c1292wg;
                VarHandle.storeStoreFence();
                return c0562d4;
            default:
                ju4 ju4Var2 = ju4.f22634a;
                el3 el3Var = (el3) this.f31131b;
                mw2 mw2Var = (mw2) this.f31132c;
                mw2 mw2Var2 = (mw2) this.f31133d;
                List list3 = (List) this.f31134e;
                List list4 = (List) this.f31135f;
                mw2 mw2Var3 = (mw2) this.f31136g;
                List list5 = (List) this.f31137h;
                mw2 mw2Var4 = (mw2) this.f31138i;
                Set set = (Set) this.f31139j;
                long jLongValue = ((Long) obj).longValue();
                ac4 ac4Var = el3.f18213z;
                synchronized (el3Var.f18216c) {
                    zM5166D = el3Var.m5166D();
                }
                byte b = 1;
                if (zM5166D) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        C1122rv c1122rv = (C1122rv) el3Var.f18214a.f27604c;
                        C0942nd c0942nd = new C0942nd(b);
                        c0942nd.f25690b = jLongValue;
                        VarHandle.storeStoreFence();
                        c1122rv.m10453l(c0942nd);
                        synchronized (k94.f23012c) {
                            mw2 mw2Var5 = k94.f23019j.f29681h;
                            z = mw2Var5 != null && mw2Var5.m8416h();
                        }
                        if (z) {
                            k94.m7446c();
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    el3Var.m5176O();
                    synchronized (el3Var.f18216c) {
                        try {
                            uw2 uw2Var = el3Var.f18222i;
                            Object[] objArr = uw2Var.f32211a;
                            int i = uw2Var.f32213c;
                            for (int i2 = 0; i2 < i; i2++) {
                                list3.add((zi0) objArr[i2]);
                            }
                            el3Var.f18222i.m11668g();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    mw2Var.m8410b();
                    mw2Var2.m8410b();
                    while (true) {
                        if (list3.isEmpty() && list4.isEmpty()) {
                            e94 e94VarM7451h = k94.m7451h();
                            e94 gp4Var = e94VarM7451h instanceof rw2 ? new gp4((rw2) e94VarM7451h, null, null, true, false) : new hp4(e94VarM7451h, null, true, false);
                            try {
                                e94 e94VarM5018j = gp4Var.m5018j();
                                try {
                                    if (!list5.isEmpty()) {
                                        try {
                                            int size = list5.size();
                                            for (int i3 = 0; i3 < size; i3++) {
                                                mw2Var4.m8409a((zi0) list5.get(i3));
                                            }
                                            int size2 = list5.size();
                                            for (int i4 = 0; i4 < size2; i4++) {
                                                ((zi0) list5.get(i4)).m13577e();
                                            }
                                            list5.clear();
                                        } catch (Throwable th3) {
                                            try {
                                                el3Var.m5175N(th3, null);
                                                dl3.m4543i(el3Var, list3, list4, list5, mw2Var3, mw2Var4, mw2Var, mw2Var2);
                                                list5.clear();
                                                e94.m5011q(e94VarM5018j);
                                                gp4Var.mo3384c();
                                                Trace.endSection();
                                                return ju4Var2;
                                            } catch (Throwable th4) {
                                                list5.clear();
                                                throw th4;
                                            }
                                        }
                                    }
                                    if (mw2Var3.m8416h()) {
                                        try {
                                            mw2Var4.m8418j(mw2Var3);
                                            Object[] objArr2 = mw2Var3.f25258b;
                                            long[] jArr = mw2Var3.f25257a;
                                            c = 7;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i5 = 0;
                                                j = 255;
                                                while (true) {
                                                    long j2 = jArr[i5];
                                                    Object[] objArr3 = objArr2;
                                                    ju4Var = ju4Var2;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                                        long j3 = j2;
                                                        for (int i7 = 0; i7 < i6; i7++) {
                                                            if ((j3 & 255) < 128) {
                                                                try {
                                                                    ((zi0) objArr3[(i5 << 3) + i7]).m13579i();
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    try {
                                                                        el3Var.m5175N(th, null);
                                                                        dl3.m4543i(el3Var, list3, list4, list5, mw2Var3, mw2Var4, mw2Var, mw2Var2);
                                                                        mw2Var3.m8410b();
                                                                        e94.m5011q(e94VarM5018j);
                                                                        gp4Var.mo3384c();
                                                                        Trace.endSection();
                                                                        return ju4Var;
                                                                    } catch (Throwable th6) {
                                                                        mw2Var3.m8410b();
                                                                        throw th6;
                                                                    }
                                                                }
                                                            }
                                                            j3 >>= 8;
                                                        }
                                                        if (i6 == 8) {
                                                            if (i5 != length) {
                                                                i5++;
                                                                ju4Var2 = ju4Var;
                                                                objArr2 = objArr3;
                                                            }
                                                        }
                                                    } else if (i5 != length) {
                                                        i5++;
                                                        ju4Var2 = ju4Var;
                                                        objArr2 = objArr3;
                                                    }
                                                }
                                            } else {
                                                ju4Var = ju4Var2;
                                                j = 255;
                                            }
                                            mw2Var3.m8410b();
                                        } catch (Throwable th7) {
                                            th = th7;
                                            ju4Var = ju4Var2;
                                        }
                                    } else {
                                        ju4Var = ju4Var2;
                                        c = 7;
                                        j = 255;
                                    }
                                    if (mw2Var4.m8416h()) {
                                        try {
                                            Object[] objArr4 = mw2Var4.f25258b;
                                            long[] jArr2 = mw2Var4.f25257a;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = 0;
                                                while (true) {
                                                    long j4 = jArr2[i8];
                                                    list = list3;
                                                    list2 = list4;
                                                    if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        for (int i10 = 0; i10 < i9; i10++) {
                                                            if ((j4 & j) < 128) {
                                                                try {
                                                                    ((zi0) objArr4[(i8 << 3) + i10]).m13580j();
                                                                    break;
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    try {
                                                                        el3Var.m5175N(th, null);
                                                                        dl3.m4543i(el3Var, list, list2, list5, mw2Var3, mw2Var4, mw2Var, mw2Var2);
                                                                        mw2Var4.m8410b();
                                                                        e94.m5011q(e94VarM5018j);
                                                                        gp4Var.mo3384c();
                                                                        Trace.endSection();
                                                                        return ju4Var;
                                                                    } catch (Throwable th9) {
                                                                        mw2Var4.m8410b();
                                                                        throw th9;
                                                                    }
                                                                }
                                                            }
                                                            j4 >>= 8;
                                                        }
                                                        if (i9 == 8) {
                                                        }
                                                    }
                                                    if (i8 != length2) {
                                                        i8++;
                                                        list3 = list;
                                                        list4 = list2;
                                                    }
                                                }
                                            }
                                            mw2Var4.m8410b();
                                        } catch (Throwable th10) {
                                            th = th10;
                                            list = list3;
                                            list2 = list4;
                                        }
                                    }
                                    e94.m5011q(e94VarM5018j);
                                    gp4Var.mo3384c();
                                    synchronized (el3Var.f18216c) {
                                        if (el3Var.m5165C() != null) {
                                            qi0.m9889a("unexpected to get continuation here");
                                            break;
                                        }
                                    }
                                    k94.m7451h().mo5021m();
                                    mw2Var2.m8410b();
                                    mw2Var.m8410b();
                                    el3Var.f18230q = null;
                                } catch (Throwable th11) {
                                    e94.m5011q(e94VarM5018j);
                                    throw th11;
                                }
                            } catch (Throwable th12) {
                                gp4Var.mo3384c();
                                throw th12;
                            }
                        } else {
                            ju4Var = ju4Var2;
                            try {
                                int size3 = list3.size();
                                for (int i11 = 0; i11 < size3; i11++) {
                                    zi0 zi0Var = (zi0) list3.get(i11);
                                    zi0 zi0VarM5174M = el3Var.m5174M(zi0Var, mw2Var);
                                    if (zi0VarM5174M != null) {
                                        list5.add(zi0VarM5174M);
                                    }
                                    mw2Var2.m8409a(zi0Var);
                                }
                                list3.clear();
                                if (mw2Var.m8416h() || el3Var.f18222i.f32213c != 0) {
                                    synchronized (el3Var.f18216c) {
                                        try {
                                            List listM5170H = el3Var.m5170H();
                                            int size4 = listM5170H.size();
                                            for (int i12 = 0; i12 < size4; i12++) {
                                                zi0 zi0Var2 = (zi0) listM5170H.get(i12);
                                                if (!mw2Var2.m8411c(zi0Var2) && zi0Var2.m13593x(set)) {
                                                    list3.add(zi0Var2);
                                                }
                                            }
                                            uw2 uw2Var2 = el3Var.f18222i;
                                            int i13 = uw2Var2.f32213c;
                                            int i14 = 0;
                                            int i15 = 0;
                                            while (true) {
                                                Object[] objArr5 = uw2Var2.f32211a;
                                                if (i14 < i13) {
                                                    zi0 zi0Var3 = (zi0) objArr5[i14];
                                                    if (!mw2Var2.m8411c(zi0Var3) && !list3.contains(zi0Var3)) {
                                                        list3.add(zi0Var3);
                                                        i15++;
                                                    } else if (i15 > 0) {
                                                        Object[] objArr6 = uw2Var2.f32211a;
                                                        objArr6[i14 - i15] = objArr6[i14];
                                                    }
                                                    i14++;
                                                } else {
                                                    int i16 = i13 - i15;
                                                    Arrays.fill(objArr5, i16, i13, (Object) null);
                                                    uw2Var2.f32213c = i16;
                                                }
                                            }
                                        } catch (Throwable th13) {
                                            throw th13;
                                        }
                                    }
                                }
                                if (list3.isEmpty()) {
                                    try {
                                        dl3.m4544k(list4, el3Var);
                                        while (!list4.isEmpty()) {
                                            List listM5173L = el3Var.m5173L(list4, mw2Var);
                                            mw2Var3.getClass();
                                            Iterator it = listM5173L.iterator();
                                            while (it.hasNext()) {
                                                mw2Var3.m8419k(it.next());
                                            }
                                            dl3.m4544k(list4, el3Var);
                                        }
                                    } catch (Throwable th14) {
                                        el3Var.m5175N(th14, null);
                                        dl3.m4543i(el3Var, list3, list4, list5, mw2Var3, mw2Var4, mw2Var, mw2Var2);
                                    }
                                }
                                ju4Var2 = ju4Var;
                            } catch (Throwable th15) {
                                try {
                                    el3Var.m5175N(th15, null);
                                    dl3.m4543i(el3Var, list3, list4, list5, mw2Var3, mw2Var4, mw2Var, mw2Var2);
                                    list3.clear();
                                } catch (Throwable th16) {
                                    list3.clear();
                                    throw th16;
                                }
                            }
                        }
                        Trace.endSection();
                        return ju4Var;
                    }
                } catch (Throwable th17) {
                    Trace.endSection();
                    throw th17;
                }
        }
    }
}
