package p000;

import ads_mobile_sdk.C0033as;
import ads_mobile_sdk.C0200km;
import ads_mobile_sdk.ak3;
import ads_mobile_sdk.b11;
import ads_mobile_sdk.cy3;
import ads_mobile_sdk.h51;
import ads_mobile_sdk.i11;
import ads_mobile_sdk.i84;
import ads_mobile_sdk.j31;
import ads_mobile_sdk.j84;
import ads_mobile_sdk.mx3;
import ads_mobile_sdk.q11;
import ads_mobile_sdk.s21;
import ads_mobile_sdk.s41;
import ads_mobile_sdk.su1;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.tq2;
import ads_mobile_sdk.u82;
import ads_mobile_sdk.w01;
import ads_mobile_sdk.w11;
import ads_mobile_sdk.y82;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import java.io.Closeable;
import java.lang.invoke.VarHandle;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: gx */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0704gx extends of4 implements yp1 {

    /* JADX INFO: renamed from: A */
    public Object f20158A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Object f20159B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ Object f20160C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ Object f20161D;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f20162t;

    /* JADX INFO: renamed from: u */
    public byte f20163u;

    /* JADX INFO: renamed from: v */
    public Object f20164v;

    /* JADX INFO: renamed from: w */
    public Object f20165w;

    /* JADX INFO: renamed from: x */
    public Object f20166x;

    /* JADX INFO: renamed from: y */
    public Object f20167y;

    /* JADX INFO: renamed from: z */
    public Object f20168z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0704gx(tq2 tq2Var, y82 y82Var, wa2 wa2Var, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f20162t = b;
        switch (b) {
            case 2:
                this.f20159B = y82Var;
                this.f20160C = tq2Var;
                this.f20161D = wa2Var;
                super(1, wm0Var);
                break;
            default:
                this.f20159B = wa2Var;
                this.f20160C = y82Var;
                this.f20161D = tq2Var;
                break;
        }
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f20162t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f20161D;
        Object obj3 = this.f20160C;
        Object obj4 = this.f20159B;
        switch (b) {
            case 0:
                return new C0704gx((u93) this.f20164v, (C0459am) this.f20165w, (wp1) this.f20166x, (Context) this.f20167y, (mq1) this.f20168z, (String) this.f20158A, (xb4) obj4, (C1354y3) obj3, (sw2) obj2, (wm0) obj).invokeSuspend(ju4Var);
            case 1:
                wa2 wa2Var = (wa2) obj4;
                y82 y82Var = (y82) obj3;
                return new C0704gx((tq2) obj2, y82Var, wa2Var, (wm0) obj, (byte) 1).invokeSuspend(ju4Var);
            default:
                return new C0704gx((tq2) obj3, (y82) obj4, (wa2) obj2, (wm0) obj, (byte) 2).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d5 A[Catch: all -> 0x01dd, TryCatch #22 {all -> 0x01dd, blocks: (B:97:0x01ca, B:99:0x01d1, B:101:0x01d5, B:103:0x01d9, B:106:0x01e0, B:108:0x01e4, B:110:0x01e8, B:112:0x01ec, B:113:0x01ed, B:114:0x01f2, B:115:0x01f3, B:116:0x01fa, B:117:0x01fb, B:118:0x0202, B:119:0x0203), top: B:329:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01e4 A[Catch: all -> 0x01dd, TryCatch #22 {all -> 0x01dd, blocks: (B:97:0x01ca, B:99:0x01d1, B:101:0x01d5, B:103:0x01d9, B:106:0x01e0, B:108:0x01e4, B:110:0x01e8, B:112:0x01ec, B:113:0x01ed, B:114:0x01f2, B:115:0x01f3, B:116:0x01fa, B:117:0x01fb, B:118:0x0202, B:119:0x0203), top: B:329:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01e8 A[Catch: all -> 0x01dd, TryCatch #22 {all -> 0x01dd, blocks: (B:97:0x01ca, B:99:0x01d1, B:101:0x01d5, B:103:0x01d9, B:106:0x01e0, B:108:0x01e4, B:110:0x01e8, B:112:0x01ec, B:113:0x01ed, B:114:0x01f2, B:115:0x01f3, B:116:0x01fa, B:117:0x01fb, B:118:0x0202, B:119:0x0203), top: B:329:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01ec A[Catch: all -> 0x01dd, TryCatch #22 {all -> 0x01dd, blocks: (B:97:0x01ca, B:99:0x01d1, B:101:0x01d5, B:103:0x01d9, B:106:0x01e0, B:108:0x01e4, B:110:0x01e8, B:112:0x01ec, B:113:0x01ed, B:114:0x01f2, B:115:0x01f3, B:116:0x01fa, B:117:0x01fb, B:118:0x0202, B:119:0x0203), top: B:329:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ed A[Catch: all -> 0x01dd, TryCatch #22 {all -> 0x01dd, blocks: (B:97:0x01ca, B:99:0x01d1, B:101:0x01d5, B:103:0x01d9, B:106:0x01e0, B:108:0x01e4, B:110:0x01e8, B:112:0x01ec, B:113:0x01ed, B:114:0x01f2, B:115:0x01f3, B:116:0x01fa, B:117:0x01fb, B:118:0x0202, B:119:0x0203), top: B:329:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01f3 A[Catch: all -> 0x01dd, TryCatch #22 {all -> 0x01dd, blocks: (B:97:0x01ca, B:99:0x01d1, B:101:0x01d5, B:103:0x01d9, B:106:0x01e0, B:108:0x01e4, B:110:0x01e8, B:112:0x01ec, B:113:0x01ed, B:114:0x01f2, B:115:0x01f3, B:116:0x01fa, B:117:0x01fb, B:118:0x0202, B:119:0x0203), top: B:329:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01fb A[Catch: all -> 0x01dd, TryCatch #22 {all -> 0x01dd, blocks: (B:97:0x01ca, B:99:0x01d1, B:101:0x01d5, B:103:0x01d9, B:106:0x01e0, B:108:0x01e4, B:110:0x01e8, B:112:0x01ec, B:113:0x01ed, B:114:0x01f2, B:115:0x01f3, B:116:0x01fa, B:117:0x01fb, B:118:0x0202, B:119:0x0203), top: B:329:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[Catch: all -> 0x01dd, TRY_LEAVE, TryCatch #22 {all -> 0x01dd, blocks: (B:97:0x01ca, B:99:0x01d1, B:101:0x01d5, B:103:0x01d9, B:106:0x01e0, B:108:0x01e4, B:110:0x01e8, B:112:0x01ec, B:113:0x01ed, B:114:0x01f2, B:115:0x01f3, B:116:0x01fa, B:117:0x01fb, B:118:0x0202, B:119:0x0203), top: B:329:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0304 A[Catch: all -> 0x0310, TRY_LEAVE, TryCatch #8 {all -> 0x0310, blocks: (B:160:0x02fe, B:162:0x0304, B:166:0x0313, B:168:0x0317, B:227:0x03e6, B:228:0x03eb), top: B:307:0x02fe }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0313 A[Catch: all -> 0x0310, TRY_ENTER, TryCatch #8 {all -> 0x0310, blocks: (B:160:0x02fe, B:162:0x0304, B:166:0x0313, B:168:0x0317, B:227:0x03e6, B:228:0x03eb), top: B:307:0x02fe }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0317 A[Catch: all -> 0x0310, TRY_LEAVE, TryCatch #8 {all -> 0x0310, blocks: (B:160:0x02fe, B:162:0x0304, B:166:0x0313, B:168:0x0317, B:227:0x03e6, B:228:0x03eb), top: B:307:0x02fe }] */
    /* JADX WARN: Code duplicated, block: B:172:0x033e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0348 A[Catch: all -> 0x0350, TRY_LEAVE, TryCatch #9 {all -> 0x0350, blocks: (B:173:0x0342, B:175:0x0348), top: B:308:0x0342 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x035a A[Catch: all -> 0x0372, TryCatch #10 {all -> 0x0372, blocks: (B:179:0x0353, B:181:0x035a, B:185:0x0374), top: B:310:0x0353 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0374 A[Catch: all -> 0x0372, TRY_LEAVE, TryCatch #10 {all -> 0x0372, blocks: (B:179:0x0353, B:181:0x035a, B:185:0x0374), top: B:310:0x0353 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x038c  */
    /* JADX WARN: Code duplicated, block: B:199:0x03a8 A[Catch: all -> 0x03b4, TryCatch #11 {all -> 0x03b4, blocks: (B:197:0x03a1, B:199:0x03a8, B:201:0x03ac, B:203:0x03b0, B:206:0x03b7, B:208:0x03bb, B:210:0x03bf, B:212:0x03c3, B:213:0x03c4, B:214:0x03c9, B:215:0x03ca, B:216:0x03d1, B:217:0x03d2, B:218:0x03d9, B:219:0x03da), top: B:311:0x03a1 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x03ac A[Catch: all -> 0x03b4, TryCatch #11 {all -> 0x03b4, blocks: (B:197:0x03a1, B:199:0x03a8, B:201:0x03ac, B:203:0x03b0, B:206:0x03b7, B:208:0x03bb, B:210:0x03bf, B:212:0x03c3, B:213:0x03c4, B:214:0x03c9, B:215:0x03ca, B:216:0x03d1, B:217:0x03d2, B:218:0x03d9, B:219:0x03da), top: B:311:0x03a1 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x03bb A[Catch: all -> 0x03b4, TryCatch #11 {all -> 0x03b4, blocks: (B:197:0x03a1, B:199:0x03a8, B:201:0x03ac, B:203:0x03b0, B:206:0x03b7, B:208:0x03bb, B:210:0x03bf, B:212:0x03c3, B:213:0x03c4, B:214:0x03c9, B:215:0x03ca, B:216:0x03d1, B:217:0x03d2, B:218:0x03d9, B:219:0x03da), top: B:311:0x03a1 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x03bf A[Catch: all -> 0x03b4, TryCatch #11 {all -> 0x03b4, blocks: (B:197:0x03a1, B:199:0x03a8, B:201:0x03ac, B:203:0x03b0, B:206:0x03b7, B:208:0x03bb, B:210:0x03bf, B:212:0x03c3, B:213:0x03c4, B:214:0x03c9, B:215:0x03ca, B:216:0x03d1, B:217:0x03d2, B:218:0x03d9, B:219:0x03da), top: B:311:0x03a1 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x03c3 A[Catch: all -> 0x03b4, TryCatch #11 {all -> 0x03b4, blocks: (B:197:0x03a1, B:199:0x03a8, B:201:0x03ac, B:203:0x03b0, B:206:0x03b7, B:208:0x03bb, B:210:0x03bf, B:212:0x03c3, B:213:0x03c4, B:214:0x03c9, B:215:0x03ca, B:216:0x03d1, B:217:0x03d2, B:218:0x03d9, B:219:0x03da), top: B:311:0x03a1 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x03c4 A[Catch: all -> 0x03b4, TryCatch #11 {all -> 0x03b4, blocks: (B:197:0x03a1, B:199:0x03a8, B:201:0x03ac, B:203:0x03b0, B:206:0x03b7, B:208:0x03bb, B:210:0x03bf, B:212:0x03c3, B:213:0x03c4, B:214:0x03c9, B:215:0x03ca, B:216:0x03d1, B:217:0x03d2, B:218:0x03d9, B:219:0x03da), top: B:311:0x03a1 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x03ca A[Catch: all -> 0x03b4, TryCatch #11 {all -> 0x03b4, blocks: (B:197:0x03a1, B:199:0x03a8, B:201:0x03ac, B:203:0x03b0, B:206:0x03b7, B:208:0x03bb, B:210:0x03bf, B:212:0x03c3, B:213:0x03c4, B:214:0x03c9, B:215:0x03ca, B:216:0x03d1, B:217:0x03d2, B:218:0x03d9, B:219:0x03da), top: B:311:0x03a1 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x03d2 A[Catch: all -> 0x03b4, TryCatch #11 {all -> 0x03b4, blocks: (B:197:0x03a1, B:199:0x03a8, B:201:0x03ac, B:203:0x03b0, B:206:0x03b7, B:208:0x03bb, B:210:0x03bf, B:212:0x03c3, B:213:0x03c4, B:214:0x03c9, B:215:0x03ca, B:216:0x03d1, B:217:0x03d2, B:218:0x03d9, B:219:0x03da), top: B:311:0x03a1 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x03da A[Catch: all -> 0x03b4, TRY_LEAVE, TryCatch #11 {all -> 0x03b4, blocks: (B:197:0x03a1, B:199:0x03a8, B:201:0x03ac, B:203:0x03b0, B:206:0x03b7, B:208:0x03bb, B:210:0x03bf, B:212:0x03c3, B:213:0x03c4, B:214:0x03c9, B:215:0x03ca, B:216:0x03d1, B:217:0x03d2, B:218:0x03d9, B:219:0x03da), top: B:311:0x03a1 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x03e6 A[Catch: all -> 0x0310, TRY_ENTER, TryCatch #8 {all -> 0x0310, blocks: (B:160:0x02fe, B:162:0x0304, B:166:0x0313, B:168:0x0317, B:227:0x03e6, B:228:0x03eb), top: B:307:0x02fe }] */
    /* JADX WARN: Code duplicated, block: B:284:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:286:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:289:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133 A[Catch: all -> 0x013a, TRY_LEAVE, TryCatch #16 {all -> 0x013a, blocks: (B:46:0x012d, B:48:0x0133), top: B:317:0x012d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0145 A[Catch: all -> 0x0179, TryCatch #15 {all -> 0x0179, blocks: (B:59:0x0172, B:53:0x013e, B:55:0x0145, B:56:0x015b), top: B:316:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x015b A[Catch: all -> 0x0179, TryCatch #15 {all -> 0x0179, blocks: (B:59:0x0172, B:53:0x013e, B:55:0x0145, B:56:0x015b), top: B:316:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0188 A[Catch: all -> 0x0194, TryCatch #12 {all -> 0x0194, blocks: (B:66:0x0181, B:68:0x0188, B:70:0x018c, B:72:0x0190, B:75:0x0197, B:77:0x019b, B:79:0x019f, B:81:0x01a3, B:82:0x01a4, B:83:0x01a9, B:84:0x01aa, B:85:0x01b1, B:86:0x01b2, B:87:0x01b9, B:88:0x01ba), top: B:312:0x0181, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x018c A[Catch: all -> 0x0194, TryCatch #12 {all -> 0x0194, blocks: (B:66:0x0181, B:68:0x0188, B:70:0x018c, B:72:0x0190, B:75:0x0197, B:77:0x019b, B:79:0x019f, B:81:0x01a3, B:82:0x01a4, B:83:0x01a9, B:84:0x01aa, B:85:0x01b1, B:86:0x01b2, B:87:0x01b9, B:88:0x01ba), top: B:312:0x0181, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x019b A[Catch: all -> 0x0194, TryCatch #12 {all -> 0x0194, blocks: (B:66:0x0181, B:68:0x0188, B:70:0x018c, B:72:0x0190, B:75:0x0197, B:77:0x019b, B:79:0x019f, B:81:0x01a3, B:82:0x01a4, B:83:0x01a9, B:84:0x01aa, B:85:0x01b1, B:86:0x01b2, B:87:0x01b9, B:88:0x01ba), top: B:312:0x0181, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x019f A[Catch: all -> 0x0194, TryCatch #12 {all -> 0x0194, blocks: (B:66:0x0181, B:68:0x0188, B:70:0x018c, B:72:0x0190, B:75:0x0197, B:77:0x019b, B:79:0x019f, B:81:0x01a3, B:82:0x01a4, B:83:0x01a9, B:84:0x01aa, B:85:0x01b1, B:86:0x01b2, B:87:0x01b9, B:88:0x01ba), top: B:312:0x0181, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a3 A[Catch: all -> 0x0194, TryCatch #12 {all -> 0x0194, blocks: (B:66:0x0181, B:68:0x0188, B:70:0x018c, B:72:0x0190, B:75:0x0197, B:77:0x019b, B:79:0x019f, B:81:0x01a3, B:82:0x01a4, B:83:0x01a9, B:84:0x01aa, B:85:0x01b1, B:86:0x01b2, B:87:0x01b9, B:88:0x01ba), top: B:312:0x0181, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4 A[Catch: all -> 0x0194, TryCatch #12 {all -> 0x0194, blocks: (B:66:0x0181, B:68:0x0188, B:70:0x018c, B:72:0x0190, B:75:0x0197, B:77:0x019b, B:79:0x019f, B:81:0x01a3, B:82:0x01a4, B:83:0x01a9, B:84:0x01aa, B:85:0x01b1, B:86:0x01b2, B:87:0x01b9, B:88:0x01ba), top: B:312:0x0181, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa A[Catch: all -> 0x0194, TryCatch #12 {all -> 0x0194, blocks: (B:66:0x0181, B:68:0x0188, B:70:0x018c, B:72:0x0190, B:75:0x0197, B:77:0x019b, B:79:0x019f, B:81:0x01a3, B:82:0x01a4, B:83:0x01a9, B:84:0x01aa, B:85:0x01b1, B:86:0x01b2, B:87:0x01b9, B:88:0x01ba), top: B:312:0x0181, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b2 A[Catch: all -> 0x0194, TryCatch #12 {all -> 0x0194, blocks: (B:66:0x0181, B:68:0x0188, B:70:0x018c, B:72:0x0190, B:75:0x0197, B:77:0x019b, B:79:0x019f, B:81:0x01a3, B:82:0x01a4, B:83:0x01a9, B:84:0x01aa, B:85:0x01b1, B:86:0x01b2, B:87:0x01b9, B:88:0x01ba), top: B:312:0x0181, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ba A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #12 {all -> 0x0194, blocks: (B:66:0x0181, B:68:0x0188, B:70:0x018c, B:72:0x0190, B:75:0x0197, B:77:0x019b, B:79:0x019f, B:81:0x01a3, B:82:0x01a4, B:83:0x01a9, B:84:0x01aa, B:85:0x01b1, B:86:0x01b2, B:87:0x01b9, B:88:0x01ba), top: B:312:0x0181, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d1 A[Catch: all -> 0x01dd, TryCatch #22 {all -> 0x01dd, blocks: (B:97:0x01ca, B:99:0x01d1, B:101:0x01d5, B:103:0x01d9, B:106:0x01e0, B:108:0x01e4, B:110:0x01e8, B:112:0x01ec, B:113:0x01ed, B:114:0x01f2, B:115:0x01f3, B:116:0x01fa, B:117:0x01fb, B:118:0x0202, B:119:0x0203), top: B:329:0x01ca }] */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0498, code lost:
    
        if (r1 == r0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x04df, code lost:
    
        if (r6.invoke(r1, r17) == r0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x04e8, code lost:
    
        if (r6.invoke(r1, r17) == r0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016e, code lost:
    
        if (r2 == r0) goto L58;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:286:0x04c2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ads_mobile_sdk.s21] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v28, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v44, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v74 */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objMo11771c;
        Object objM7921b0;
        ResolveInfo resolveInfoResolveActivity;
        y82 y82Var;
        Closeable closeableM655a;
        Closeable closeable;
        ?? r2;
        String strM2258a;
        String strM2258a2;
        Object objM2705a;
        Closeable closeable2;
        mi5 mi5Var;
        mx3 mx3VarM655a;
        Closeable closeable3;
        mx3 mx3Var;
        s41 s41Var;
        Object objM2206a;
        y82 y82Var2;
        Closeable closeable4;
        mi5 mi5Var2;
        Object objM2706a;
        s41 s41Var2;
        Closeable closeable5;
        y82 y82Var3;
        Object objM2705a2;
        wa2 wa2Var;
        Closeable closeable6;
        Closeable closeable7;
        mx3 mx3VarM655a2;
        mx3 mx3Var2;
        mx3 mx3Var3;
        Object objM2217c;
        s41 s41Var3;
        mi5 mi5Var3;
        Object objM2706a2;
        s41 s41Var4;
        byte b = this.f20162t;
        ?? r3 = s21.f11048R;
        v71 v71Var = v71.f32439a;
        Object obj2 = this.f20161D;
        Object obj3 = this.f20160C;
        Object obj4 = this.f20159B;
        byte b2 = 1;
        wm0 wm0Var = null;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                byte b3 = this.f20163u;
                ju4 ju4Var = ju4.f22634a;
                if (b3 == 0) {
                    k43.m7376J(obj);
                    u93 u93Var = (u93) this.f20164v;
                    this.f20163u = (byte) 1;
                    objMo11771c = u93Var.mo11771c(this);
                    if (objMo11771c != ap0Var) {
                    }
                    return ap0Var;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        k43.m7376J(obj);
                        objM7921b0 = obj;
                        if (!((Boolean) objM7921b0).booleanValue()) {
                            Intent intent = (Intent) ((wp1) this.f20166x).invoke();
                            resolveInfoResolveActivity = ((Context) this.f20167y).getPackageManager().resolveActivity(intent, 131072);
                            mq1 mq1Var = (mq1) this.f20168z;
                            if (resolveInfoResolveActivity == null) {
                                this.f20163u = (byte) 4;
                            } else {
                                Intent intentM10020d = qq2.m10020d("https://play.google.com/store/apps/details?id=" + ((String) this.f20158A));
                                this.f20163u = (byte) 3;
                            }
                        }
                    } else {
                        if (b3 != 3 && b3 != 4) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    break;
                } else {
                    k43.m7376J(obj);
                    objMo11771c = obj;
                }
                return ju4Var;
                if (((Boolean) objMo11771c).booleanValue()) {
                    if (((Boolean) ((xb4) obj4).getValue()).booleanValue()) {
                        so0 so0Var = ((C0459am) this.f20165w).f14620b;
                        C0629ex c0629ex = new C0629ex((C1354y3) obj3, (sw2) obj2, null, b2);
                        this.f20163u = (byte) 2;
                        objM7921b0 = lb5.m7921b0(so0Var, c0629ex, this);
                        break;
                    } else {
                        Intent intent2 = (Intent) ((wp1) this.f20166x).invoke();
                        resolveInfoResolveActivity = ((Context) this.f20167y).getPackageManager().resolveActivity(intent2, 131072);
                        mq1 mq1Var2 = (mq1) this.f20168z;
                        if (resolveInfoResolveActivity == null) {
                            this.f20163u = (byte) 4;
                        } else {
                            Intent intentM10020d2 = qq2.m10020d("https://play.google.com/store/apps/details?id=" + ((String) this.f20158A));
                            this.f20163u = (byte) 3;
                        }
                        break;
                    }
                    return ap0Var;
                }
                return ju4Var;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                byte b4 = this.f20163u;
                if (b4 == 0) {
                    k43.m7376J(obj);
                    wa2 wa2Var2 = (wa2) obj4;
                    y82Var = (y82) obj3;
                    Context context = y82Var.f13543a;
                    tq2 tq2Var = (tq2) obj2;
                    closeableM655a = cy3.m655a(s21.f11122n0, v71Var, true);
                    try {
                        strM2258a = su1.m2258a(wa2Var2, "base_url", "");
                        strM2258a2 = su1.m2258a(wa2Var2, "html", "");
                        int iM2255a = su1.m2255a(wa2Var2, "width", 0);
                        int iM2255a2 = su1.m2255a(wa2Var2, "height", 0);
                        j84 j84Var = (iM2255a <= 0 || iM2255a2 <= 0) ? new j84(i84.f4866a, 0, 0, 14) : new j84(i84.f4867b, (int) Math.ceil(TypedValue.applyDimension(1, iM2255a, context.getResources().getDisplayMetrics())), (int) Math.ceil(TypedValue.applyDimension(1, iM2255a2, context.getResources().getDisplayMetrics())), 8);
                        this.f20164v = y82Var;
                        this.f20165w = closeableM655a;
                        this.f20166x = closeableM655a;
                        this.f20167y = strM2258a;
                        this.f20168z = strM2258a2;
                        this.f20163u = (byte) 1;
                        objM2705a = y82.m2705a(y82Var, j84Var, tq2Var, this);
                        if (objM2705a != ap0Var2) {
                            closeable2 = closeableM655a;
                            mi5Var = (mi5) objM2705a;
                            if (mi5Var instanceof i11) {
                                sy3.m2306a((i11) mi5Var, false);
                                lb5.m7941v(closeableM655a, null);
                                return null;
                            }
                            if (mi5Var instanceof q11) {
                                throw new gf0();
                            }
                            s41 s41Var5 = (s41) ((q11) mi5Var).f8791b;
                            mx3VarM655a = cy3.m655a(r3, v71Var, true);
                            this.f20164v = y82Var;
                            this.f20165w = closeable2;
                            this.f20166x = closeableM655a;
                            this.f20167y = s41Var5;
                            this.f20168z = mx3VarM655a;
                            this.f20158A = mx3VarM655a;
                            this.f20163u = (byte) 2;
                            String str = strM2258a2;
                            s41Var = s41Var5;
                            objM2206a = s41.m2206a(s41Var, str, strM2258a, true, (ym0) this, 12);
                            if (objM2206a != ap0Var2) {
                                closeable3 = closeable2;
                                y82Var2 = y82Var;
                                mx3Var = mx3VarM655a;
                                closeable4 = closeableM655a;
                                mi5Var2 = (mi5) objM2206a;
                                if (mi5Var2 instanceof i11) {
                                    sy3.m2306a((i11) mi5Var2, false);
                                    break;
                                }
                                lb5.m7941v(mx3VarM655a, null);
                                if (!(mi5Var2 instanceof i11)) {
                                    lb5.m7910S(y82Var2.f13544b, k13.f22815b, null, new ak3(s41Var, null, (byte) 7), 2);
                                    sy3.m2306a((i11) mi5Var2, false);
                                    s41Var2 = null;
                                } else {
                                    this.f20164v = closeable3;
                                    this.f20165w = closeable4;
                                    this.f20166x = null;
                                    this.f20167y = null;
                                    this.f20168z = null;
                                    this.f20158A = null;
                                    this.f20163u = (byte) 3;
                                    objM2706a = y82.m2706a(y82Var2, s41Var, this);
                                    if (objM2706a != ap0Var2) {
                                        closeable = closeable4;
                                        r2 = closeable3;
                                        s41Var2 = (s41) objM2706a;
                                        closeable4 = closeable;
                                    }
                                }
                                lb5.m7941v(closeable4, null);
                                return s41Var2;
                            }
                        }
                        return ap0Var2;
                    } catch (Throwable th) {
                        th = th;
                        closeable = closeableM655a;
                        r2 = closeable;
                    }
                } else if (b4 == 1) {
                    strM2258a2 = (String) this.f20168z;
                    String str2 = (String) this.f20167y;
                    Closeable closeable8 = (Closeable) this.f20166x;
                    closeable2 = (mx3) ((Closeable) this.f20165w);
                    y82Var = (y82) this.f20164v;
                    try {
                        k43.m7376J(obj);
                        strM2258a = str2;
                        closeableM655a = closeable8;
                        objM2705a = obj;
                        try {
                            mi5Var = (mi5) objM2705a;
                            if (mi5Var instanceof i11) {
                                sy3.m2306a((i11) mi5Var, false);
                                lb5.m7941v(closeableM655a, null);
                                return null;
                            }
                            if (mi5Var instanceof q11) {
                                throw new gf0();
                            }
                            s41 s41Var6 = (s41) ((q11) mi5Var).f8791b;
                            mx3VarM655a = cy3.m655a(r3, v71Var, true);
                            try {
                                this.f20164v = y82Var;
                                this.f20165w = closeable2;
                                this.f20166x = closeableM655a;
                                this.f20167y = s41Var6;
                                this.f20168z = mx3VarM655a;
                                this.f20158A = mx3VarM655a;
                                this.f20163u = (byte) 2;
                                String str3 = strM2258a2;
                                s41Var = s41Var6;
                                objM2206a = s41.m2206a(s41Var, str3, strM2258a, true, (ym0) this, 12);
                                if (objM2206a != ap0Var2) {
                                    closeable3 = closeable2;
                                    y82Var2 = y82Var;
                                    mx3Var = mx3VarM655a;
                                    closeable4 = closeableM655a;
                                    mi5Var2 = (mi5) objM2206a;
                                    if (mi5Var2 instanceof i11) {
                                        sy3.m2306a((i11) mi5Var2, false);
                                        break;
                                    }
                                    lb5.m7941v(mx3VarM655a, null);
                                    if (!(mi5Var2 instanceof i11)) {
                                        lb5.m7910S(y82Var2.f13544b, k13.f22815b, null, new ak3(s41Var, null, (byte) 7), 2);
                                        sy3.m2306a((i11) mi5Var2, false);
                                        s41Var2 = null;
                                    } else {
                                        this.f20164v = closeable3;
                                        this.f20165w = closeable4;
                                        this.f20166x = null;
                                        this.f20167y = null;
                                        this.f20168z = null;
                                        this.f20158A = null;
                                        this.f20163u = (byte) 3;
                                        objM2706a = y82.m2706a(y82Var2, s41Var, this);
                                        if (objM2706a != ap0Var2) {
                                            closeable = closeable4;
                                            r2 = closeable3;
                                            s41Var2 = (s41) objM2706a;
                                            closeable4 = closeable;
                                        }
                                    }
                                    lb5.m7941v(closeable4, null);
                                    return s41Var2;
                                }
                                return ap0Var2;
                            } catch (Throwable th2) {
                                th = th2;
                                closeable3 = closeable2;
                                mx3Var = mx3VarM655a;
                                closeable = closeableM655a;
                                mx3Var.m1736b(th);
                                if (th instanceof ka5) {
                                    throw th;
                                }
                                if (!(th instanceof zm4)) {
                                    mx3Var.m1735a(th);
                                }
                                if (th instanceof zm4) {
                                    throw new j31(th);
                                }
                                if (th instanceof CancellationException) {
                                    throw new w01(th);
                                }
                                if (th instanceof w11) {
                                    throw th;
                                }
                                throw new b11(th);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r2 = closeable2;
                            closeable = closeableM655a;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        closeable = closeable8;
                        r2 = closeable2;
                    }
                } else if (b4 == 2) {
                    mx3 mx3Var4 = (mx3) this.f20158A;
                    mx3Var = (mx3) this.f20168z;
                    s41Var = (s41) this.f20167y;
                    closeable4 = (Closeable) this.f20166x;
                    closeable3 = (mx3) ((Closeable) this.f20165w);
                    y82Var2 = (y82) this.f20164v;
                    try {
                        k43.m7376J(obj);
                        mx3VarM655a = mx3Var4;
                        objM2206a = obj;
                        try {
                            mi5Var2 = (mi5) objM2206a;
                            if (mi5Var2 instanceof i11) {
                                sy3.m2306a((i11) mi5Var2, false);
                            }
                            try {
                                lb5.m7941v(mx3VarM655a, null);
                                if (!(mi5Var2 instanceof i11)) {
                                    this.f20164v = closeable3;
                                    this.f20165w = closeable4;
                                    this.f20166x = null;
                                    this.f20167y = null;
                                    this.f20168z = null;
                                    this.f20158A = null;
                                    this.f20163u = (byte) 3;
                                    objM2706a = y82.m2706a(y82Var2, s41Var, this);
                                    if (objM2706a != ap0Var2) {
                                        closeable = closeable4;
                                        r2 = closeable3;
                                        s41Var2 = (s41) objM2706a;
                                        closeable4 = closeable;
                                    }
                                    return ap0Var2;
                                }
                                lb5.m7910S(y82Var2.f13544b, k13.f22815b, null, new ak3(s41Var, null, (byte) 7), 2);
                                sy3.m2306a((i11) mi5Var2, false);
                                s41Var2 = null;
                                lb5.m7941v(closeable4, null);
                                return s41Var2;
                            } catch (Throwable th5) {
                                th = th5;
                                closeable = closeable4;
                            }
                            break;
                        } catch (Throwable th6) {
                            th = th6;
                            closeable = closeable4;
                            try {
                                mx3Var.m1736b(th);
                                if (th instanceof ka5) {
                                    throw th;
                                }
                                if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                                    mx3Var.m1735a(th);
                                }
                                if (th instanceof zm4) {
                                    throw new j31(th);
                                }
                                if (th instanceof CancellationException) {
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
                                    try {
                                        lb5.m7941v(mx3VarM655a, th7);
                                        throw th8;
                                    } catch (Throwable th9) {
                                        th = th9;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        mx3VarM655a = mx3Var4;
                        closeable = closeable4;
                        mx3Var.m1736b(th);
                        if (th instanceof ka5) {
                            throw th;
                        }
                        if (!(th instanceof zm4)) {
                            mx3Var.m1735a(th);
                        }
                        if (th instanceof zm4) {
                            throw new j31(th);
                        }
                        if (th instanceof CancellationException) {
                            throw new w01(th);
                        }
                        if (th instanceof w11) {
                            throw th;
                        }
                        throw new b11(th);
                    }
                } else {
                    if (b4 != 3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    closeable = (Closeable) this.f20165w;
                    r2 = (mx3) this.f20164v;
                    try {
                        k43.m7376J(obj);
                        objM2706a = obj;
                        r2 = r2;
                        s41Var2 = (s41) objM2706a;
                        closeable4 = closeable;
                        lb5.m7941v(closeable4, null);
                        return s41Var2;
                    } catch (Throwable th11) {
                        th = th11;
                    }
                }
                r2 = closeable3;
                try {
                    r2.m1736b(th);
                    if (th instanceof ka5) {
                        throw th;
                    }
                    if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                        r2.m1735a(th);
                    }
                    if (th instanceof zm4) {
                        throw new j31(th);
                    }
                    if (th instanceof CancellationException) {
                        throw new w01(th);
                    }
                    if (th instanceof w11) {
                        throw th;
                    }
                    throw new b11(th);
                } catch (Throwable th12) {
                    try {
                        throw th12;
                    } catch (Throwable th13) {
                        lb5.m7941v(closeable, th12);
                        throw th13;
                    }
                }
            default:
                ap0 ap0Var3 = ap0.f14763a;
                byte b5 = this.f20163u;
                try {
                    if (b5 == 0) {
                        k43.m7376J(obj);
                        y82Var3 = (y82) obj4;
                        tq2 tq2Var2 = (tq2) obj3;
                        wa2 wa2Var3 = (wa2) obj2;
                        mx3 mx3VarM655a3 = cy3.m655a(s21.f11118m0, v71Var, true);
                        try {
                            j84 j84Var2 = ((Boolean) y82Var3.f13547e.m13553a("gads:native_video_rect:enabled", Boolean.TRUE, C0033as.a$19)).booleanValue() ? new j84(i84.f4870e, 0, 0, 14) : new j84(i84.f4866a, 0, 0, 14);
                            this.f20164v = y82Var3;
                            this.f20165w = wa2Var3;
                            this.f20166x = mx3VarM655a3;
                            this.f20167y = mx3VarM655a3;
                            this.f20163u = (byte) 1;
                            objM2705a2 = y82.m2705a(y82Var3, j84Var2, tq2Var2, this);
                            if (objM2705a2 != ap0Var3) {
                                wa2Var = wa2Var3;
                                closeable6 = mx3VarM655a3;
                                closeable7 = closeable6;
                            }
                            return ap0Var3;
                        } catch (Throwable th14) {
                            th = th14;
                            closeable5 = mx3VarM655a3;
                            r3 = closeable5;
                            r3.m1736b(th);
                            if (!(th instanceof ka5)) {
                                throw th;
                            }
                            if (!(th instanceof zm4)) {
                                r3.m1735a(th);
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
                    if (b5 != 1) {
                        if (b5 == 2) {
                            mx3VarM655a2 = (mx3) this.f20158A;
                            mx3 mx3Var5 = (mx3) this.f20168z;
                            s41 s41Var7 = (s41) this.f20167y;
                            Closeable closeable9 = (Closeable) this.f20166x;
                            mx3 mx3Var6 = (mx3) this.f20165w;
                            y82Var3 = (y82) this.f20164v;
                            try {
                                k43.m7376J(obj);
                                closeable5 = closeable9;
                                closeable7 = mx3Var6;
                                s41Var3 = s41Var7;
                                mx3Var3 = mx3Var5;
                                objM2217c = obj;
                                try {
                                    mi5Var3 = (mi5) objM2217c;
                                    if (mi5Var3 instanceof i11) {
                                        sy3.m2306a((i11) mi5Var3, false);
                                    }
                                    try {
                                        lb5.m7941v(mx3VarM655a2, null);
                                        if (mi5Var3 instanceof i11) {
                                            this.f20164v = closeable7;
                                            this.f20165w = closeable5;
                                            this.f20166x = null;
                                            this.f20167y = null;
                                            this.f20168z = null;
                                            this.f20158A = null;
                                            this.f20163u = (byte) 3;
                                            objM2706a2 = y82.m2706a(y82Var3, s41Var3, this);
                                            break;
                                        } else {
                                            sy3.m2303a(y82Var3.f13544b, k13.f22815b, new ak3(s41Var3, wm0Var, (byte) 8), 2);
                                            sy3.m2306a((i11) mi5Var3, false);
                                            s41Var4 = null;
                                        }
                                        lb5.m7941v(closeable5, null);
                                        return s41Var4;
                                    } catch (Throwable th15) {
                                        th = th15;
                                        r3 = closeable7;
                                        try {
                                            r3.m1736b(th);
                                            if (!(th instanceof ka5)) {
                                                throw th;
                                            }
                                            if (!(th instanceof zm4)) {
                                                r3.m1735a(th);
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
                                        } catch (Throwable th16) {
                                            try {
                                                throw th16;
                                            } catch (Throwable th17) {
                                                lb5.m7941v(closeable5, th16);
                                                throw th17;
                                            }
                                        }
                                    }
                                    break;
                                } catch (Throwable th18) {
                                    th = th18;
                                    mx3Var2 = mx3VarM655a2;
                                    r3 = closeable7;
                                    try {
                                        mx3Var3.m1736b(th);
                                        if (th instanceof ka5) {
                                            throw th;
                                        }
                                        if (!(th instanceof zm4)) {
                                            mx3Var3.m1735a(th);
                                        }
                                        if (th instanceof zm4) {
                                            throw new j31(th);
                                        }
                                        if (th instanceof CancellationException) {
                                            throw new w01(th);
                                        }
                                        if (th instanceof w11) {
                                            throw th;
                                        }
                                        throw new b11(th);
                                    } catch (Throwable th19) {
                                        try {
                                            throw th19;
                                        } catch (Throwable th20) {
                                            lb5.m7941v(mx3Var2, th19);
                                            throw th20;
                                        }
                                    }
                                }
                            } catch (Throwable th21) {
                                th = th21;
                                mx3Var3 = mx3Var5;
                                closeable5 = closeable9;
                                mx3Var2 = mx3VarM655a2;
                                r3 = mx3Var6;
                                mx3Var3.m1736b(th);
                                if (th instanceof ka5) {
                                    throw th;
                                }
                                if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                                    mx3Var3.m1735a(th);
                                }
                                if (th instanceof zm4) {
                                    throw new j31(th);
                                }
                                if (th instanceof CancellationException) {
                                    throw new w01(th);
                                }
                                if (th instanceof w11) {
                                    throw th;
                                }
                                throw new b11(th);
                            }
                        }
                        if (b5 != 3) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        closeable5 = (Closeable) this.f20165w;
                        k43.m7376J(obj);
                        objM2706a2 = obj;
                        s41Var4 = (s41) objM2706a2;
                        lb5.m7941v(closeable5, null);
                        return s41Var4;
                    }
                    closeable6 = (Closeable) this.f20167y;
                    closeable7 = (mx3) ((Closeable) this.f20166x);
                    wa2Var = (wa2) this.f20165w;
                    y82Var3 = (y82) this.f20164v;
                    try {
                        k43.m7376J(obj);
                        objM2705a2 = obj;
                    } catch (Throwable th22) {
                        th = th22;
                        closeable5 = closeable6;
                        r3 = closeable7;
                        r3.m1736b(th);
                        if (!(th instanceof ka5)) {
                            throw th;
                        }
                        if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                            r3.m1735a(th);
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
                    mi5 mi5Var4 = (mi5) objM2705a2;
                    if (mi5Var4 instanceof i11) {
                        sy3.m2306a((i11) mi5Var4, false);
                        lb5.m7941v(closeable6, null);
                        return null;
                    }
                    if (!(mi5Var4 instanceof q11)) {
                        throw new gf0();
                    }
                    s41 s41Var8 = (s41) ((q11) mi5Var4).f8791b;
                    h51 h51VarM2213b = s41Var8.m2213b();
                    u82 u82Var = new u82();
                    u82Var.f12210a = s41Var8;
                    u82Var.f12211b = wa2Var;
                    VarHandle.storeStoreFence();
                    C0200km c0200km = h51VarM2213b.f4318t;
                    ic2 ic2Var = h51.f4298x[5];
                    c0200km.setValue(h51VarM2213b, u82Var);
                    mx3VarM655a2 = cy3.m655a(r3, v71Var, true);
                    try {
                        String str4 = (String) y82Var3.f13547e.m13553a("gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html", C0033as.a$13);
                        this.f20164v = y82Var3;
                        this.f20165w = closeable7;
                        this.f20166x = closeable6;
                        this.f20167y = s41Var8;
                        this.f20168z = mx3VarM655a2;
                        this.f20158A = mx3VarM655a2;
                        this.f20163u = (byte) 2;
                        objM2217c = s41Var8.m2217c(str4, this);
                        if (objM2217c != ap0Var3) {
                            s41Var3 = s41Var8;
                            closeable5 = closeable6;
                            mx3Var3 = mx3VarM655a2;
                            mi5Var3 = (mi5) objM2217c;
                            if (mi5Var3 instanceof i11) {
                                sy3.m2306a((i11) mi5Var3, false);
                                break;
                            }
                            lb5.m7941v(mx3VarM655a2, null);
                            if (mi5Var3 instanceof i11) {
                                this.f20164v = closeable7;
                                this.f20165w = closeable5;
                                this.f20166x = null;
                                this.f20167y = null;
                                this.f20168z = null;
                                this.f20158A = null;
                                this.f20163u = (byte) 3;
                                objM2706a2 = y82.m2706a(y82Var3, s41Var3, this);
                                break;
                            } else {
                                sy3.m2303a(y82Var3.f13544b, k13.f22815b, new ak3(s41Var3, wm0Var, (byte) 8), 2);
                                sy3.m2306a((i11) mi5Var3, false);
                                s41Var4 = null;
                            }
                            lb5.m7941v(closeable5, null);
                            return s41Var4;
                        }
                        return ap0Var3;
                    } catch (Throwable th23) {
                        th = th23;
                        mx3Var2 = mx3VarM655a2;
                        closeable5 = closeable6;
                        mx3Var3 = mx3Var2;
                        r3 = closeable7;
                        mx3Var3.m1736b(th);
                        if (th instanceof ka5) {
                            throw th;
                        }
                        if (!(th instanceof zm4)) {
                            mx3Var3.m1735a(th);
                        }
                        if (th instanceof zm4) {
                            throw new j31(th);
                        }
                        if (th instanceof CancellationException) {
                            throw new w01(th);
                        }
                        if (th instanceof w11) {
                            throw th;
                        }
                        throw new b11(th);
                    }
                } catch (Throwable th24) {
                    th = th24;
                    r3.m1736b(th);
                    if (!(th instanceof ka5)) {
                        throw th;
                    }
                    if (!(th instanceof zm4)) {
                        r3.m1735a(th);
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0704gx(u93 u93Var, C0459am c0459am, wp1 wp1Var, Context context, mq1 mq1Var, String str, xb4 xb4Var, C1354y3 c1354y3, sw2 sw2Var, wm0 wm0Var) {
        super(1, wm0Var);
        this.f20162t = (byte) 0;
        this.f20164v = u93Var;
        this.f20165w = c0459am;
        this.f20166x = wp1Var;
        this.f20167y = context;
        this.f20168z = mq1Var;
        this.f20158A = str;
        this.f20159B = xb4Var;
        this.f20160C = c1354y3;
        this.f20161D = sw2Var;
    }
}
