package p000;

import ads_mobile_sdk.C0033as;
import ads_mobile_sdk.C0217lc;
import ads_mobile_sdk.aq1;
import ads_mobile_sdk.b11;
import ads_mobile_sdk.cy3;
import ads_mobile_sdk.d54;
import ads_mobile_sdk.d63;
import ads_mobile_sdk.e33;
import ads_mobile_sdk.fy3;
import ads_mobile_sdk.gu1;
import ads_mobile_sdk.i11;
import ads_mobile_sdk.i84;
import ads_mobile_sdk.j31;
import ads_mobile_sdk.j84;
import ads_mobile_sdk.k72;
import ads_mobile_sdk.k83;
import ads_mobile_sdk.m64;
import ads_mobile_sdk.mx3;
import ads_mobile_sdk.q11;
import ads_mobile_sdk.s21;
import ads_mobile_sdk.s41;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.w01;
import ads_mobile_sdk.w11;
import ads_mobile_sdk.xa3;
import android.content.Intent;
import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nu0 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f26085t;

    /* JADX INFO: renamed from: u */
    public byte f26086u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f26087v;

    /* JADX INFO: renamed from: w */
    public Object f26088w;

    /* JADX INFO: renamed from: x */
    public Object f26089x;

    /* JADX INFO: renamed from: y */
    public Object f26090y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f26091z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu0(u93 u93Var, mq1 mq1Var, ea3 ea3Var, yp1 yp1Var, g44 g44Var, wm0 wm0Var) {
        super(1, wm0Var);
        this.f26085t = (byte) 1;
        this.f26088w = u93Var;
        this.f26087v = mq1Var;
        this.f26089x = ea3Var;
        this.f26090y = yp1Var;
        this.f26091z = g44Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f26085t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f26087v;
        Object obj3 = this.f26091z;
        switch (b) {
            case 0:
                return new nu0(this.f26090y, obj3, obj2, (wm0) obj, (byte) 0).invokeSuspend(ju4Var);
            case 1:
                return new nu0((u93) this.f26088w, (mq1) obj2, (ea3) this.f26089x, (yp1) this.f26090y, (g44) obj3, (wm0) obj).invokeSuspend(ju4Var);
            case 2:
                return new nu0((ml3) this.f26089x, (m64) this.f26090y, (String) obj3, (ql3) obj2, (wm0) obj).invokeSuspend(ju4Var);
            case 3:
                return new nu0(this.f26090y, obj3, obj2, (wm0) obj, (byte) 3).invokeSuspend(ju4Var);
            default:
                return new nu0((k72) obj3, (String) obj2, (wm0) obj).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01aa A[Catch: all -> 0x01a8, TRY_ENTER, TryCatch #6 {all -> 0x01a8, blocks: (B:97:0x0199, B:99:0x019f, B:103:0x01aa, B:105:0x01ae, B:123:0x01f1, B:124:0x01f6), top: B:343:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01ae A[Catch: all -> 0x01a8, TRY_LEAVE, TryCatch #6 {all -> 0x01a8, blocks: (B:97:0x0199, B:99:0x019f, B:103:0x01aa, B:105:0x01ae, B:123:0x01f1, B:124:0x01f6), top: B:343:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d5 A[Catch: all -> 0x01e2, TRY_ENTER, TryCatch #0 {all -> 0x01e2, blocks: (B:109:0x01ca, B:112:0x01d5, B:114:0x01d9, B:119:0x01e5, B:120:0x01ea), top: B:335:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01d9 A[Catch: all -> 0x01e2, TRY_LEAVE, TryCatch #0 {all -> 0x01e2, blocks: (B:109:0x01ca, B:112:0x01d5, B:114:0x01d9, B:119:0x01e5, B:120:0x01ea), top: B:335:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01e5 A[Catch: all -> 0x01e2, TRY_ENTER, TryCatch #0 {all -> 0x01e2, blocks: (B:109:0x01ca, B:112:0x01d5, B:114:0x01d9, B:119:0x01e5, B:120:0x01ea), top: B:335:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01f1 A[Catch: all -> 0x01a8, TRY_ENTER, TryCatch #6 {all -> 0x01a8, blocks: (B:97:0x0199, B:99:0x019f, B:103:0x01aa, B:105:0x01ae, B:123:0x01f1, B:124:0x01f6), top: B:343:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0201 A[Catch: all -> 0x020d, TryCatch #11 {all -> 0x020d, blocks: (B:127:0x01fa, B:129:0x0201, B:131:0x0205, B:133:0x0209, B:136:0x0210, B:138:0x0214, B:140:0x0218, B:142:0x021c, B:143:0x021d, B:144:0x0222, B:145:0x0223, B:146:0x022a, B:147:0x022b, B:148:0x0232, B:149:0x0233), top: B:350:0x01fa }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0205 A[Catch: all -> 0x020d, TryCatch #11 {all -> 0x020d, blocks: (B:127:0x01fa, B:129:0x0201, B:131:0x0205, B:133:0x0209, B:136:0x0210, B:138:0x0214, B:140:0x0218, B:142:0x021c, B:143:0x021d, B:144:0x0222, B:145:0x0223, B:146:0x022a, B:147:0x022b, B:148:0x0232, B:149:0x0233), top: B:350:0x01fa }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0214 A[Catch: all -> 0x020d, TryCatch #11 {all -> 0x020d, blocks: (B:127:0x01fa, B:129:0x0201, B:131:0x0205, B:133:0x0209, B:136:0x0210, B:138:0x0214, B:140:0x0218, B:142:0x021c, B:143:0x021d, B:144:0x0222, B:145:0x0223, B:146:0x022a, B:147:0x022b, B:148:0x0232, B:149:0x0233), top: B:350:0x01fa }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0218 A[Catch: all -> 0x020d, TryCatch #11 {all -> 0x020d, blocks: (B:127:0x01fa, B:129:0x0201, B:131:0x0205, B:133:0x0209, B:136:0x0210, B:138:0x0214, B:140:0x0218, B:142:0x021c, B:143:0x021d, B:144:0x0222, B:145:0x0223, B:146:0x022a, B:147:0x022b, B:148:0x0232, B:149:0x0233), top: B:350:0x01fa }] */
    /* JADX WARN: Code duplicated, block: B:142:0x021c A[Catch: all -> 0x020d, TryCatch #11 {all -> 0x020d, blocks: (B:127:0x01fa, B:129:0x0201, B:131:0x0205, B:133:0x0209, B:136:0x0210, B:138:0x0214, B:140:0x0218, B:142:0x021c, B:143:0x021d, B:144:0x0222, B:145:0x0223, B:146:0x022a, B:147:0x022b, B:148:0x0232, B:149:0x0233), top: B:350:0x01fa }] */
    /* JADX WARN: Code duplicated, block: B:143:0x021d A[Catch: all -> 0x020d, TryCatch #11 {all -> 0x020d, blocks: (B:127:0x01fa, B:129:0x0201, B:131:0x0205, B:133:0x0209, B:136:0x0210, B:138:0x0214, B:140:0x0218, B:142:0x021c, B:143:0x021d, B:144:0x0222, B:145:0x0223, B:146:0x022a, B:147:0x022b, B:148:0x0232, B:149:0x0233), top: B:350:0x01fa }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0223 A[Catch: all -> 0x020d, TryCatch #11 {all -> 0x020d, blocks: (B:127:0x01fa, B:129:0x0201, B:131:0x0205, B:133:0x0209, B:136:0x0210, B:138:0x0214, B:140:0x0218, B:142:0x021c, B:143:0x021d, B:144:0x0222, B:145:0x0223, B:146:0x022a, B:147:0x022b, B:148:0x0232, B:149:0x0233), top: B:350:0x01fa }] */
    /* JADX WARN: Code duplicated, block: B:147:0x022b A[Catch: all -> 0x020d, TryCatch #11 {all -> 0x020d, blocks: (B:127:0x01fa, B:129:0x0201, B:131:0x0205, B:133:0x0209, B:136:0x0210, B:138:0x0214, B:140:0x0218, B:142:0x021c, B:143:0x021d, B:144:0x0222, B:145:0x0223, B:146:0x022a, B:147:0x022b, B:148:0x0232, B:149:0x0233), top: B:350:0x01fa }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0233 A[Catch: all -> 0x020d, TRY_LEAVE, TryCatch #11 {all -> 0x020d, blocks: (B:127:0x01fa, B:129:0x0201, B:131:0x0205, B:133:0x0209, B:136:0x0210, B:138:0x0214, B:140:0x0218, B:142:0x021c, B:143:0x021d, B:144:0x0222, B:145:0x0223, B:146:0x022a, B:147:0x022b, B:148:0x0232, B:149:0x0233), top: B:350:0x01fa }] */
    /* JADX WARN: Code duplicated, block: B:182:0x02b3 A[Catch: all -> 0x02bf, TryCatch #21 {all -> 0x02bf, blocks: (B:180:0x02ac, B:182:0x02b3, B:184:0x02b7, B:186:0x02bb, B:189:0x02c2, B:191:0x02c6, B:193:0x02ca, B:195:0x02ce, B:196:0x02cf, B:197:0x02d4, B:198:0x02d5, B:199:0x02dc, B:200:0x02dd, B:201:0x02e4, B:202:0x02e5), top: B:369:0x02ac }] */
    /* JADX WARN: Code duplicated, block: B:191:0x02c6 A[Catch: all -> 0x02bf, TryCatch #21 {all -> 0x02bf, blocks: (B:180:0x02ac, B:182:0x02b3, B:184:0x02b7, B:186:0x02bb, B:189:0x02c2, B:191:0x02c6, B:193:0x02ca, B:195:0x02ce, B:196:0x02cf, B:197:0x02d4, B:198:0x02d5, B:199:0x02dc, B:200:0x02dd, B:201:0x02e4, B:202:0x02e5), top: B:369:0x02ac }] */
    /* JADX WARN: Code duplicated, block: B:193:0x02ca A[Catch: all -> 0x02bf, TryCatch #21 {all -> 0x02bf, blocks: (B:180:0x02ac, B:182:0x02b3, B:184:0x02b7, B:186:0x02bb, B:189:0x02c2, B:191:0x02c6, B:193:0x02ca, B:195:0x02ce, B:196:0x02cf, B:197:0x02d4, B:198:0x02d5, B:199:0x02dc, B:200:0x02dd, B:201:0x02e4, B:202:0x02e5), top: B:369:0x02ac }] */
    /* JADX WARN: Code duplicated, block: B:195:0x02ce A[Catch: all -> 0x02bf, TryCatch #21 {all -> 0x02bf, blocks: (B:180:0x02ac, B:182:0x02b3, B:184:0x02b7, B:186:0x02bb, B:189:0x02c2, B:191:0x02c6, B:193:0x02ca, B:195:0x02ce, B:196:0x02cf, B:197:0x02d4, B:198:0x02d5, B:199:0x02dc, B:200:0x02dd, B:201:0x02e4, B:202:0x02e5), top: B:369:0x02ac }] */
    /* JADX WARN: Code duplicated, block: B:196:0x02cf A[Catch: all -> 0x02bf, TryCatch #21 {all -> 0x02bf, blocks: (B:180:0x02ac, B:182:0x02b3, B:184:0x02b7, B:186:0x02bb, B:189:0x02c2, B:191:0x02c6, B:193:0x02ca, B:195:0x02ce, B:196:0x02cf, B:197:0x02d4, B:198:0x02d5, B:199:0x02dc, B:200:0x02dd, B:201:0x02e4, B:202:0x02e5), top: B:369:0x02ac }] */
    /* JADX WARN: Code duplicated, block: B:198:0x02d5 A[Catch: all -> 0x02bf, TryCatch #21 {all -> 0x02bf, blocks: (B:180:0x02ac, B:182:0x02b3, B:184:0x02b7, B:186:0x02bb, B:189:0x02c2, B:191:0x02c6, B:193:0x02ca, B:195:0x02ce, B:196:0x02cf, B:197:0x02d4, B:198:0x02d5, B:199:0x02dc, B:200:0x02dd, B:201:0x02e4, B:202:0x02e5), top: B:369:0x02ac }] */
    /* JADX WARN: Code duplicated, block: B:200:0x02dd A[Catch: all -> 0x02bf, TryCatch #21 {all -> 0x02bf, blocks: (B:180:0x02ac, B:182:0x02b3, B:184:0x02b7, B:186:0x02bb, B:189:0x02c2, B:191:0x02c6, B:193:0x02ca, B:195:0x02ce, B:196:0x02cf, B:197:0x02d4, B:198:0x02d5, B:199:0x02dc, B:200:0x02dd, B:201:0x02e4, B:202:0x02e5), top: B:369:0x02ac }] */
    /* JADX WARN: Code duplicated, block: B:202:0x02e5 A[Catch: all -> 0x02bf, TRY_LEAVE, TryCatch #21 {all -> 0x02bf, blocks: (B:180:0x02ac, B:182:0x02b3, B:184:0x02b7, B:186:0x02bb, B:189:0x02c2, B:191:0x02c6, B:193:0x02ca, B:195:0x02ce, B:196:0x02cf, B:197:0x02d4, B:198:0x02d5, B:199:0x02dc, B:200:0x02dd, B:201:0x02e4, B:202:0x02e5), top: B:369:0x02ac }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0318 A[Catch: all -> 0x0324, TryCatch #2 {all -> 0x0324, blocks: (B:216:0x0311, B:218:0x0318, B:220:0x031c, B:222:0x0320, B:225:0x0327, B:227:0x032b, B:229:0x032f, B:231:0x0333, B:232:0x0334, B:233:0x0339, B:234:0x033a, B:235:0x0341, B:236:0x0342, B:237:0x0349, B:238:0x034a), top: B:337:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x032b A[Catch: all -> 0x0324, TryCatch #2 {all -> 0x0324, blocks: (B:216:0x0311, B:218:0x0318, B:220:0x031c, B:222:0x0320, B:225:0x0327, B:227:0x032b, B:229:0x032f, B:231:0x0333, B:232:0x0334, B:233:0x0339, B:234:0x033a, B:235:0x0341, B:236:0x0342, B:237:0x0349, B:238:0x034a), top: B:337:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x032f A[Catch: all -> 0x0324, TryCatch #2 {all -> 0x0324, blocks: (B:216:0x0311, B:218:0x0318, B:220:0x031c, B:222:0x0320, B:225:0x0327, B:227:0x032b, B:229:0x032f, B:231:0x0333, B:232:0x0334, B:233:0x0339, B:234:0x033a, B:235:0x0341, B:236:0x0342, B:237:0x0349, B:238:0x034a), top: B:337:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0333 A[Catch: all -> 0x0324, TryCatch #2 {all -> 0x0324, blocks: (B:216:0x0311, B:218:0x0318, B:220:0x031c, B:222:0x0320, B:225:0x0327, B:227:0x032b, B:229:0x032f, B:231:0x0333, B:232:0x0334, B:233:0x0339, B:234:0x033a, B:235:0x0341, B:236:0x0342, B:237:0x0349, B:238:0x034a), top: B:337:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x0334 A[Catch: all -> 0x0324, TryCatch #2 {all -> 0x0324, blocks: (B:216:0x0311, B:218:0x0318, B:220:0x031c, B:222:0x0320, B:225:0x0327, B:227:0x032b, B:229:0x032f, B:231:0x0333, B:232:0x0334, B:233:0x0339, B:234:0x033a, B:235:0x0341, B:236:0x0342, B:237:0x0349, B:238:0x034a), top: B:337:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x033a A[Catch: all -> 0x0324, TryCatch #2 {all -> 0x0324, blocks: (B:216:0x0311, B:218:0x0318, B:220:0x031c, B:222:0x0320, B:225:0x0327, B:227:0x032b, B:229:0x032f, B:231:0x0333, B:232:0x0334, B:233:0x0339, B:234:0x033a, B:235:0x0341, B:236:0x0342, B:237:0x0349, B:238:0x034a), top: B:337:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x0342 A[Catch: all -> 0x0324, TryCatch #2 {all -> 0x0324, blocks: (B:216:0x0311, B:218:0x0318, B:220:0x031c, B:222:0x0320, B:225:0x0327, B:227:0x032b, B:229:0x032f, B:231:0x0333, B:232:0x0334, B:233:0x0339, B:234:0x033a, B:235:0x0341, B:236:0x0342, B:237:0x0349, B:238:0x034a), top: B:337:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x034a A[Catch: all -> 0x0324, TRY_LEAVE, TryCatch #2 {all -> 0x0324, blocks: (B:216:0x0311, B:218:0x0318, B:220:0x031c, B:222:0x0320, B:225:0x0327, B:227:0x032b, B:229:0x032f, B:231:0x0333, B:232:0x0334, B:233:0x0339, B:234:0x033a, B:235:0x0341, B:236:0x0342, B:237:0x0349, B:238:0x034a), top: B:337:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:324:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:327:0x04de  */
    /* JADX WARN: Code duplicated, block: B:329:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:333:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0 A[Catch: all -> 0x00ea, TRY_LEAVE, TryCatch #8 {all -> 0x00ea, blocks: (B:36:0x00da, B:38:0x00e0, B:42:0x00ec, B:44:0x00f0, B:61:0x0131, B:62:0x0136), top: B:346:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #8 {all -> 0x00ea, blocks: (B:36:0x00da, B:38:0x00e0, B:42:0x00ec, B:44:0x00f0, B:61:0x0131, B:62:0x0136), top: B:346:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0 A[Catch: all -> 0x00ea, TRY_LEAVE, TryCatch #8 {all -> 0x00ea, blocks: (B:36:0x00da, B:38:0x00e0, B:42:0x00ec, B:44:0x00f0, B:61:0x0131, B:62:0x0136), top: B:346:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x0117 A[Catch: all -> 0x0125, TRY_ENTER, TryCatch #3 {all -> 0x0125, blocks: (B:48:0x010b, B:52:0x0117, B:54:0x011b, B:58:0x0128, B:59:0x012d), top: B:338:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x011b A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #3 {all -> 0x0125, blocks: (B:48:0x010b, B:52:0x0117, B:54:0x011b, B:58:0x0128, B:59:0x012d), top: B:338:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0128 A[Catch: all -> 0x0125, TRY_ENTER, TryCatch #3 {all -> 0x0125, blocks: (B:48:0x010b, B:52:0x0117, B:54:0x011b, B:58:0x0128, B:59:0x012d), top: B:338:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0131 A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #8 {all -> 0x00ea, blocks: (B:36:0x00da, B:38:0x00e0, B:42:0x00ec, B:44:0x00f0, B:61:0x0131, B:62:0x0136), top: B:346:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0140 A[Catch: all -> 0x014c, TryCatch #10 {all -> 0x014c, blocks: (B:65:0x0139, B:67:0x0140, B:69:0x0144, B:71:0x0148, B:74:0x014f, B:76:0x0153, B:78:0x0157, B:80:0x015b, B:81:0x015c, B:82:0x0161, B:83:0x0162, B:84:0x0169, B:85:0x016a, B:86:0x0171, B:87:0x0172), top: B:349:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0144 A[Catch: all -> 0x014c, TryCatch #10 {all -> 0x014c, blocks: (B:65:0x0139, B:67:0x0140, B:69:0x0144, B:71:0x0148, B:74:0x014f, B:76:0x0153, B:78:0x0157, B:80:0x015b, B:81:0x015c, B:82:0x0161, B:83:0x0162, B:84:0x0169, B:85:0x016a, B:86:0x0171, B:87:0x0172), top: B:349:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0153 A[Catch: all -> 0x014c, TryCatch #10 {all -> 0x014c, blocks: (B:65:0x0139, B:67:0x0140, B:69:0x0144, B:71:0x0148, B:74:0x014f, B:76:0x0153, B:78:0x0157, B:80:0x015b, B:81:0x015c, B:82:0x0161, B:83:0x0162, B:84:0x0169, B:85:0x016a, B:86:0x0171, B:87:0x0172), top: B:349:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0157 A[Catch: all -> 0x014c, TryCatch #10 {all -> 0x014c, blocks: (B:65:0x0139, B:67:0x0140, B:69:0x0144, B:71:0x0148, B:74:0x014f, B:76:0x0153, B:78:0x0157, B:80:0x015b, B:81:0x015c, B:82:0x0161, B:83:0x0162, B:84:0x0169, B:85:0x016a, B:86:0x0171, B:87:0x0172), top: B:349:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x015b A[Catch: all -> 0x014c, TryCatch #10 {all -> 0x014c, blocks: (B:65:0x0139, B:67:0x0140, B:69:0x0144, B:71:0x0148, B:74:0x014f, B:76:0x0153, B:78:0x0157, B:80:0x015b, B:81:0x015c, B:82:0x0161, B:83:0x0162, B:84:0x0169, B:85:0x016a, B:86:0x0171, B:87:0x0172), top: B:349:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x015c A[Catch: all -> 0x014c, TryCatch #10 {all -> 0x014c, blocks: (B:65:0x0139, B:67:0x0140, B:69:0x0144, B:71:0x0148, B:74:0x014f, B:76:0x0153, B:78:0x0157, B:80:0x015b, B:81:0x015c, B:82:0x0161, B:83:0x0162, B:84:0x0169, B:85:0x016a, B:86:0x0171, B:87:0x0172), top: B:349:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0162 A[Catch: all -> 0x014c, TryCatch #10 {all -> 0x014c, blocks: (B:65:0x0139, B:67:0x0140, B:69:0x0144, B:71:0x0148, B:74:0x014f, B:76:0x0153, B:78:0x0157, B:80:0x015b, B:81:0x015c, B:82:0x0161, B:83:0x0162, B:84:0x0169, B:85:0x016a, B:86:0x0171, B:87:0x0172), top: B:349:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x016a A[Catch: all -> 0x014c, TryCatch #10 {all -> 0x014c, blocks: (B:65:0x0139, B:67:0x0140, B:69:0x0144, B:71:0x0148, B:74:0x014f, B:76:0x0153, B:78:0x0157, B:80:0x015b, B:81:0x015c, B:82:0x0161, B:83:0x0162, B:84:0x0169, B:85:0x016a, B:86:0x0171, B:87:0x0172), top: B:349:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0172 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #10 {all -> 0x014c, blocks: (B:65:0x0139, B:67:0x0140, B:69:0x0144, B:71:0x0148, B:74:0x014f, B:76:0x0153, B:78:0x0157, B:80:0x015b, B:81:0x015c, B:82:0x0161, B:83:0x0162, B:84:0x0169, B:85:0x016a, B:86:0x0171, B:87:0x0172), top: B:349:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x019f A[Catch: all -> 0x01a8, TRY_LEAVE, TryCatch #6 {all -> 0x01a8, blocks: (B:97:0x0199, B:99:0x019f, B:103:0x01aa, B:105:0x01ae, B:123:0x01f1, B:124:0x01f6), top: B:343:0x0199 }] */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x042f, code lost:
    
        if (r2.invoke(r3, r16) == r0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x049f, code lost:
    
        if (r2 == r1) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x04f1, code lost:
    
        if (r0.m10437j(r2, true, r16) == r1) goto L331;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v58, types: [ads_mobile_sdk.kx2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v66, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r3v38, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r3v39, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v50 */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM10435h;
        at0 at0Var;
        Object obj2;
        Object objM7921b0;
        Object obj3;
        Object objM10807c;
        Object objMo11771c;
        Object objM1697b;
        String str;
        CharSequence charSequence;
        mx3 mx3VarM655a;
        mx3 mx3Var;
        mx3 mx3VarM2635a;
        mx3 mx3Var2;
        ?? r10;
        ?? r11;
        String str2;
        Object objM662a;
        s41 s41Var;
        ?? r12;
        Object objM2206a;
        Closeable closeable;
        ?? r3;
        String str3;
        Closeable closeable2;
        ?? r13;
        Object objM662a2;
        ?? r2;
        Object objM2206a2;
        mi5 mi5Var;
        mi5 mi5Var2;
        mi5 mi5Var3;
        mi5 mi5Var4;
        ?? M2635a = 4;
        int i = 0;
        ?? r4 = 3;
        byte b = 2;
        wm0 wm0Var = null;
        switch (this.f26085t) {
            case 0:
                ru0 ru0Var = (ru0) this.f26090y;
                ap0 ap0Var = ap0.f14763a;
                byte b2 = this.f26086u;
                if (b2 != 0) {
                    if (b2 == 1) {
                        k43.m7376J(obj);
                        objM10435h = obj;
                    } else {
                        if (b2 == 2) {
                            at0 at0Var2 = (at0) this.f26088w;
                            k43.m7376J(obj);
                            at0Var = at0Var2;
                            obj2 = obj;
                            gh3 gh3Var = (gh3) obj2;
                            ro0 ro0Var = (ro0) this.f26091z;
                            C1031pe c1031pe = new C1031pe(this.f26090y, (Object) gh3Var, this.f26087v, (Object) at0Var, (wm0) null, (byte) 9);
                            this.f26088w = at0Var;
                            this.f26086u = (byte) 3;
                            objM7921b0 = lb5.m7921b0(ro0Var, c1031pe, this);
                            if (objM7921b0 != ap0Var) {
                            }
                            return ap0Var;
                        }
                        if (b2 != 3) {
                            if (b2 != 4) {
                                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj4 = this.f26089x;
                            k43.m7376J(obj);
                            return obj4;
                        }
                        at0 at0Var3 = (at0) this.f26088w;
                        k43.m7376J(obj);
                        at0Var = at0Var3;
                        objM7921b0 = obj;
                    }
                    obj3 = at0Var.f14852b;
                    if ((obj3 != null ? obj3.hashCode() : 0) == at0Var.f14853c) {
                        C1077qn.m9989o("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        return null;
                    }
                    if (!z62.m13387o(at0Var.f14852b, objM7921b0)) {
                        this.f26088w = null;
                        this.f26089x = objM7921b0;
                        this.f26086u = (byte) 4;
                        break;
                    }
                    return objM7921b0;
                }
                k43.m7376J(obj);
                ot0 ot0Var = new ot0(ru0Var, wm0Var, b);
                this.f26086u = (byte) 1;
                objM10435h = ru0Var.m10435h(true, ot0Var, this);
                break;
                at0 at0Var4 = (at0) objM10435h;
                ru0Var.getClass();
                this.f26088w = at0Var4;
                this.f26086u = (byte) 2;
                at0Var = at0Var4;
                obj2 = null;
                gh3 gh3Var2 = (gh3) obj2;
                ro0 ro0Var2 = (ro0) this.f26091z;
                C1031pe c1031pe2 = new C1031pe(this.f26090y, (Object) gh3Var2, this.f26087v, (Object) at0Var, (wm0) null, (byte) 9);
                this.f26088w = at0Var;
                this.f26086u = (byte) 3;
                objM7921b0 = lb5.m7921b0(ro0Var2, c1031pe2, this);
                if (objM7921b0 != ap0Var) {
                    obj3 = at0Var.f14852b;
                    if ((obj3 != null ? obj3.hashCode() : 0) == at0Var.f14853c) {
                        C1077qn.m9989o("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        return null;
                    }
                    if (!z62.m13387o(at0Var.f14852b, objM7921b0)) {
                        this.f26088w = null;
                        this.f26089x = objM7921b0;
                        this.f26086u = (byte) 4;
                        break;
                    }
                    return objM7921b0;
                }
                return ap0Var;
            case 1:
                ju4 ju4Var = ju4.f22634a;
                ap0 ap0Var2 = ap0.f14763a;
                byte b3 = this.f26086u;
                try {
                    if (b3 == 0) {
                        k43.m7376J(obj);
                        u93 u93Var = (u93) this.f26088w;
                        this.f26086u = (byte) 1;
                        objMo11771c = u93Var.mo11771c(this);
                        if (objMo11771c != ap0Var2) {
                        }
                        return ap0Var2;
                    }
                    if (b3 == 1) {
                        k43.m7376J(obj);
                        objMo11771c = obj;
                    } else {
                        if (b3 != 2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    objM10807c = ju4Var;
                    qq2.m10007B(objM10807c);
                    yp1 yp1Var = (yp1) this.f26090y;
                    g44 g44Var = (g44) this.f26091z;
                    if (objM10807c instanceof yc1) {
                        yp1Var.invoke("Couldn't open shortcut!");
                        g44Var.setValue(null);
                    }
                    return ju4Var;
                    if (((Boolean) objMo11771c).booleanValue()) {
                        mq1 mq1Var = (mq1) this.f26087v;
                        Intent uri = Intent.parseUri(((ea3) this.f26089x).f17928b, 0);
                        this.f26086u = (byte) 2;
                    }
                    break;
                } catch (Throwable th) {
                    sc6.m10643O(th);
                    objM10807c = sj3.m10807c(th);
                }
                return ju4Var;
            case 2:
                ml3 ml3Var = (ml3) this.f26089x;
                m64 m64Var = (m64) this.f26090y;
                ap0 ap0Var3 = ap0.f14763a;
                byte b4 = this.f26086u;
                if (b4 == 0) {
                    k43.m7376J(obj);
                    if (!ml3Var.f25002a) {
                        ff5 ff5Var = m64Var.f7148f.f3221s;
                        ff5Var.getClass();
                        r50 r50Var = i41.f21117b;
                        long j = ((i41) ff5Var.m13553a("gads:sdk_core_update_delay_sec", zy5.m13887v(120, m41.SECONDS), C0033as.a$10)).f21121a;
                        this.f26086u = (byte) 1;
                        if (d24.m4318s(j, this) != ap0Var3) {
                        }
                    }
                    return ap0Var3;
                }
                if (b4 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b4 != 2) {
                        if (b4 != 3) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str4 = (String) this.f26088w;
                        k43.m7376J(obj);
                        return str4;
                    }
                    k43.m7376J(obj);
                    objM1697b = obj;
                }
                str = (String) objM1697b;
                if (!ml3Var.f25002a || (charSequence = (CharSequence) ((ql3) this.f26087v).f28555a) == null || hd4.m6345k0(charSequence) || str == null || hd4.m6345k0(str)) {
                    return str;
                }
                this.f26088w = str;
                this.f26086u = (byte) 3;
                if (m64.m1695a(m64Var, str, this) != ap0Var3) {
                    return str;
                }
                return ap0Var3;
                String str5 = (String) this.f26091z;
                this.f26086u = (byte) 2;
                objM1697b = m64.m1697b(m64Var, str5, this);
                if (objM1697b != ap0Var3) {
                    str = (String) objM1697b;
                    return ml3Var.f25002a ? str : str;
                }
                return ap0Var3;
            case 3:
                ju4 ju4Var2 = ju4.f22634a;
                ap0 ap0Var4 = ap0.f14763a;
                byte b5 = this.f26086u;
                if (b5 == 0) {
                    k43.m7376J(obj);
                    gu1 gu1Var = (gu1) this.f26090y;
                    xa3 xa3Var = gu1Var.f4125a;
                    s21 s21Var = s21.f11049R0;
                    v71 v71Var = v71.f32439a;
                    fy3 fy3Var = gu1Var.f4126b;
                    k83 k83Var = (k83) this.f26091z;
                    wa2 wa2Var = (wa2) this.f26087v;
                    if (cy3.m656b().f1710a == null) {
                        mx3VarM2635a = xa3.m2635a(xa3Var, s21Var, v71Var, fy3Var);
                        try {
                            cy3.m653a().mo1538e().f5877l = 3;
                            this.f26088w = mx3VarM2635a;
                            this.f26089x = mx3VarM2635a;
                            this.f26086u = (byte) 1;
                            if (k83Var.m1477a(wa2Var, this) != ap0Var4) {
                                mx3Var2 = mx3VarM2635a;
                                lb5.m7941v(mx3Var2, null);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            mx3Var2 = mx3VarM2635a;
                            mx3VarM2635a.m1736b(th);
                            if (!(th instanceof ka5)) {
                                throw th;
                            }
                            if (!(th instanceof zm4)) {
                                mx3VarM2635a.m1735a(th);
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
                    } else {
                        mx3VarM655a = cy3.m655a(s21Var, v71Var, true);
                        try {
                            cy3.m653a().mo1538e().f5877l = 3;
                            this.f26088w = mx3VarM655a;
                            this.f26089x = mx3VarM655a;
                            this.f26086u = (byte) 2;
                            if (k83Var.m1477a(wa2Var, this) != ap0Var4) {
                                mx3Var = mx3VarM655a;
                                lb5.m7941v(mx3Var, null);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            mx3Var = mx3VarM655a;
                            mx3VarM655a.m1736b(th);
                            if (!(th instanceof ka5)) {
                                throw th;
                            }
                            if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                                mx3VarM655a.m1735a(th);
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
                    return ap0Var4;
                }
                if (b5 == 1) {
                    mx3Var2 = (mx3) this.f26089x;
                    mx3VarM2635a = (mx3) this.f26088w;
                    try {
                        k43.m7376J(obj);
                        lb5.m7941v(mx3Var2, null);
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            mx3VarM2635a.m1736b(th);
                            if (!(th instanceof ka5)) {
                                throw th;
                            }
                            if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                                mx3VarM2635a.m1735a(th);
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
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                lb5.m7941v(mx3Var2, th5);
                                throw th6;
                            }
                        }
                    }
                } else {
                    if (b5 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mx3Var = (mx3) this.f26089x;
                    mx3VarM655a = (mx3) this.f26088w;
                    try {
                        k43.m7376J(obj);
                        lb5.m7941v(mx3Var, null);
                    } catch (Throwable th7) {
                        th = th7;
                        try {
                            mx3VarM655a.m1736b(th);
                            if (!(th instanceof ka5)) {
                                throw th;
                            }
                            if (!(th instanceof zm4)) {
                                mx3VarM655a.m1735a(th);
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
                        } catch (Throwable th8) {
                            try {
                                throw th8;
                            } catch (Throwable th9) {
                                lb5.m7941v(mx3Var, th8);
                                throw th9;
                            }
                        }
                    }
                }
                return ju4Var2;
            default:
                ap0 ap0Var5 = ap0.f14763a;
                byte b6 = this.f26086u;
                if (b6 == 0) {
                    k43.m7376J(obj);
                    k72 k72Var = (k72) this.f26091z;
                    xa3 xa3Var2 = k72Var.f6108g;
                    s21 s21Var2 = s21.f11076a1;
                    String str6 = (String) this.f26087v;
                    v71 v71Var2 = v71.f32439a;
                    fy3 fy3Var2 = new fy3(new e33(), new aq1(), new d63(), new C0217lc());
                    int i2 = 14;
                    if (cy3.m656b().f1710a == null) {
                        M2635a = xa3.m2635a(xa3Var2, s21Var2, v71Var2, fy3Var2);
                        try {
                            d54 d54Var = k72Var.f6106e;
                            j84 j84Var = new j84(i84.f4866a, i, i, i2);
                            this.f26089x = str6;
                            this.f26088w = M2635a;
                            this.f26090y = M2635a;
                            this.f26086u = (byte) 1;
                            objM662a = d54Var.m662a(j84Var, null, false, this);
                            if (objM662a != ap0Var5) {
                                ?? r14 = M2635a;
                                str2 = str6;
                                r11 = r14;
                                r10 = r14;
                                mi5Var4 = (mi5) objM662a;
                                if (mi5Var4 instanceof i11) {
                                    sy3.m2306a((i11) mi5Var4, false);
                                    lb5.m7941v(r10, null);
                                    return null;
                                }
                                if (mi5Var4 instanceof q11) {
                                    throw new gf0();
                                }
                                s41Var = (s41) ((q11) mi5Var4).f8791b;
                                this.f26089x = r11;
                                this.f26088w = r10;
                                this.f26090y = s41Var;
                                this.f26086u = (byte) 2;
                                objM2206a = s41.m2206a(s41Var, str2, (String) null, false, (ym0) this, 14);
                                if (objM2206a != ap0Var5) {
                                    r4 = r11;
                                    r12 = r10;
                                    mi5Var3 = (mi5) objM2206a;
                                    if (mi5Var3 instanceof q11) {
                                        lb5.m7941v(r12, null);
                                        return s41Var;
                                    }
                                    if (mi5Var3 instanceof i11) {
                                        throw new gf0();
                                    }
                                    sy3.m2306a((i11) mi5Var3, false);
                                    lb5.m7941v(r12, null);
                                    return null;
                                }
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            r4 = M2635a;
                            r4.m1736b(th);
                            if (!(th instanceof ka5)) {
                                throw th;
                            }
                            if (!(th instanceof zm4)) {
                                r4.m1735a(th);
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
                    } else {
                        mx3 mx3VarM655a2 = cy3.m655a(s21Var2, v71Var2, true);
                        try {
                            d54 d54Var2 = k72Var.f6106e;
                            j84 j84Var2 = new j84(i84.f4866a, i, i, i2);
                            this.f26089x = str6;
                            this.f26088w = mx3VarM655a2;
                            this.f26090y = mx3VarM655a2;
                            this.f26086u = (byte) 3;
                            objM662a2 = d54Var2.m662a(j84Var2, null, false, this);
                            if (objM662a2 != ap0Var5) {
                                closeable2 = mx3VarM655a2;
                                r13 = closeable2;
                                str3 = str6;
                                mi5Var2 = (mi5) objM662a2;
                                if (mi5Var2 instanceof i11) {
                                    sy3.m2306a((i11) mi5Var2, false);
                                    lb5.m7941v(closeable2, null);
                                    return null;
                                }
                                if (mi5Var2 instanceof q11) {
                                    throw new gf0();
                                }
                                s41Var = (s41) ((q11) mi5Var2).f8791b;
                                this.f26089x = r13;
                                this.f26088w = closeable2;
                                this.f26090y = s41Var;
                                this.f26086u = (byte) 4;
                                objM2206a2 = s41.m2206a(s41Var, str3, (String) null, false, (ym0) this, 14);
                                if (objM2206a2 != ap0Var5) {
                                    r2 = r13;
                                    mi5Var = (mi5) objM2206a2;
                                    if (mi5Var instanceof q11) {
                                        lb5.m7941v(closeable2, null);
                                        return s41Var;
                                    }
                                    if (!(mi5Var instanceof i11)) {
                                        throw new gf0();
                                    }
                                    sy3.m2306a((i11) mi5Var, false);
                                    lb5.m7941v(closeable2, null);
                                    return null;
                                }
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            closeable = mx3VarM655a2;
                            r3 = closeable;
                        }
                    }
                    return ap0Var5;
                }
                try {
                    try {
                        if (b6 == 1) {
                            Closeable closeable3 = (Closeable) this.f26090y;
                            mx3 mx3Var3 = (mx3) ((Closeable) this.f26088w);
                            String str7 = (String) this.f26089x;
                            k43.m7376J(obj);
                            r10 = closeable3;
                            r11 = mx3Var3;
                            str2 = str7;
                            objM662a = obj;
                            try {
                                mi5Var4 = (mi5) objM662a;
                                if (mi5Var4 instanceof i11) {
                                    sy3.m2306a((i11) mi5Var4, false);
                                    lb5.m7941v(r10, null);
                                    return null;
                                }
                                if (mi5Var4 instanceof q11) {
                                    throw new gf0();
                                }
                                s41Var = (s41) ((q11) mi5Var4).f8791b;
                                this.f26089x = r11;
                                this.f26088w = r10;
                                this.f26090y = s41Var;
                                this.f26086u = (byte) 2;
                                objM2206a = s41.m2206a(s41Var, str2, (String) null, false, (ym0) this, 14);
                                if (objM2206a != ap0Var5) {
                                    r4 = r11;
                                    r12 = r10;
                                }
                                return ap0Var5;
                            } catch (Throwable th12) {
                                th = th12;
                                M2635a = r10;
                                r4 = r11;
                                try {
                                    r4.m1736b(th);
                                    if (!(th instanceof ka5)) {
                                        throw th;
                                    }
                                    if (!(th instanceof zm4)) {
                                        r4.m1735a(th);
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
                                } catch (Throwable th13) {
                                    try {
                                        throw th13;
                                    } catch (Throwable th14) {
                                        lb5.m7941v(M2635a, th13);
                                        throw th14;
                                    }
                                }
                            }
                        }
                        if (b6 == 2) {
                            s41Var = (s41) this.f26090y;
                            Closeable closeable4 = (Closeable) this.f26088w;
                            mx3 mx3Var4 = (mx3) this.f26089x;
                            k43.m7376J(obj);
                            r12 = closeable4;
                            objM2206a = obj;
                            r4 = mx3Var4;
                        } else {
                            if (b6 != 3) {
                                if (b6 != 4) {
                                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                s41Var = (s41) this.f26090y;
                                Closeable closeable5 = (Closeable) this.f26088w;
                                r2 = (mx3) this.f26089x;
                                try {
                                    k43.m7376J(obj);
                                    closeable2 = closeable5;
                                    objM2206a2 = obj;
                                    r2 = r2;
                                    try {
                                        mi5Var = (mi5) objM2206a2;
                                        if (mi5Var instanceof q11) {
                                            lb5.m7941v(closeable2, null);
                                            return s41Var;
                                        }
                                        if (!(mi5Var instanceof i11)) {
                                            throw new gf0();
                                        }
                                        sy3.m2306a((i11) mi5Var, false);
                                        lb5.m7941v(closeable2, null);
                                        return null;
                                    } catch (Throwable th15) {
                                        th = th15;
                                        closeable5 = closeable2;
                                        r3 = r2;
                                        closeable = closeable5;
                                        r3.m1736b(th);
                                        if (th instanceof ka5) {
                                            throw th;
                                        }
                                        if (!(th instanceof zm4)) {
                                            r3.m1735a(th);
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
                                } catch (Throwable th16) {
                                    th = th16;
                                    r3 = r2;
                                    closeable = closeable5;
                                    r3.m1736b(th);
                                    if (th instanceof ka5) {
                                        throw th;
                                    }
                                    if (!(th instanceof zm4)) {
                                        r3.m1735a(th);
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
                            closeable = (Closeable) this.f26090y;
                            r3 = (mx3) ((Closeable) this.f26088w);
                            String str8 = (String) this.f26089x;
                            try {
                                k43.m7376J(obj);
                                str3 = str8;
                                closeable2 = closeable;
                                r13 = r3;
                                objM662a2 = obj;
                                try {
                                    mi5Var2 = (mi5) objM662a2;
                                    if (mi5Var2 instanceof i11) {
                                        sy3.m2306a((i11) mi5Var2, false);
                                        lb5.m7941v(closeable2, null);
                                        return null;
                                    }
                                    if (mi5Var2 instanceof q11) {
                                        throw new gf0();
                                    }
                                    s41Var = (s41) ((q11) mi5Var2).f8791b;
                                    this.f26089x = r13;
                                    this.f26088w = closeable2;
                                    this.f26090y = s41Var;
                                    this.f26086u = (byte) 4;
                                    objM2206a2 = s41.m2206a(s41Var, str3, (String) null, false, (ym0) this, 14);
                                    if (objM2206a2 != ap0Var5) {
                                        r2 = r13;
                                        mi5Var = (mi5) objM2206a2;
                                        if (mi5Var instanceof q11) {
                                            lb5.m7941v(closeable2, null);
                                            return s41Var;
                                        }
                                        if (!(mi5Var instanceof i11)) {
                                            throw new gf0();
                                        }
                                        sy3.m2306a((i11) mi5Var, false);
                                        lb5.m7941v(closeable2, null);
                                        return null;
                                    }
                                    return ap0Var5;
                                } catch (Throwable th17) {
                                    th = th17;
                                    closeable = closeable2;
                                    r3 = r13;
                                }
                            } catch (Throwable th18) {
                                th = th18;
                            }
                        }
                        mi5Var3 = (mi5) objM2206a;
                        if (mi5Var3 instanceof q11) {
                            lb5.m7941v(r12, null);
                            return s41Var;
                        }
                        if (mi5Var3 instanceof i11) {
                            throw new gf0();
                        }
                        sy3.m2306a((i11) mi5Var3, false);
                        lb5.m7941v(r12, null);
                        return null;
                    } catch (Throwable th19) {
                        th = th19;
                        M2635a = r12;
                        r4.m1736b(th);
                        if (!(th instanceof ka5)) {
                            throw th;
                        }
                        if (!(th instanceof zm4)) {
                            r4.m1735a(th);
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
                } catch (Throwable th20) {
                    th = th20;
                    r4.m1736b(th);
                    if (!(th instanceof ka5)) {
                        throw th;
                    }
                    if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                        r4.m1735a(th);
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
                try {
                    r3.m1736b(th);
                    if (th instanceof ka5) {
                        throw th;
                    }
                    if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                        r3.m1735a(th);
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
                } catch (Throwable th21) {
                    try {
                        throw th21;
                    } catch (Throwable th22) {
                        lb5.m7941v(closeable, th21);
                        throw th22;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nu0(Object obj, Object obj2, Object obj3, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f26085t = b;
        this.f26090y = obj;
        this.f26091z = obj2;
        this.f26087v = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu0(ml3 ml3Var, m64 m64Var, String str, ql3 ql3Var, wm0 wm0Var) {
        super(1, wm0Var);
        this.f26085t = (byte) 2;
        this.f26089x = ml3Var;
        this.f26090y = m64Var;
        this.f26091z = str;
        this.f26087v = ql3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu0(k72 k72Var, String str, wm0 wm0Var) {
        super(1, wm0Var);
        this.f26085t = (byte) 4;
        this.f26091z = k72Var;
        this.f26087v = str;
    }
}
