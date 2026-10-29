package p000;

import ads_mobile_sdk.C0200km;
import ads_mobile_sdk.C0217lc;
import ads_mobile_sdk.aq1;
import ads_mobile_sdk.b11;
import ads_mobile_sdk.b40;
import ads_mobile_sdk.cy3;
import ads_mobile_sdk.d63;
import ads_mobile_sdk.e33;
import ads_mobile_sdk.ff3;
import ads_mobile_sdk.fy3;
import ads_mobile_sdk.j10;
import ads_mobile_sdk.j31;
import ads_mobile_sdk.kx2;
import ads_mobile_sdk.mx3;
import ads_mobile_sdk.s21;
import ads_mobile_sdk.ux0;
import ads_mobile_sdk.w01;
import ads_mobile_sdk.w11;
import ads_mobile_sdk.xa3;
import android.os.SystemClock;
import androidx.work.impl.WorkDatabase;
import java.io.Closeable;
import java.lang.invoke.VarHandle;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vs0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f32822t = 2;

    /* JADX INFO: renamed from: u */
    public Object f32823u;

    /* JADX INFO: renamed from: v */
    public byte f32824v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f32825w;

    /* JADX INFO: renamed from: x */
    public Object f32826x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f32827y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f32828z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(wm0 wm0Var, yp1 yp1Var, WorkDatabase workDatabase, boolean z) {
        super(2, wm0Var);
        this.f32825w = z;
        this.f32827y = workDatabase;
        this.f32828z = yp1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f32822t;
        boolean z = this.f32825w;
        Object obj2 = this.f32828z;
        Object obj3 = this.f32827y;
        switch (b) {
            case 0:
                vs0 vs0Var = new vs0(wm0Var, (yp1) obj2, (WorkDatabase) obj3, z);
                vs0Var.f32823u = obj;
                return vs0Var;
            case 1:
                return new vs0((j10) obj3, z, (String) obj2, wm0Var);
            default:
                return new vs0((ff3) obj3, (i82) obj2, z, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32822t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((vs0) create((wm0) obj2, (cf4) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((vs0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((vs0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bd A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:81:0x018d, B:83:0x0194, B:85:0x0198, B:87:0x019c, B:90:0x01a2, B:92:0x01a6, B:94:0x01aa, B:96:0x01ae, B:97:0x01af, B:98:0x01b4, B:99:0x01b5, B:100:0x01bc, B:101:0x01bd, B:102:0x01c4, B:103:0x01c5), top: B:180:0x018d }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01c5 A[Catch: all -> 0x01a0, TRY_LEAVE, TryCatch #0 {all -> 0x01a0, blocks: (B:81:0x018d, B:83:0x0194, B:85:0x0198, B:87:0x019c, B:90:0x01a2, B:92:0x01a6, B:94:0x01aa, B:96:0x01ae, B:97:0x01af, B:98:0x01b4, B:99:0x01b5, B:100:0x01bc, B:101:0x01bd, B:102:0x01c4, B:103:0x01c5), top: B:180:0x018d }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:112:0x01de  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f6 A[Catch: all -> 0x0202, TryCatch #1 {all -> 0x0202, blocks: (B:118:0x01ef, B:120:0x01f6, B:122:0x01fa, B:124:0x01fe, B:127:0x0204, B:129:0x0208, B:131:0x020c, B:133:0x0210, B:134:0x0211, B:135:0x0216, B:136:0x0217, B:137:0x021e, B:138:0x021f, B:139:0x0226, B:140:0x0227), top: B:181:0x01ef }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0208 A[Catch: all -> 0x0202, TryCatch #1 {all -> 0x0202, blocks: (B:118:0x01ef, B:120:0x01f6, B:122:0x01fa, B:124:0x01fe, B:127:0x0204, B:129:0x0208, B:131:0x020c, B:133:0x0210, B:134:0x0211, B:135:0x0216, B:136:0x0217, B:137:0x021e, B:138:0x021f, B:139:0x0226, B:140:0x0227), top: B:181:0x01ef }] */
    /* JADX WARN: Code duplicated, block: B:131:0x020c A[Catch: all -> 0x0202, TryCatch #1 {all -> 0x0202, blocks: (B:118:0x01ef, B:120:0x01f6, B:122:0x01fa, B:124:0x01fe, B:127:0x0204, B:129:0x0208, B:131:0x020c, B:133:0x0210, B:134:0x0211, B:135:0x0216, B:136:0x0217, B:137:0x021e, B:138:0x021f, B:139:0x0226, B:140:0x0227), top: B:181:0x01ef }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0210 A[Catch: all -> 0x0202, TryCatch #1 {all -> 0x0202, blocks: (B:118:0x01ef, B:120:0x01f6, B:122:0x01fa, B:124:0x01fe, B:127:0x0204, B:129:0x0208, B:131:0x020c, B:133:0x0210, B:134:0x0211, B:135:0x0216, B:136:0x0217, B:137:0x021e, B:138:0x021f, B:139:0x0226, B:140:0x0227), top: B:181:0x01ef }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0211 A[Catch: all -> 0x0202, TryCatch #1 {all -> 0x0202, blocks: (B:118:0x01ef, B:120:0x01f6, B:122:0x01fa, B:124:0x01fe, B:127:0x0204, B:129:0x0208, B:131:0x020c, B:133:0x0210, B:134:0x0211, B:135:0x0216, B:136:0x0217, B:137:0x021e, B:138:0x021f, B:139:0x0226, B:140:0x0227), top: B:181:0x01ef }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0217 A[Catch: all -> 0x0202, TryCatch #1 {all -> 0x0202, blocks: (B:118:0x01ef, B:120:0x01f6, B:122:0x01fa, B:124:0x01fe, B:127:0x0204, B:129:0x0208, B:131:0x020c, B:133:0x0210, B:134:0x0211, B:135:0x0216, B:136:0x0217, B:137:0x021e, B:138:0x021f, B:139:0x0226, B:140:0x0227), top: B:181:0x01ef }] */
    /* JADX WARN: Code duplicated, block: B:138:0x021f A[Catch: all -> 0x0202, TryCatch #1 {all -> 0x0202, blocks: (B:118:0x01ef, B:120:0x01f6, B:122:0x01fa, B:124:0x01fe, B:127:0x0204, B:129:0x0208, B:131:0x020c, B:133:0x0210, B:134:0x0211, B:135:0x0216, B:136:0x0217, B:137:0x021e, B:138:0x021f, B:139:0x0226, B:140:0x0227), top: B:181:0x01ef }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0227 A[Catch: all -> 0x0202, TRY_LEAVE, TryCatch #1 {all -> 0x0202, blocks: (B:118:0x01ef, B:120:0x01f6, B:122:0x01fa, B:124:0x01fe, B:127:0x0204, B:129:0x0208, B:131:0x020c, B:133:0x0210, B:134:0x0211, B:135:0x0216, B:136:0x0217, B:137:0x021e, B:138:0x021f, B:139:0x0226, B:140:0x0227), top: B:181:0x01ef }] */
    /* JADX WARN: Code duplicated, block: B:170:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:176:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0115 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #3 {all -> 0x00d6, blocks: (B:51:0x00d2, B:64:0x010d, B:66:0x0115, B:68:0x011d), top: B:184:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x011d A[Catch: all -> 0x00d6, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00d6, blocks: (B:51:0x00d2, B:64:0x010d, B:66:0x0115, B:68:0x011d), top: B:184:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x016a  */
    /* JADX WARN: Code duplicated, block: B:75:0x017b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0194 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:81:0x018d, B:83:0x0194, B:85:0x0198, B:87:0x019c, B:90:0x01a2, B:92:0x01a6, B:94:0x01aa, B:96:0x01ae, B:97:0x01af, B:98:0x01b4, B:99:0x01b5, B:100:0x01bc, B:101:0x01bd, B:102:0x01c4, B:103:0x01c5), top: B:180:0x018d }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01a6 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:81:0x018d, B:83:0x0194, B:85:0x0198, B:87:0x019c, B:90:0x01a2, B:92:0x01a6, B:94:0x01aa, B:96:0x01ae, B:97:0x01af, B:98:0x01b4, B:99:0x01b5, B:100:0x01bc, B:101:0x01bd, B:102:0x01c4, B:103:0x01c5), top: B:180:0x018d }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01aa A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:81:0x018d, B:83:0x0194, B:85:0x0198, B:87:0x019c, B:90:0x01a2, B:92:0x01a6, B:94:0x01aa, B:96:0x01ae, B:97:0x01af, B:98:0x01b4, B:99:0x01b5, B:100:0x01bc, B:101:0x01bd, B:102:0x01c4, B:103:0x01c5), top: B:180:0x018d }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01ae A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:81:0x018d, B:83:0x0194, B:85:0x0198, B:87:0x019c, B:90:0x01a2, B:92:0x01a6, B:94:0x01aa, B:96:0x01ae, B:97:0x01af, B:98:0x01b4, B:99:0x01b5, B:100:0x01bc, B:101:0x01bd, B:102:0x01c4, B:103:0x01c5), top: B:180:0x018d }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01af A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:81:0x018d, B:83:0x0194, B:85:0x0198, B:87:0x019c, B:90:0x01a2, B:92:0x01a6, B:94:0x01aa, B:96:0x01ae, B:97:0x01af, B:98:0x01b4, B:99:0x01b5, B:100:0x01bc, B:101:0x01bd, B:102:0x01c4, B:103:0x01c5), top: B:180:0x018d }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b5 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:81:0x018d, B:83:0x0194, B:85:0x0198, B:87:0x019c, B:90:0x01a2, B:92:0x01a6, B:94:0x01aa, B:96:0x01ae, B:97:0x01af, B:98:0x01b4, B:99:0x01b5, B:100:0x01bc, B:101:0x01bd, B:102:0x01c4, B:103:0x01c5), top: B:180:0x018d }] */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x028d, code lost:
    
        if (r14.m8568a(r13) == r9) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (ads_mobile_sdk.ux0.m2494a(r2, r0, (p000.wa2) r14, r3, r13) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v21, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v43, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r13v45, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        qo4 qo4Var;
        cf4 cf4Var;
        cf4 cf4Var2;
        Object objM4013c;
        Object obj2;
        gx2 gx2Var;
        j10 j10Var;
        gx2 gx2Var2;
        xa3 xa3Var;
        s21 s21Var;
        v71 v71Var;
        fy3 fy3Var;
        j10 j10Var2;
        boolean z;
        String str;
        mx3 mx3VarM655a;
        Closeable closeable;
        zm4 th;
        ?? r13;
        Object objM1355a;
        kx2 kx2VarM2635a;
        Closeable closeable2;
        zm4 th2;
        ?? r14;
        Object objM1355a2;
        Boolean bool;
        ux0 ux0Var;
        C0200km c0200km;
        byte b = 1;
        wm0 wm0Var = null;
        switch (this.f32822t) {
            case 0:
                yp1 yp1Var = (yp1) this.f32828z;
                WorkDatabase workDatabase = (WorkDatabase) this.f32827y;
                boolean z2 = this.f32825w;
                ap0 ap0Var = ap0.f14763a;
                byte b2 = this.f32824v;
                if (b2 == 0) {
                    k43.m7376J(obj);
                    return yp1Var.invoke(((cf4) this.f32823u).mo2969b());
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        qo4Var = (qo4) this.f32826x;
                        cf4Var = (cf4) this.f32823u;
                        k43.m7376J(obj);
                    } else {
                        if (b2 == 3) {
                            cf4Var2 = (cf4) this.f32823u;
                            k43.m7376J(obj);
                            if (!z2) {
                                return obj;
                            }
                            this.f32823u = obj;
                            this.f32824v = (byte) 4;
                            objM4013c = cf4Var2.m4013c(this);
                            if (objM4013c != ap0Var) {
                                obj2 = obj;
                                obj = objM4013c;
                            }
                            return ap0Var;
                        }
                        if (b2 != 4) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj3 = this.f32823u;
                        k43.m7376J(obj);
                        obj2 = obj3;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        return obj2;
                    }
                    n72 n72VarM3064g = workDatabase.m3064g();
                    n72VarM3064g.f25491b.m8373e(n72VarM3064g.f25494e, n72VarM3064g.f25495f);
                    return obj2;
                }
                qo4Var = (qo4) this.f32826x;
                cf4 cf4Var3 = (cf4) this.f32823u;
                k43.m7376J(obj);
                if (!((Boolean) obj).booleanValue()) {
                    n72 n72VarM3064g2 = workDatabase.m3064g();
                    this.f32823u = cf4Var3;
                    this.f32826x = qo4Var;
                    this.f32824v = (byte) 2;
                }
                cf4Var = cf4Var3;
                break;
                qs0 qs0Var = new qs0(wm0Var, yp1Var, b);
                this.f32823u = cf4Var;
                this.f32826x = null;
                this.f32824v = (byte) 3;
                obj = cf4Var.m4015e(qo4Var, qs0Var, this);
                if (obj != ap0Var) {
                    cf4Var2 = cf4Var;
                    if (!z2) {
                        return obj;
                    }
                    this.f32823u = obj;
                    this.f32824v = (byte) 4;
                    objM4013c = cf4Var2.m4013c(this);
                    if (objM4013c != ap0Var) {
                        obj2 = obj;
                        obj = objM4013c;
                        if (!((Boolean) obj).booleanValue()) {
                            return obj2;
                        }
                        n72 n72VarM3064g3 = workDatabase.m3064g();
                        n72VarM3064g3.f25491b.m8373e(n72VarM3064g3.f25494e, n72VarM3064g3.f25495f);
                        return obj2;
                    }
                }
                return ap0Var;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                byte b3 = this.f32824v;
                try {
                    if (b3 == 0) {
                        k43.m7376J(obj);
                        j10 j10Var3 = (j10) this.f32827y;
                        gx2 gx2Var3 = j10Var3.f5510u;
                        this.f32823u = gx2Var3;
                        this.f32826x = j10Var3;
                        this.f32824v = (byte) 1;
                        if (gx2Var3.m6191e(this) != ap0Var2) {
                            gx2Var = gx2Var3;
                            j10Var = j10Var3;
                        }
                        return ap0Var2;
                    }
                    if (b3 != 1) {
                        if (b3 != 2) {
                            if (b3 == 3) {
                                closeable2 = (Closeable) this.f32826x;
                                r14 = (mx3) this.f32823u;
                                try {
                                    k43.m7376J(obj);
                                    r14 = r14;
                                    bool = (Boolean) obj;
                                    bool.getClass();
                                    lb5.m7941v(closeable2, null);
                                    return bool;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    try {
                                        r14.m1736b(th2);
                                        if (!(th2 instanceof ka5)) {
                                            throw th2;
                                        }
                                        if (!(th2 instanceof zm4) && !(th2 instanceof CancellationException)) {
                                            r14.m1735a(th2);
                                        }
                                        if (!(th2 instanceof zm4)) {
                                            throw new j31(th2);
                                        }
                                        if (!(th2 instanceof CancellationException)) {
                                            throw new w01(th2);
                                        }
                                        if (th2 instanceof w11) {
                                            throw th2;
                                        }
                                        throw new b11(th2);
                                    } catch (Throwable th4) {
                                        try {
                                            throw th4;
                                        } catch (Throwable th5) {
                                            lb5.m7941v(closeable2, th4);
                                            throw th5;
                                        }
                                    }
                                }
                            }
                            if (b3 != 4) {
                                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            closeable = (Closeable) this.f32826x;
                            r13 = (mx3) this.f32823u;
                            try {
                                k43.m7376J(obj);
                                r13 = r13;
                                bool = (Boolean) obj;
                                bool.getClass();
                                lb5.m7941v(closeable, null);
                                return bool;
                            } catch (Throwable th6) {
                                th = th6;
                                try {
                                    r13.m1736b(th);
                                    if (!(th instanceof ka5)) {
                                        throw th;
                                    }
                                    if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                                        r13.m1735a(th);
                                    }
                                    if (!(th instanceof zm4)) {
                                        throw new j31(th);
                                    }
                                    if (!(th instanceof CancellationException)) {
                                        throw new w01(th);
                                    }
                                    if (th instanceof w11) {
                                        throw th;
                                    }
                                    throw new b11(th);
                                } catch (Throwable th7) {
                                    try {
                                        throw th7;
                                    } catch (Throwable th8) {
                                        lb5.m7941v(closeable, th7);
                                        throw th8;
                                    }
                                }
                            }
                        }
                        j10Var = (j10) this.f32826x;
                        gx2Var2 = (gx2) this.f32823u;
                        try {
                            k43.m7376J(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                Boolean bool2 = Boolean.FALSE;
                                gx2Var2.m6193g(null);
                                return bool2;
                            }
                            r50 r50Var = i41.f21117b;
                            j10Var.f5501l.getClass();
                            j10Var.f5512w = as4.m3239R(SystemClock.elapsedRealtime(), m41.MILLISECONDS);
                            j10Var.f5511v = true;
                            gx2Var2.m6193g(null);
                            xa3Var = ((j10) this.f32827y).f5503n;
                            s21Var = s21.f11094f;
                            v71Var = v71.f32439a;
                            fy3Var = new fy3(new e33(), new aq1(), new d63(), new C0217lc());
                            j10Var2 = (j10) this.f32827y;
                            z = this.f32825w;
                            str = (String) this.f32828z;
                            if (cy3.m656b().f1710a == null) {
                                kx2VarM2635a = xa3.m2635a(xa3Var, s21Var, v71Var, fy3Var);
                                try {
                                    this.f32823u = kx2VarM2635a;
                                    this.f32826x = kx2VarM2635a;
                                    this.f32824v = (byte) 3;
                                    objM1355a2 = j10.m1355a(j10Var2, z, str, this);
                                    if (objM1355a2 != ap0Var2) {
                                        closeable2 = kx2VarM2635a;
                                        obj = objM1355a2;
                                        r14 = closeable2;
                                        bool = (Boolean) obj;
                                        bool.getClass();
                                        lb5.m7941v(closeable2, null);
                                        return bool;
                                    }
                                } catch (Throwable th9) {
                                    closeable2 = kx2VarM2635a;
                                    th2 = th9;
                                    r14 = closeable2;
                                    r14.m1736b(th2);
                                    if (!(th2 instanceof ka5)) {
                                        throw th2;
                                    }
                                    if (!(th2 instanceof zm4)) {
                                        r14.m1735a(th2);
                                    }
                                    if (!(th2 instanceof zm4)) {
                                        throw new j31(th2);
                                    }
                                    if (!(th2 instanceof CancellationException)) {
                                        throw new w01(th2);
                                    }
                                    if (th2 instanceof w11) {
                                        throw th2;
                                    }
                                    throw new b11(th2);
                                }
                            } else {
                                mx3VarM655a = cy3.m655a(s21Var, v71Var, true);
                                try {
                                    this.f32823u = mx3VarM655a;
                                    this.f32826x = mx3VarM655a;
                                    this.f32824v = (byte) 4;
                                    objM1355a = j10.m1355a(j10Var2, z, str, this);
                                    if (objM1355a != ap0Var2) {
                                        closeable = mx3VarM655a;
                                        obj = objM1355a;
                                        r13 = closeable;
                                        bool = (Boolean) obj;
                                        bool.getClass();
                                        lb5.m7941v(closeable, null);
                                        return bool;
                                    }
                                } catch (Throwable th10) {
                                    closeable = mx3VarM655a;
                                    th = th10;
                                    r13 = closeable;
                                    r13.m1736b(th);
                                    if (!(th instanceof ka5)) {
                                        throw th;
                                    }
                                    if (!(th instanceof zm4)) {
                                        r13.m1735a(th);
                                    }
                                    if (!(th instanceof zm4)) {
                                        throw new j31(th);
                                    }
                                    if (!(th instanceof CancellationException)) {
                                        throw new w01(th);
                                    }
                                    if (th instanceof w11) {
                                        throw th;
                                    }
                                    throw new b11(th);
                                }
                            }
                            return ap0Var2;
                        } catch (Throwable th11) {
                            th = th11;
                            gx2Var2.m6193g(null);
                            throw th;
                        }
                    }
                    j10Var = (j10) this.f32826x;
                    gx2Var = (gx2) this.f32823u;
                    k43.m7376J(obj);
                    this.f32823u = gx2Var;
                    this.f32826x = j10Var;
                    this.f32824v = (byte) 2;
                    obj = j10.m1353a(j10Var, this);
                    if (obj != ap0Var2) {
                        gx2Var2 = gx2Var;
                        if (!((Boolean) obj).booleanValue()) {
                            Boolean bool3 = Boolean.FALSE;
                            gx2Var2.m6193g(null);
                            return bool3;
                        }
                        r50 r50Var2 = i41.f21117b;
                        j10Var.f5501l.getClass();
                        j10Var.f5512w = as4.m3239R(SystemClock.elapsedRealtime(), m41.MILLISECONDS);
                        j10Var.f5511v = true;
                        gx2Var2.m6193g(null);
                        xa3Var = ((j10) this.f32827y).f5503n;
                        s21Var = s21.f11094f;
                        v71Var = v71.f32439a;
                        fy3Var = new fy3(new e33(), new aq1(), new d63(), new C0217lc());
                        j10Var2 = (j10) this.f32827y;
                        z = this.f32825w;
                        str = (String) this.f32828z;
                        if (cy3.m656b().f1710a == null) {
                            kx2VarM2635a = xa3.m2635a(xa3Var, s21Var, v71Var, fy3Var);
                            this.f32823u = kx2VarM2635a;
                            this.f32826x = kx2VarM2635a;
                            this.f32824v = (byte) 3;
                            objM1355a2 = j10.m1355a(j10Var2, z, str, this);
                            if (objM1355a2 != ap0Var2) {
                                closeable2 = kx2VarM2635a;
                                obj = objM1355a2;
                                r14 = closeable2;
                                bool = (Boolean) obj;
                                bool.getClass();
                                lb5.m7941v(closeable2, null);
                                return bool;
                            }
                        } else {
                            mx3VarM655a = cy3.m655a(s21Var, v71Var, true);
                            this.f32823u = mx3VarM655a;
                            this.f32826x = mx3VarM655a;
                            this.f32824v = (byte) 4;
                            objM1355a = j10.m1355a(j10Var2, z, str, this);
                            if (objM1355a != ap0Var2) {
                                closeable = mx3VarM655a;
                                obj = objM1355a;
                                r13 = closeable;
                                bool = (Boolean) obj;
                                bool.getClass();
                                lb5.m7941v(closeable, null);
                                return bool;
                            }
                        }
                    }
                    return ap0Var2;
                } catch (Throwable th12) {
                    th = th12;
                    gx2Var2 = gx2Var;
                    gx2Var2.m6193g(null);
                    throw th;
                }
            default:
                ff3 ff3Var = (ff3) this.f32827y;
                ap0 ap0Var3 = ap0.f14763a;
                byte b4 = this.f32824v;
                if (b4 == 0) {
                    k43.m7376J(obj);
                    b40 b40Var = ff3Var.f3461A;
                    if (b40Var == null) {
                        z62.m13366Y("consentStringsProvider");
                        throw null;
                    }
                    v82 v82Var = b40Var.f956C;
                    this.f32824v = (byte) 1;
                    if (v82Var.mo5005t(this) != ap0Var3) {
                    }
                    return ap0Var3;
                }
                if (b4 != 1) {
                    if (b4 == 2) {
                        c0200km = (C0200km) this.f32823u;
                        ux0Var = (ux0) this.f32826x;
                        k43.m7376J(obj);
                        boolean z3 = this.f32825w;
                        this.f32826x = null;
                        this.f32823u = null;
                        this.f32824v = (byte) 3;
                        ux0Var.getClass();
                    } else {
                        if (b4 != 3) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    break;
                } else {
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
                ux0Var = (ux0) ff3Var.f3488p.get();
                i82 i82Var = (i82) this.f32828z;
                C0200km c0200km2 = new C0200km();
                c0200km2.f6401b = ff3Var;
                c0200km2.f6400a = i82Var;
                VarHandle.storeStoreFence();
                b40 b40Var2 = ff3Var.f3461A;
                if (b40Var2 == null) {
                    z62.m13366Y("consentStringsProvider");
                    throw null;
                }
                this.f32826x = ux0Var;
                this.f32823u = c0200km2;
                this.f32824v = (byte) 2;
                Object objM422d = b40.m422d(b40Var2, this);
                if (objM422d != ap0Var3) {
                    c0200km = c0200km2;
                    obj = objM422d;
                    boolean z4 = this.f32825w;
                    this.f32826x = null;
                    this.f32823u = null;
                    this.f32824v = (byte) 3;
                    ux0Var.getClass();
                    break;
                }
                return ap0Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(ff3 ff3Var, i82 i82Var, boolean z, wm0 wm0Var) {
        super(2, wm0Var);
        this.f32827y = ff3Var;
        this.f32828z = i82Var;
        this.f32825w = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(j10 j10Var, boolean z, String str, wm0 wm0Var) {
        super(2, wm0Var);
        this.f32827y = j10Var;
        this.f32825w = z;
        this.f32828z = str;
    }
}
