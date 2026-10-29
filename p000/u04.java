package p000;

import android.app.RemoteAction;
import android.graphics.BitmapFactory;
import android.view.textclassifier.TextClassification;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u04 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31580a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31581b;

    public /* synthetic */ u04(byte b) {
        this.f31580a = b;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0212 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0214 A[LOOP:1: B:70:0x01d9->B:83:0x0214, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Collection collectionM6310V0;
        byte b = this.f31580a;
        y14 y14Var = null;
        Object obj4 = this.f31581b;
        switch (b) {
            case 0:
                ((lc3) obj).m7952a();
                ((pl3) obj4).f27736a = ((b33) obj2).f15059a;
                return ju4.f22634a;
            case 1:
                o54 o54Var = (o54) obj4;
                ((Integer) obj2).getClass();
                ir1 ir1Var = (ir1) ((mi0) obj);
                ir1Var.m6885d0(44107266);
                Object objM6869O = ir1Var.m6869O();
                Object obj5 = objM6869O;
                if (objM6869O == ki0.f23136a) {
                    n54 n54Var = new n54();
                    n54Var.f25471a = o54Var;
                    o54Var.f26354a++;
                    t82 t82Var = o54Var.f26356c;
                    if (t82Var != null) {
                        t82Var.mo4993a(null);
                        o54Var.f26356c = null;
                    }
                    if (o54Var.f26355b == null) {
                        ui0 ui0Var = o54Var.f26358e;
                        mq1 mq1Var = o54Var.f26359f;
                        er1 er1Var = new er1((byte) 15);
                        er1Var.f18412b = o54Var;
                        er1Var.f18413c = mq1Var;
                        VarHandle.storeStoreFence();
                        o54Var.f26355b = k43.m7373G(ui0Var, new pg0(-497441144, true, er1Var));
                    }
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(n54Var);
                    obj5 = n54Var;
                }
                Object value = o54Var.f26357d.getValue();
                ir1Var.m6912r(false);
                return value;
            case 2:
                byte[] bArr = ((ea3) obj4).f17929c;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var;
                if (ir1Var2.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zM6890g = ir1Var2.m6890g(bArr);
                    Object objM6869O2 = ir1Var2.m6869O();
                    if (zM6890g || objM6869O2 == ki0.f23136a) {
                        objM6869O2 = new C0759ie(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                        ir1Var2.m6905n0(objM6869O2);
                    }
                    d24.m4302c((t02) objM6869O2, null, ir1Var2, 48, 252);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4.f22634a;
            case 3:
                z64 z64Var = (z64) obj4;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var3 = (ir1) mi0Var2;
                if (ir1Var3.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z64Var.f35794b.m8898a(0, ir1Var3);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4.f22634a;
            case 4:
                d74 d74Var = (d74) obj4;
                Set set = (Set) obj;
                synchronized (d74Var.f36084a) {
                    try {
                        mw2 mw2Var = d74Var.f16825h;
                        if (mw2Var != null) {
                            Object[] objArr = mw2Var.f25258b;
                            long[] jArr = mw2Var.f25257a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i = 0;
                                while (true) {
                                    long j = jArr[i];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i2 = 8 - ((~(i - length)) >>> 31);
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 < i2) {
                                                if ((255 & j) >= 128 || !set.contains(objArr[(i << 3) + i3])) {
                                                    j >>= 8;
                                                    i3++;
                                                } else {
                                                    y14Var = d74Var.f16827j;
                                                }
                                            } else if (i2 == 8) {
                                                if (i != length) {
                                                    i++;
                                                }
                                            }
                                        }
                                    } else if (i != length) {
                                        i++;
                                    }
                                }
                            }
                        } else if (hb0.m6294F0(set, d74Var.f16823f)) {
                            y14Var = d74Var.f16827j;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (y14Var != null) {
                    o80.m8978a(y14Var.mo5493n(ju4.f22634a));
                }
                return ju4.f22634a;
            case 5:
                aa4 aa4Var = (aa4) obj4;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = aa4Var.f211b;
                do {
                    obj3 = atomicReference.get();
                    if (obj3 == null) {
                        collectionM6310V0 = collection;
                    } else if (obj3 instanceof Set) {
                        collectionM6310V0 = kx5.m7694Y(obj3, collection);
                    } else {
                        if (!(obj3 instanceof List)) {
                            qi0.m9890b("Unexpected notification");
                            xy4.m12794w();
                            return null;
                        }
                        collectionM6310V0 = hb0.m6310V0((Collection) obj3, Collections.singletonList(collection));
                    }
                } while (!atomicReference.compareAndSet(obj3, collectionM6310V0));
                if (aa4Var.m157c()) {
                    yp1 yp1Var = aa4Var.f210a;
                    g32 g32Var = new g32((byte) 27);
                    g32Var.f19558b = aa4Var;
                    VarHandle.storeStoreFence();
                    yp1Var.invoke(g32Var);
                }
                return ju4.f22634a;
            case 6:
                int iM6344j0 = hd4.m6344j0((CharSequence) obj, (char[]) obj4, ((Integer) obj2).intValue(), false);
                if (iM6344j0 < 0) {
                    return null;
                }
                return new l73(Integer.valueOf(iM6344j0), 1);
            case 7:
                nh4 nh4Var = (nh4) obj4;
                ((Integer) obj2).getClass();
                ir1 ir1Var4 = (ir1) ((mi0) obj);
                ir1Var4.m6885d0(-1931661951);
                Object objM6869O3 = ir1Var4.m6869O();
                i50 i50Var = ki0.f23136a;
                Object obj6 = objM6869O3;
                if (objM6869O3 == i50Var) {
                    lh4 lh4Var = new lh4();
                    lh4Var.f24039d = nh4Var;
                    lh4Var.f24036a = new ArrayList();
                    VarHandle.storeStoreFence();
                    ir1Var4.m6905n0(lh4Var);
                    obj6 = lh4Var;
                }
                lh4 lh4Var2 = (lh4) obj6;
                AbstractC0637f4.m5466a(new C0004a3(0, 64), null, ir1Var4, 0, 2);
                boolean zM6894i = ir1Var4.m6894i(lh4Var2);
                Object objM6869O4 = ir1Var4.m6869O();
                Object obj7 = objM6869O4;
                if (zM6894i || objM6869O4 == i50Var) {
                    o04 o04Var = new o04((byte) 10);
                    o04Var.f26271b = lh4Var2;
                    VarHandle.storeStoreFence();
                    ir1Var4.m6905n0(o04Var);
                    obj7 = o04Var;
                }
                AbstractC0637f4.m5467b(4194304, false, null, (yp1) obj7, ir1Var4, 6, 6);
                ir1Var4.m6912r(false);
                return lh4Var2;
            case 8:
                ((Integer) obj2).intValue();
                ir1 ir1Var5 = (ir1) ((mi0) obj);
                ir1Var5.m6885d0(950061013);
                String strValueOf = String.valueOf(((TextClassification) obj4).getLabel());
                ir1Var5.m6912r(false);
                return strValueOf;
            case 9:
                ((Integer) obj2).intValue();
                ir1 ir1Var6 = (ir1) ((mi0) obj);
                ir1Var6.m6885d0(-1376593684);
                String string = ((RemoteAction) obj4).getTitle().toString();
                ir1Var6.m6912r(false);
                return string;
            case 10:
                en3 en3Var = (en3) obj4;
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ir1 ir1Var7 = (ir1) mi0Var3;
                if (ir1Var7.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    n40.m8492a(en3Var, null, false, ir1Var7, 0);
                } else {
                    ir1Var7.m6874W();
                }
                return ju4.f22634a;
            case 11:
                ((el1) obj4).invoke(obj);
                return ju4.f22634a;
            case 12:
                return o52.m8954a(((long) ((C0779iz) obj4).m6970a(0, (int) (((w52) obj).f33109a >> 32), (df2) obj2)) << 32);
            case 13:
                return o52.m8954a(((long) ((C0816jz) obj4).m7343a(0, (int) (((w52) obj).f33109a & 4294967295L))) & 4294967295L);
            default:
                return o52.m8954a(((InterfaceC0520ca) obj4).mo3927a(0L, ((w52) obj).f33109a, (df2) obj2));
        }
    }
}
