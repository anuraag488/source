package p000;

import ads_mobile_sdk.AbstractC0054bv;
import ads_mobile_sdk.C0217lc;
import ads_mobile_sdk.C0348tu;
import ads_mobile_sdk.aq1;
import ads_mobile_sdk.b11;
import ads_mobile_sdk.cy3;
import ads_mobile_sdk.d63;
import ads_mobile_sdk.e33;
import ads_mobile_sdk.fy3;
import ads_mobile_sdk.gu1;
import ads_mobile_sdk.i11;
import ads_mobile_sdk.j11;
import ads_mobile_sdk.j31;
import ads_mobile_sdk.kx2;
import ads_mobile_sdk.mx3;
import ads_mobile_sdk.pm1;
import ads_mobile_sdk.q11;
import ads_mobile_sdk.s21;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.w01;
import ads_mobile_sdk.w11;
import ads_mobile_sdk.xa3;
import ads_mobile_sdk.ym3;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.SystemClock;
import java.io.Closeable;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: sm */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1150sm extends of4 implements yp1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Object f30382A;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f30383t = 1;

    /* JADX INFO: renamed from: u */
    public Object f30384u;

    /* JADX INFO: renamed from: v */
    public byte f30385v;

    /* JADX INFO: renamed from: w */
    public Object f30386w;

    /* JADX INFO: renamed from: x */
    public Object f30387x;

    /* JADX INFO: renamed from: y */
    public Object f30388y;

    /* JADX INFO: renamed from: z */
    public Object f30389z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1150sm(gu1 gu1Var, jg5 jg5Var, mq1 mq1Var, Uri uri, wm0 wm0Var) {
        super(1, wm0Var);
        this.f30389z = gu1Var;
        this.f30384u = jg5Var;
        this.f30386w = mq1Var;
        this.f30382A = uri;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f30383t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f30382A;
        switch (b) {
            case 0:
                return new C1150sm((Context) obj2, (mq1) this.f30387x, (wm0) obj).invokeSuspend(ju4Var);
            case 1:
                return new C1150sm((AbstractC0054bv) obj2, (wm0) obj).invokeSuspend(ju4Var);
            default:
                return new C1150sm((gu1) this.f30389z, (jg5) this.f30384u, (mq1) this.f30386w, (Uri) obj2, (wm0) obj).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x027b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0281 A[Catch: all -> 0x02a6, TryCatch #4 {all -> 0x02a6, blocks: (B:154:0x027d, B:156:0x0281, B:163:0x02b4, B:159:0x02a8, B:161:0x02b0), top: B:320:0x027d }] */
    /* JADX WARN: Code duplicated, block: B:159:0x02a8 A[Catch: all -> 0x02a6, TryCatch #4 {all -> 0x02a6, blocks: (B:154:0x027d, B:156:0x0281, B:163:0x02b4, B:159:0x02a8, B:161:0x02b0), top: B:320:0x027d }] */
    /* JADX WARN: Code duplicated, block: B:161:0x02b0 A[Catch: all -> 0x02a6, TryCatch #4 {all -> 0x02a6, blocks: (B:154:0x027d, B:156:0x0281, B:163:0x02b4, B:159:0x02a8, B:161:0x02b0), top: B:320:0x027d }] */
    /* JADX WARN: Code duplicated, block: B:162:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:181:0x0308 A[Catch: all -> 0x01c9, TRY_LEAVE, TryCatch #21 {all -> 0x01c9, blocks: (B:118:0x01c2, B:178:0x02ec, B:179:0x0304, B:181:0x0308, B:184:0x0316, B:185:0x0319, B:174:0x02d3, B:177:0x02ea), top: B:317:0x0142, inners: #27 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0322 A[Catch: all -> 0x032e, TryCatch #9 {all -> 0x032e, blocks: (B:187:0x031b, B:189:0x0322, B:191:0x0326, B:193:0x032a, B:196:0x0331, B:198:0x0335, B:200:0x0339, B:202:0x033d, B:203:0x033e, B:204:0x0343, B:205:0x0344, B:206:0x034b, B:207:0x034c, B:208:0x0353, B:209:0x0354), top: B:326:0x031b }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0326 A[Catch: all -> 0x032e, TryCatch #9 {all -> 0x032e, blocks: (B:187:0x031b, B:189:0x0322, B:191:0x0326, B:193:0x032a, B:196:0x0331, B:198:0x0335, B:200:0x0339, B:202:0x033d, B:203:0x033e, B:204:0x0343, B:205:0x0344, B:206:0x034b, B:207:0x034c, B:208:0x0353, B:209:0x0354), top: B:326:0x031b }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0335 A[Catch: all -> 0x032e, TryCatch #9 {all -> 0x032e, blocks: (B:187:0x031b, B:189:0x0322, B:191:0x0326, B:193:0x032a, B:196:0x0331, B:198:0x0335, B:200:0x0339, B:202:0x033d, B:203:0x033e, B:204:0x0343, B:205:0x0344, B:206:0x034b, B:207:0x034c, B:208:0x0353, B:209:0x0354), top: B:326:0x031b }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0339 A[Catch: all -> 0x032e, TryCatch #9 {all -> 0x032e, blocks: (B:187:0x031b, B:189:0x0322, B:191:0x0326, B:193:0x032a, B:196:0x0331, B:198:0x0335, B:200:0x0339, B:202:0x033d, B:203:0x033e, B:204:0x0343, B:205:0x0344, B:206:0x034b, B:207:0x034c, B:208:0x0353, B:209:0x0354), top: B:326:0x031b }] */
    /* JADX WARN: Code duplicated, block: B:202:0x033d A[Catch: all -> 0x032e, TryCatch #9 {all -> 0x032e, blocks: (B:187:0x031b, B:189:0x0322, B:191:0x0326, B:193:0x032a, B:196:0x0331, B:198:0x0335, B:200:0x0339, B:202:0x033d, B:203:0x033e, B:204:0x0343, B:205:0x0344, B:206:0x034b, B:207:0x034c, B:208:0x0353, B:209:0x0354), top: B:326:0x031b }] */
    /* JADX WARN: Code duplicated, block: B:203:0x033e A[Catch: all -> 0x032e, TryCatch #9 {all -> 0x032e, blocks: (B:187:0x031b, B:189:0x0322, B:191:0x0326, B:193:0x032a, B:196:0x0331, B:198:0x0335, B:200:0x0339, B:202:0x033d, B:203:0x033e, B:204:0x0343, B:205:0x0344, B:206:0x034b, B:207:0x034c, B:208:0x0353, B:209:0x0354), top: B:326:0x031b }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0344 A[Catch: all -> 0x032e, TryCatch #9 {all -> 0x032e, blocks: (B:187:0x031b, B:189:0x0322, B:191:0x0326, B:193:0x032a, B:196:0x0331, B:198:0x0335, B:200:0x0339, B:202:0x033d, B:203:0x033e, B:204:0x0343, B:205:0x0344, B:206:0x034b, B:207:0x034c, B:208:0x0353, B:209:0x0354), top: B:326:0x031b }] */
    /* JADX WARN: Code duplicated, block: B:207:0x034c A[Catch: all -> 0x032e, TryCatch #9 {all -> 0x032e, blocks: (B:187:0x031b, B:189:0x0322, B:191:0x0326, B:193:0x032a, B:196:0x0331, B:198:0x0335, B:200:0x0339, B:202:0x033d, B:203:0x033e, B:204:0x0343, B:205:0x0344, B:206:0x034b, B:207:0x034c, B:208:0x0353, B:209:0x0354), top: B:326:0x031b }] */
    /* JADX WARN: Code duplicated, block: B:209:0x0354 A[Catch: all -> 0x032e, TRY_LEAVE, TryCatch #9 {all -> 0x032e, blocks: (B:187:0x031b, B:189:0x0322, B:191:0x0326, B:193:0x032a, B:196:0x0331, B:198:0x0335, B:200:0x0339, B:202:0x033d, B:203:0x033e, B:204:0x0343, B:205:0x0344, B:206:0x034b, B:207:0x034c, B:208:0x0353, B:209:0x0354), top: B:326:0x031b }] */
    /* JADX WARN: Code duplicated, block: B:223:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:226:0x03a9 A[Catch: all -> 0x03ce, TryCatch #24 {all -> 0x03ce, blocks: (B:224:0x03a5, B:226:0x03a9, B:233:0x03dc, B:229:0x03d0, B:231:0x03d8), top: B:346:0x03a5, outer: #31 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x03d0 A[Catch: all -> 0x03ce, TryCatch #24 {all -> 0x03ce, blocks: (B:224:0x03a5, B:226:0x03a9, B:233:0x03dc, B:229:0x03d0, B:231:0x03d8), top: B:346:0x03a5, outer: #31 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x03d8 A[Catch: all -> 0x03ce, TryCatch #24 {all -> 0x03ce, blocks: (B:224:0x03a5, B:226:0x03a9, B:233:0x03dc, B:229:0x03d0, B:231:0x03d8), top: B:346:0x03a5, outer: #31 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x03db  */
    /* JADX WARN: Code duplicated, block: B:252:0x0432 A[Catch: all -> 0x0165, TRY_LEAVE, TryCatch #2 {all -> 0x0165, blocks: (B:97:0x015e, B:249:0x0417, B:250:0x042e, B:252:0x0432, B:256:0x043f, B:257:0x0442, B:245:0x03fe, B:220:0x0387, B:248:0x0415), top: B:317:0x0142, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x044c A[Catch: all -> 0x0458, TryCatch #29 {all -> 0x0458, blocks: (B:259:0x0445, B:261:0x044c, B:263:0x0450, B:265:0x0454, B:268:0x045b, B:270:0x045f, B:272:0x0463, B:274:0x0467, B:275:0x0468, B:276:0x046d, B:277:0x046e, B:278:0x0475, B:279:0x0476, B:280:0x047d, B:281:0x047e), top: B:354:0x0445 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0450 A[Catch: all -> 0x0458, TryCatch #29 {all -> 0x0458, blocks: (B:259:0x0445, B:261:0x044c, B:263:0x0450, B:265:0x0454, B:268:0x045b, B:270:0x045f, B:272:0x0463, B:274:0x0467, B:275:0x0468, B:276:0x046d, B:277:0x046e, B:278:0x0475, B:279:0x0476, B:280:0x047d, B:281:0x047e), top: B:354:0x0445 }] */
    /* JADX WARN: Code duplicated, block: B:270:0x045f A[Catch: all -> 0x0458, TryCatch #29 {all -> 0x0458, blocks: (B:259:0x0445, B:261:0x044c, B:263:0x0450, B:265:0x0454, B:268:0x045b, B:270:0x045f, B:272:0x0463, B:274:0x0467, B:275:0x0468, B:276:0x046d, B:277:0x046e, B:278:0x0475, B:279:0x0476, B:280:0x047d, B:281:0x047e), top: B:354:0x0445 }] */
    /* JADX WARN: Code duplicated, block: B:272:0x0463 A[Catch: all -> 0x0458, TryCatch #29 {all -> 0x0458, blocks: (B:259:0x0445, B:261:0x044c, B:263:0x0450, B:265:0x0454, B:268:0x045b, B:270:0x045f, B:272:0x0463, B:274:0x0467, B:275:0x0468, B:276:0x046d, B:277:0x046e, B:278:0x0475, B:279:0x0476, B:280:0x047d, B:281:0x047e), top: B:354:0x0445 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x0467 A[Catch: all -> 0x0458, TryCatch #29 {all -> 0x0458, blocks: (B:259:0x0445, B:261:0x044c, B:263:0x0450, B:265:0x0454, B:268:0x045b, B:270:0x045f, B:272:0x0463, B:274:0x0467, B:275:0x0468, B:276:0x046d, B:277:0x046e, B:278:0x0475, B:279:0x0476, B:280:0x047d, B:281:0x047e), top: B:354:0x0445 }] */
    /* JADX WARN: Code duplicated, block: B:275:0x0468 A[Catch: all -> 0x0458, TryCatch #29 {all -> 0x0458, blocks: (B:259:0x0445, B:261:0x044c, B:263:0x0450, B:265:0x0454, B:268:0x045b, B:270:0x045f, B:272:0x0463, B:274:0x0467, B:275:0x0468, B:276:0x046d, B:277:0x046e, B:278:0x0475, B:279:0x0476, B:280:0x047d, B:281:0x047e), top: B:354:0x0445 }] */
    /* JADX WARN: Code duplicated, block: B:277:0x046e A[Catch: all -> 0x0458, TryCatch #29 {all -> 0x0458, blocks: (B:259:0x0445, B:261:0x044c, B:263:0x0450, B:265:0x0454, B:268:0x045b, B:270:0x045f, B:272:0x0463, B:274:0x0467, B:275:0x0468, B:276:0x046d, B:277:0x046e, B:278:0x0475, B:279:0x0476, B:280:0x047d, B:281:0x047e), top: B:354:0x0445 }] */
    /* JADX WARN: Code duplicated, block: B:279:0x0476 A[Catch: all -> 0x0458, TryCatch #29 {all -> 0x0458, blocks: (B:259:0x0445, B:261:0x044c, B:263:0x0450, B:265:0x0454, B:268:0x045b, B:270:0x045f, B:272:0x0463, B:274:0x0467, B:275:0x0468, B:276:0x046d, B:277:0x046e, B:278:0x0475, B:279:0x0476, B:280:0x047d, B:281:0x047e), top: B:354:0x0445 }] */
    /* JADX WARN: Code duplicated, block: B:281:0x047e A[Catch: all -> 0x0458, TRY_LEAVE, TryCatch #29 {all -> 0x0458, blocks: (B:259:0x0445, B:261:0x044c, B:263:0x0450, B:265:0x0454, B:268:0x045b, B:270:0x045f, B:272:0x0463, B:274:0x0467, B:275:0x0468, B:276:0x046d, B:277:0x046e, B:278:0x0475, B:279:0x0476, B:280:0x047d, B:281:0x047e), top: B:354:0x0445 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x0511 A[Catch: all -> 0x055d, TryCatch #32 {all -> 0x055d, blocks: (B:292:0x04a4, B:308:0x0533, B:303:0x050b, B:305:0x0511, B:311:0x053f, B:310:0x053b, B:296:0x04b6, B:302:0x04fe, B:299:0x04c8), top: B:357:0x0489 }] */
    /* JADX WARN: Code duplicated, block: B:311:0x053f A[Catch: all -> 0x055d, TRY_LEAVE, TryCatch #32 {all -> 0x055d, blocks: (B:292:0x04a4, B:308:0x0533, B:303:0x050b, B:305:0x0511, B:311:0x053f, B:310:0x053b, B:296:0x04b6, B:302:0x04fe, B:299:0x04c8), top: B:357:0x0489 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:30:0x008e, B:32:0x0095, B:34:0x0099, B:36:0x009d, B:39:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b0, B:46:0x00b1, B:47:0x00b6, B:48:0x00b7, B:49:0x00be, B:50:0x00bf, B:51:0x00c6, B:52:0x00c7), top: B:316:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:30:0x008e, B:32:0x0095, B:34:0x0099, B:36:0x009d, B:39:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b0, B:46:0x00b1, B:47:0x00b6, B:48:0x00b7, B:49:0x00be, B:50:0x00bf, B:51:0x00c6, B:52:0x00c7), top: B:316:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:30:0x008e, B:32:0x0095, B:34:0x0099, B:36:0x009d, B:39:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b0, B:46:0x00b1, B:47:0x00b6, B:48:0x00b7, B:49:0x00be, B:50:0x00bf, B:51:0x00c6, B:52:0x00c7), top: B:316:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:30:0x008e, B:32:0x0095, B:34:0x0099, B:36:0x009d, B:39:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b0, B:46:0x00b1, B:47:0x00b6, B:48:0x00b7, B:49:0x00be, B:50:0x00bf, B:51:0x00c6, B:52:0x00c7), top: B:316:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:30:0x008e, B:32:0x0095, B:34:0x0099, B:36:0x009d, B:39:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b0, B:46:0x00b1, B:47:0x00b6, B:48:0x00b7, B:49:0x00be, B:50:0x00bf, B:51:0x00c6, B:52:0x00c7), top: B:316:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:30:0x008e, B:32:0x0095, B:34:0x0099, B:36:0x009d, B:39:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b0, B:46:0x00b1, B:47:0x00b6, B:48:0x00b7, B:49:0x00be, B:50:0x00bf, B:51:0x00c6, B:52:0x00c7), top: B:316:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bf A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:30:0x008e, B:32:0x0095, B:34:0x0099, B:36:0x009d, B:39:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b0, B:46:0x00b1, B:47:0x00b6, B:48:0x00b7, B:49:0x00be, B:50:0x00bf, B:51:0x00c6, B:52:0x00c7), top: B:316:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:30:0x008e, B:32:0x0095, B:34:0x0099, B:36:0x009d, B:39:0x00a4, B:41:0x00a8, B:43:0x00ac, B:45:0x00b0, B:46:0x00b1, B:47:0x00b6, B:48:0x00b7, B:49:0x00be, B:50:0x00bf, B:51:0x00c6, B:52:0x00c7), top: B:316:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0104 A[Catch: all -> 0x0110, TryCatch #26 {all -> 0x0110, blocks: (B:66:0x00fd, B:68:0x0104, B:70:0x0108, B:72:0x010c, B:75:0x0113, B:77:0x0117, B:79:0x011b, B:81:0x011f, B:82:0x0120, B:83:0x0125, B:84:0x0126, B:85:0x012d, B:86:0x012e, B:87:0x0135, B:88:0x0136), top: B:349:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0117 A[Catch: all -> 0x0110, TryCatch #26 {all -> 0x0110, blocks: (B:66:0x00fd, B:68:0x0104, B:70:0x0108, B:72:0x010c, B:75:0x0113, B:77:0x0117, B:79:0x011b, B:81:0x011f, B:82:0x0120, B:83:0x0125, B:84:0x0126, B:85:0x012d, B:86:0x012e, B:87:0x0135, B:88:0x0136), top: B:349:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:79:0x011b A[Catch: all -> 0x0110, TryCatch #26 {all -> 0x0110, blocks: (B:66:0x00fd, B:68:0x0104, B:70:0x0108, B:72:0x010c, B:75:0x0113, B:77:0x0117, B:79:0x011b, B:81:0x011f, B:82:0x0120, B:83:0x0125, B:84:0x0126, B:85:0x012d, B:86:0x012e, B:87:0x0135, B:88:0x0136), top: B:349:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:81:0x011f A[Catch: all -> 0x0110, TryCatch #26 {all -> 0x0110, blocks: (B:66:0x00fd, B:68:0x0104, B:70:0x0108, B:72:0x010c, B:75:0x0113, B:77:0x0117, B:79:0x011b, B:81:0x011f, B:82:0x0120, B:83:0x0125, B:84:0x0126, B:85:0x012d, B:86:0x012e, B:87:0x0135, B:88:0x0136), top: B:349:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0120 A[Catch: all -> 0x0110, TryCatch #26 {all -> 0x0110, blocks: (B:66:0x00fd, B:68:0x0104, B:70:0x0108, B:72:0x010c, B:75:0x0113, B:77:0x0117, B:79:0x011b, B:81:0x011f, B:82:0x0120, B:83:0x0125, B:84:0x0126, B:85:0x012d, B:86:0x012e, B:87:0x0135, B:88:0x0136), top: B:349:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0126 A[Catch: all -> 0x0110, TryCatch #26 {all -> 0x0110, blocks: (B:66:0x00fd, B:68:0x0104, B:70:0x0108, B:72:0x010c, B:75:0x0113, B:77:0x0117, B:79:0x011b, B:81:0x011f, B:82:0x0120, B:83:0x0125, B:84:0x0126, B:85:0x012d, B:86:0x012e, B:87:0x0135, B:88:0x0136), top: B:349:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:86:0x012e A[Catch: all -> 0x0110, TryCatch #26 {all -> 0x0110, blocks: (B:66:0x00fd, B:68:0x0104, B:70:0x0108, B:72:0x010c, B:75:0x0113, B:77:0x0117, B:79:0x011b, B:81:0x011f, B:82:0x0120, B:83:0x0125, B:84:0x0126, B:85:0x012d, B:86:0x012e, B:87:0x0135, B:88:0x0136), top: B:349:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0136 A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #26 {all -> 0x0110, blocks: (B:66:0x00fd, B:68:0x0104, B:70:0x0108, B:72:0x010c, B:75:0x0113, B:77:0x0117, B:79:0x011b, B:81:0x011f, B:82:0x0120, B:83:0x0125, B:84:0x0126, B:85:0x012d, B:86:0x012e, B:87:0x0135, B:88:0x0136), top: B:349:0x00fd }] */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02e6, code lost:
    
        if (r0.m6191e(r17) == r7) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0411, code lost:
    
        if (r0.m6191e(r17) == r7) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x052f, code lost:
    
        if (r7 == r0) goto L307;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v7, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r3v8, types: [ads_mobile_sdk.mx3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v24, types: [ads_mobile_sdk.mx3] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:306:0x052f -> B:308:0x0533). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mq1 mq1Var;
        Object objM13685q;
        Collection arrayList;
        mq1 mq1Var2;
        Iterator it;
        Object next;
        Object objInvoke;
        ?? r9;
        ?? r3;
        ?? r1;
        ?? r4;
        AbstractC0054bv abstractC0054bv;
        ?? r5;
        Object objMo279s;
        AbstractC0054bv abstractC0054bv2;
        mx3 mx3Var;
        Object objMo279s2;
        Closeable closeable;
        Closeable closeable2;
        Exception exc;
        mx3 mx3Var2;
        mi5 mi5Var;
        gx2 gx2Var;
        ?? r6;
        mi5 j11Var;
        mx3 mx3Var3;
        ?? r7;
        gx2 gx2Var2;
        mx3 mx3Var4;
        C0348tu c0348tu;
        ?? r8;
        Exception exc2;
        mi5 mi5Var2;
        gx2 gx2Var3;
        gx2 gx2Var4;
        mi5 j11Var2;
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        gx2 gx2Var5;
        C0348tu c0348tu2;
        ?? r14;
        mx3 mx3Var5;
        mx3 mx3Var6;
        mx3 mx3Var7;
        mx3 mx3Var8;
        ?? M655a = 2;
        ?? r15 = 2;
        ?? r16 = 1;
        ?? r17 = 1;
        pm1 pm1Var = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        switch (this.f30383t) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                byte b = this.f30385v;
                try {
                    if (b == 0) {
                        k43.m7376J(obj);
                        Context context = (Context) this.f30382A;
                        mq1Var = (mq1) this.f30387x;
                        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(0);
                        C1260vl c1260vl = new C1260vl((Object) context, (wm0) (z ? 1 : 0), (byte) 1);
                        this.f30386w = mq1Var;
                        this.f30385v = (byte) 1;
                        dg4 dg4Var = fp0.f19212a;
                        objM13685q = zp0.m13685q(new ep0(((Number) fp0.f19212a.getValue()).intValue(), installedApplications, r71.f29063a, c1260vl, null), this);
                        if (objM13685q == ap0Var) {
                        }
                        return ap0Var;
                    }
                    if (b == 1) {
                        mq1 mq1Var3 = (mq1) this.f30386w;
                        k43.m7376J(obj);
                        mq1Var = mq1Var3;
                        objM13685q = obj;
                    } else {
                        if (b != 2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        next = this.f30384u;
                        it = (Iterator) this.f30389z;
                        arrayList = (Collection) this.f30388y;
                        mq1Var2 = (mq1) this.f30386w;
                        k43.m7376J(obj);
                        objInvoke = obj;
                    }
                    if (((Boolean) objInvoke).booleanValue()) {
                        arrayList.add(next);
                    }
                    if (it.hasNext()) {
                        List listM6315a1 = hb0.m6315a1((List) arrayList, new vl1((byte) 9));
                        ke4 ke4Var = new ke4();
                        ke4Var.f23085a = listM6315a1;
                        VarHandle.storeStoreFence();
                        return ke4Var;
                    }
                    next = it.next();
                    this.f30386w = mq1Var2;
                    this.f30388y = arrayList;
                    this.f30389z = it;
                    this.f30384u = next;
                    this.f30385v = (byte) 2;
                    objInvoke = mq1Var2.invoke((C0766im) next, this);
                    break;
                    arrayList = new ArrayList();
                    mq1Var2 = mq1Var;
                    it = ((Iterable) objM13685q).iterator();
                    if (it.hasNext()) {
                        List listM6315a2 = hb0.m6315a1((List) arrayList, new vl1((byte) 9));
                        ke4 ke4Var2 = new ke4();
                        ke4Var2.f23085a = listM6315a2;
                        VarHandle.storeStoreFence();
                        return ke4Var2;
                    }
                    next = it.next();
                    this.f30386w = mq1Var2;
                    this.f30388y = arrayList;
                    this.f30389z = it;
                    this.f30384u = next;
                    this.f30385v = (byte) 2;
                    objInvoke = mq1Var2.invoke((C0766im) next, this);
                } catch (Throwable th) {
                    sc6.m10643O(th);
                    ca1 ca1Var = new ca1();
                    ca1Var.f15903a = th;
                    VarHandle.storeStoreFence();
                    return ca1Var;
                }
                break;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                int i = 6;
                try {
                    try {
                        switch (this.f30385v) {
                            case 0:
                                k43.m7376J(obj);
                                AbstractC0054bv abstractC0054bv3 = (AbstractC0054bv) this.f30382A;
                                xa3 xa3Var = abstractC0054bv3.f1498e;
                                s21 s21Var = s21.f11046Q0;
                                v71 v71Var = v71.f32439a;
                                fy3 fy3Var = new fy3(new e33(), new aq1(), new d63(), new C0217lc());
                                if (cy3.m656b().f1710a == null) {
                                    kx2 kx2VarM2635a = xa3.m2635a(xa3Var, s21Var, v71Var, fy3Var);
                                    try {
                                        cy3.m653a().mo1538e().f5885t = new ym3(abstractC0054bv3.mo278d(), i);
                                        try {
                                            this.f30386w = abstractC0054bv3;
                                            this.f30387x = kx2VarM2635a;
                                            this.f30388y = kx2VarM2635a;
                                            this.f30385v = (byte) 1;
                                            objMo279s2 = abstractC0054bv3.mo279s(this);
                                            if (objMo279s2 != ap0Var2) {
                                                abstractC0054bv2 = abstractC0054bv3;
                                                closeable = kx2VarM2635a;
                                                mx3Var2 = kx2VarM2635a;
                                                try {
                                                    mi5Var = (mi5) objMo279s2;
                                                    gx2Var = abstractC0054bv2.f1501h;
                                                    this.f30386w = abstractC0054bv2;
                                                    this.f30387x = mx3Var2;
                                                    this.f30388y = closeable;
                                                    this.f30384u = mi5Var;
                                                    this.f30389z = gx2Var;
                                                    this.f30385v = (byte) 2;
                                                    if (gx2Var.m6191e(this) != ap0Var2) {
                                                        r6 = closeable;
                                                        j11Var = mi5Var;
                                                        mx3Var4 = mx3Var2;
                                                        try {
                                                            if (j11Var instanceof q11) {
                                                                t85 t85Var = (t85) ((q11) j11Var).f8791b;
                                                                gd5 gd5Var = abstractC0054bv2.f1496c;
                                                                r50 r50Var = i41.f21117b;
                                                                c0348tu = new C0348tu(t85Var, gd5Var, i41.m6652k(as4.m3239R(SystemClock.elapsedRealtime(), m41.MILLISECONDS), abstractC0054bv2.m527i().f2644a));
                                                            } else if (abstractC0054bv2.m527i().f2647d) {
                                                                c0348tu = abstractC0054bv2.f1502i;
                                                            } else {
                                                                c0348tu = null;
                                                            }
                                                            abstractC0054bv2.f1502i = c0348tu;
                                                            abstractC0054bv2.f1503j = null;
                                                            abstractC0054bv2.m525b(true);
                                                            gx2Var.m6193g(null);
                                                            r8 = r6;
                                                            if (j11Var instanceof i11) {
                                                                sy3.m2306a((i11) j11Var, false);
                                                            }
                                                            lb5.m7941v(r8, null);
                                                            return j11Var;
                                                        } catch (Throwable th2) {
                                                            gx2Var.m6193g(null);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Exception e) {
                                                    e = e;
                                                    r15 = closeable;
                                                    exc = e;
                                                    mx3Var3 = mx3Var2;
                                                    r7 = r15;
                                                    gx2Var2 = abstractC0054bv2.f1501h;
                                                    this.f30386w = abstractC0054bv2;
                                                    this.f30387x = mx3Var3;
                                                    this.f30388y = r7;
                                                    this.f30384u = exc;
                                                    this.f30389z = gx2Var2;
                                                    this.f30385v = (byte) 3;
                                                    r15 = r7;
                                                    r17 = mx3Var3;
                                                    break;
                                                }
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            abstractC0054bv2 = abstractC0054bv3;
                                            kx2 kx2Var = kx2VarM2635a;
                                            mx3Var = kx2Var;
                                            closeable2 = kx2Var;
                                            exc = e;
                                            r7 = closeable2;
                                            mx3Var3 = mx3Var;
                                            gx2Var2 = abstractC0054bv2.f1501h;
                                            this.f30386w = abstractC0054bv2;
                                            this.f30387x = mx3Var3;
                                            this.f30388y = r7;
                                            this.f30384u = exc;
                                            this.f30389z = gx2Var2;
                                            this.f30385v = (byte) 3;
                                            r15 = r7;
                                            r17 = mx3Var3;
                                            break;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r3 = kx2VarM2635a;
                                        r9 = kx2VarM2635a;
                                        try {
                                            r9.m1736b(th);
                                            if (th instanceof ka5) {
                                                throw th;
                                            }
                                            if (!(th instanceof zm4)) {
                                                r9.m1735a(th);
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
                                        } catch (Throwable th4) {
                                            try {
                                                throw th4;
                                            } catch (Throwable th5) {
                                                lb5.m7941v(r3, th4);
                                                throw th5;
                                            }
                                        }
                                    }
                                } else {
                                    M655a = cy3.m655a(s21Var, v71Var, true);
                                    try {
                                        cy3.m653a().mo1538e().f5885t = new ym3(abstractC0054bv3.mo278d(), 6);
                                        try {
                                            this.f30386w = abstractC0054bv3;
                                            this.f30387x = M655a;
                                            this.f30388y = M655a;
                                            this.f30385v = (byte) 4;
                                            objMo279s = abstractC0054bv3.mo279s(this);
                                            if (objMo279s != ap0Var2) {
                                                abstractC0054bv = abstractC0054bv3;
                                                r5 = M655a;
                                                M655a = M655a;
                                                try {
                                                    mi5Var2 = (mi5) objMo279s;
                                                    gx2Var3 = abstractC0054bv.f1501h;
                                                    this.f30386w = abstractC0054bv;
                                                    this.f30387x = r5;
                                                    this.f30388y = M655a;
                                                    this.f30384u = mi5Var2;
                                                    this.f30389z = gx2Var3;
                                                    this.f30385v = (byte) 5;
                                                    if (gx2Var3.m6191e(this) != ap0Var2) {
                                                        gx2Var4 = gx2Var3;
                                                        j11Var2 = mi5Var2;
                                                        r10 = r5;
                                                        r11 = M655a;
                                                        try {
                                                            if (j11Var2 instanceof q11) {
                                                                t85 t85Var2 = (t85) ((q11) j11Var2).f8791b;
                                                                gd5 gd5Var2 = abstractC0054bv.f1496c;
                                                                r50 r50Var2 = i41.f21117b;
                                                                c0348tu2 = new C0348tu(t85Var2, gd5Var2, i41.m6652k(as4.m3239R(SystemClock.elapsedRealtime(), m41.MILLISECONDS), abstractC0054bv.m527i().f2644a));
                                                            } else if (abstractC0054bv.m527i().f2647d) {
                                                                c0348tu2 = abstractC0054bv.f1502i;
                                                            } else {
                                                                c0348tu2 = null;
                                                            }
                                                            abstractC0054bv.f1502i = c0348tu2;
                                                            abstractC0054bv.f1503j = null;
                                                            abstractC0054bv.m525b(true);
                                                            gx2Var4.m6193g(null);
                                                            r14 = r11;
                                                            if (j11Var2 instanceof i11) {
                                                                sy3.m2306a((i11) j11Var2, false);
                                                            }
                                                            lb5.m7941v(r14, null);
                                                            return j11Var2;
                                                        } catch (Throwable th6) {
                                                            gx2Var4.m6193g(null);
                                                            throw th6;
                                                        }
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    exc2 = e;
                                                    r13 = M655a;
                                                    r12 = r5;
                                                    gx2Var5 = abstractC0054bv.f1501h;
                                                    this.f30386w = abstractC0054bv;
                                                    this.f30387x = r12;
                                                    this.f30388y = r13;
                                                    this.f30384u = exc2;
                                                    this.f30389z = gx2Var5;
                                                    this.f30385v = (byte) 6;
                                                    M655a = r13;
                                                    r16 = r12;
                                                    break;
                                                }
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            abstractC0054bv = abstractC0054bv3;
                                            r5 = M655a;
                                            exc2 = e;
                                            r13 = M655a;
                                            r12 = r5;
                                            gx2Var5 = abstractC0054bv.f1501h;
                                            this.f30386w = abstractC0054bv;
                                            this.f30387x = r12;
                                            this.f30388y = r13;
                                            this.f30384u = exc2;
                                            this.f30389z = gx2Var5;
                                            this.f30385v = (byte) 6;
                                            M655a = r13;
                                            r16 = r12;
                                            break;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        r1 = M655a;
                                        r4 = M655a;
                                        try {
                                            r4.m1736b(th);
                                            if (th instanceof ka5) {
                                                throw th;
                                            }
                                            if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                                                r4.m1735a(th);
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
                                        } catch (Throwable th8) {
                                            try {
                                                throw th8;
                                            } catch (Throwable th9) {
                                                lb5.m7941v(r1, th8);
                                                throw th9;
                                            }
                                        }
                                    }
                                }
                                return ap0Var2;
                            case 1:
                                closeable = (Closeable) this.f30388y;
                                mx3Var2 = (mx3) this.f30387x;
                                abstractC0054bv2 = (AbstractC0054bv) this.f30386w;
                                try {
                                    try {
                                        k43.m7376J(obj);
                                        objMo279s2 = obj;
                                        closeable = closeable;
                                        mx3Var2 = mx3Var2;
                                        mi5Var = (mi5) objMo279s2;
                                        gx2Var = abstractC0054bv2.f1501h;
                                        this.f30386w = abstractC0054bv2;
                                        this.f30387x = mx3Var2;
                                        this.f30388y = closeable;
                                        this.f30384u = mi5Var;
                                        this.f30389z = gx2Var;
                                        this.f30385v = (byte) 2;
                                        if (gx2Var.m6191e(this) != ap0Var2) {
                                            r6 = closeable;
                                            j11Var = mi5Var;
                                            mx3Var4 = mx3Var2;
                                            if (j11Var instanceof q11) {
                                                t85 t85Var3 = (t85) ((q11) j11Var).f8791b;
                                                gd5 gd5Var3 = abstractC0054bv2.f1496c;
                                                r50 r50Var3 = i41.f21117b;
                                                c0348tu = new C0348tu(t85Var3, gd5Var3, i41.m6652k(as4.m3239R(SystemClock.elapsedRealtime(), m41.MILLISECONDS), abstractC0054bv2.m527i().f2644a));
                                            } else if (abstractC0054bv2.m527i().f2647d) {
                                                c0348tu = abstractC0054bv2.f1502i;
                                            } else {
                                                c0348tu = null;
                                            }
                                            abstractC0054bv2.f1502i = c0348tu;
                                            abstractC0054bv2.f1503j = null;
                                            abstractC0054bv2.m525b(true);
                                            gx2Var.m6193g(null);
                                            r8 = r6;
                                            if (j11Var instanceof i11) {
                                                sy3.m2306a((i11) j11Var, false);
                                            }
                                            lb5.m7941v(r8, null);
                                            return j11Var;
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        closeable2 = closeable;
                                        mx3Var = mx3Var2;
                                        exc = e;
                                        r7 = closeable2;
                                        mx3Var3 = mx3Var;
                                        gx2Var2 = abstractC0054bv2.f1501h;
                                        this.f30386w = abstractC0054bv2;
                                        this.f30387x = mx3Var3;
                                        this.f30388y = r7;
                                        this.f30384u = exc;
                                        this.f30389z = gx2Var2;
                                        this.f30385v = (byte) 3;
                                        r15 = r7;
                                        r17 = mx3Var3;
                                        break;
                                    }
                                    return ap0Var2;
                                } catch (Throwable th10) {
                                    th = th10;
                                    r15 = closeable;
                                    r17 = mx3Var2;
                                    r9 = r17;
                                    r3 = r15;
                                    r9.m1736b(th);
                                    if (th instanceof ka5) {
                                        throw th;
                                    }
                                    if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                                        r9.m1735a(th);
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
                            case 2:
                                gx2 gx2Var6 = (gx2) this.f30389z;
                                j11Var = (mi5) this.f30384u;
                                r15 = (Closeable) this.f30388y;
                                mx3Var2 = (mx3) this.f30387x;
                                abstractC0054bv2 = (AbstractC0054bv) this.f30386w;
                                try {
                                    k43.m7376J(obj);
                                    gx2Var = gx2Var6;
                                    r6 = r15;
                                    mx3Var4 = mx3Var2;
                                    if (j11Var instanceof q11) {
                                        t85 t85Var4 = (t85) ((q11) j11Var).f8791b;
                                        gd5 gd5Var4 = abstractC0054bv2.f1496c;
                                        r50 r50Var4 = i41.f21117b;
                                        c0348tu = new C0348tu(t85Var4, gd5Var4, i41.m6652k(as4.m3239R(SystemClock.elapsedRealtime(), m41.MILLISECONDS), abstractC0054bv2.m527i().f2644a));
                                    } else if (abstractC0054bv2.m527i().f2647d) {
                                        c0348tu = abstractC0054bv2.f1502i;
                                    } else {
                                        c0348tu = null;
                                    }
                                    abstractC0054bv2.f1502i = c0348tu;
                                    abstractC0054bv2.f1503j = null;
                                    abstractC0054bv2.m525b(true);
                                    gx2Var.m6193g(null);
                                    r8 = r6;
                                } catch (Exception e6) {
                                    e = e6;
                                    exc = e;
                                    mx3Var3 = mx3Var2;
                                    r7 = r15;
                                    gx2Var2 = abstractC0054bv2.f1501h;
                                    this.f30386w = abstractC0054bv2;
                                    this.f30387x = mx3Var3;
                                    this.f30388y = r7;
                                    this.f30384u = exc;
                                    this.f30389z = gx2Var2;
                                    this.f30385v = (byte) 3;
                                    r15 = r7;
                                    r17 = mx3Var3;
                                    break;
                                } catch (Throwable th11) {
                                    th = th11;
                                    r17 = mx3Var2;
                                    r9 = r17;
                                    r3 = r15;
                                    r9.m1736b(th);
                                    if (th instanceof ka5) {
                                        throw th;
                                    }
                                    if (!(th instanceof zm4)) {
                                        r9.m1735a(th);
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
                                if (j11Var instanceof i11) {
                                    sy3.m2306a((i11) j11Var, false);
                                }
                                lb5.m7941v(r8, null);
                                return j11Var;
                            case 3:
                                gx2Var2 = (gx2) this.f30389z;
                                exc = (Exception) this.f30384u;
                                Closeable closeable3 = (Closeable) this.f30388y;
                                mx3 mx3Var9 = (mx3) this.f30387x;
                                AbstractC0054bv abstractC0054bv4 = (AbstractC0054bv) this.f30386w;
                                k43.m7376J(obj);
                                abstractC0054bv2 = abstractC0054bv4;
                                r15 = closeable3;
                                r17 = mx3Var9;
                                gx2 gx2Var7 = gx2Var2;
                                try {
                                    abstractC0054bv2.f1503j = null;
                                    gx2Var7.m6193g(null);
                                    mx3 mx3VarM653a = cy3.m653a();
                                    mx3VarM653a.mo1538e().f5878m = false;
                                    mx3VarM653a.m1735a(exc);
                                    j11Var = new j11(exc, z3 ? 1 : 0, z2 ? 1 : 0, 6);
                                    r8 = r15;
                                    if (j11Var instanceof i11) {
                                        sy3.m2306a((i11) j11Var, false);
                                    }
                                    lb5.m7941v(r8, null);
                                    return j11Var;
                                } catch (Throwable th12) {
                                    gx2Var7.m6193g(null);
                                    throw th12;
                                }
                            case 4:
                                M655a = (Closeable) this.f30388y;
                                mx3 mx3Var10 = (mx3) this.f30387x;
                                AbstractC0054bv abstractC0054bv5 = (AbstractC0054bv) this.f30386w;
                                try {
                                    k43.m7376J(obj);
                                    objMo279s = obj;
                                    r5 = mx3Var10;
                                    abstractC0054bv = abstractC0054bv5;
                                    M655a = M655a;
                                    mi5Var2 = (mi5) objMo279s;
                                    gx2Var3 = abstractC0054bv.f1501h;
                                    this.f30386w = abstractC0054bv;
                                    this.f30387x = r5;
                                    this.f30388y = M655a;
                                    this.f30384u = mi5Var2;
                                    this.f30389z = gx2Var3;
                                    this.f30385v = (byte) 5;
                                    if (gx2Var3.m6191e(this) != ap0Var2) {
                                        gx2Var4 = gx2Var3;
                                        j11Var2 = mi5Var2;
                                        r10 = r5;
                                        r11 = M655a;
                                        if (j11Var2 instanceof q11) {
                                            t85 t85Var5 = (t85) ((q11) j11Var2).f8791b;
                                            gd5 gd5Var5 = abstractC0054bv.f1496c;
                                            r50 r50Var5 = i41.f21117b;
                                            c0348tu2 = new C0348tu(t85Var5, gd5Var5, i41.m6652k(as4.m3239R(SystemClock.elapsedRealtime(), m41.MILLISECONDS), abstractC0054bv.m527i().f2644a));
                                        } else if (abstractC0054bv.m527i().f2647d) {
                                            c0348tu2 = abstractC0054bv.f1502i;
                                        } else {
                                            c0348tu2 = null;
                                        }
                                        abstractC0054bv.f1502i = c0348tu2;
                                        abstractC0054bv.f1503j = null;
                                        abstractC0054bv.m525b(true);
                                        gx2Var4.m6193g(null);
                                        r14 = r11;
                                        if (j11Var2 instanceof i11) {
                                            sy3.m2306a((i11) j11Var2, false);
                                        }
                                        lb5.m7941v(r14, null);
                                        return j11Var2;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    r5 = mx3Var10;
                                    abstractC0054bv = abstractC0054bv5;
                                    exc2 = e;
                                    r13 = M655a;
                                    r12 = r5;
                                    gx2Var5 = abstractC0054bv.f1501h;
                                    this.f30386w = abstractC0054bv;
                                    this.f30387x = r12;
                                    this.f30388y = r13;
                                    this.f30384u = exc2;
                                    this.f30389z = gx2Var5;
                                    this.f30385v = (byte) 6;
                                    M655a = r13;
                                    r16 = r12;
                                    break;
                                } catch (Throwable th13) {
                                    th = th13;
                                    r16 = mx3Var10;
                                    r1 = M655a;
                                    r4 = r16;
                                    r4.m1736b(th);
                                    if (th instanceof ka5) {
                                        throw th;
                                    }
                                    if (!(th instanceof zm4)) {
                                        r4.m1735a(th);
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
                                return ap0Var2;
                            case 5:
                                gx2 gx2Var8 = (gx2) this.f30389z;
                                mi5 mi5Var3 = (mi5) this.f30384u;
                                r11 = (Closeable) this.f30388y;
                                r10 = (mx3) this.f30387x;
                                abstractC0054bv = (AbstractC0054bv) this.f30386w;
                                try {
                                    k43.m7376J(obj);
                                    gx2Var4 = gx2Var8;
                                    j11Var2 = mi5Var3;
                                    r11 = r11;
                                    r10 = r10;
                                    if (j11Var2 instanceof q11) {
                                        t85 t85Var6 = (t85) ((q11) j11Var2).f8791b;
                                        gd5 gd5Var6 = abstractC0054bv.f1496c;
                                        r50 r50Var6 = i41.f21117b;
                                        c0348tu2 = new C0348tu(t85Var6, gd5Var6, i41.m6652k(as4.m3239R(SystemClock.elapsedRealtime(), m41.MILLISECONDS), abstractC0054bv.m527i().f2644a));
                                    } else if (abstractC0054bv.m527i().f2647d) {
                                        c0348tu2 = abstractC0054bv.f1502i;
                                    } else {
                                        c0348tu2 = null;
                                    }
                                    abstractC0054bv.f1502i = c0348tu2;
                                    abstractC0054bv.f1503j = null;
                                    abstractC0054bv.m525b(true);
                                    gx2Var4.m6193g(null);
                                    r14 = r11;
                                } catch (Exception e8) {
                                    exc2 = e8;
                                    r12 = r10;
                                    r13 = r11;
                                    gx2Var5 = abstractC0054bv.f1501h;
                                    this.f30386w = abstractC0054bv;
                                    this.f30387x = r12;
                                    this.f30388y = r13;
                                    this.f30384u = exc2;
                                    this.f30389z = gx2Var5;
                                    this.f30385v = (byte) 6;
                                    M655a = r13;
                                    r16 = r12;
                                    break;
                                } catch (Throwable th14) {
                                    th = th14;
                                    r1 = r11;
                                    r4 = r10;
                                    r4.m1736b(th);
                                    if (th instanceof ka5) {
                                        throw th;
                                    }
                                    if (!(th instanceof zm4)) {
                                        r4.m1735a(th);
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
                                if (j11Var2 instanceof i11) {
                                    sy3.m2306a((i11) j11Var2, false);
                                }
                                lb5.m7941v(r14, null);
                                return j11Var2;
                            case 6:
                                gx2Var5 = (gx2) this.f30389z;
                                exc2 = (Exception) this.f30384u;
                                Closeable closeable4 = (Closeable) this.f30388y;
                                mx3 mx3Var11 = (mx3) this.f30387x;
                                AbstractC0054bv abstractC0054bv6 = (AbstractC0054bv) this.f30386w;
                                k43.m7376J(obj);
                                abstractC0054bv = abstractC0054bv6;
                                M655a = closeable4;
                                r16 = mx3Var11;
                                gx2 gx2Var9 = gx2Var5;
                                try {
                                    abstractC0054bv.f1503j = null;
                                    gx2Var9.m6193g(null);
                                    mx3 mx3VarM653a2 = cy3.m653a();
                                    mx3VarM653a2.mo1538e().f5878m = false;
                                    mx3VarM653a2.m1735a(exc2);
                                    j11Var2 = new j11(exc2, pm1Var, z4 ? 1 : 0, 6);
                                    r14 = M655a;
                                    if (j11Var2 instanceof i11) {
                                        sy3.m2306a((i11) j11Var2, false);
                                    }
                                    lb5.m7941v(r14, null);
                                    return j11Var2;
                                } catch (Throwable th15) {
                                    gx2Var9.m6193g(null);
                                    throw th15;
                                }
                            default:
                                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    } catch (Throwable th16) {
                        th = th16;
                    }
                } catch (Throwable th17) {
                    th = th17;
                }
                break;
            default:
                ju4 ju4Var = ju4.f22634a;
                ap0 ap0Var3 = ap0.f14763a;
                byte b2 = this.f30385v;
                if (b2 == 0) {
                    k43.m7376J(obj);
                    gu1 gu1Var = (gu1) this.f30389z;
                    xa3 xa3Var2 = gu1Var.f4125a;
                    s21 s21Var2 = s21.f11049R0;
                    v71 v71Var2 = v71.f32439a;
                    fy3 fy3Var2 = gu1Var.f4126b;
                    jg5 jg5Var = (jg5) this.f30384u;
                    mq1 mq1Var4 = (mq1) this.f30386w;
                    Uri uri = (Uri) this.f30382A;
                    if (cy3.m656b().f1710a == null) {
                        kx2 kx2VarM2635a2 = xa3.m2635a(xa3Var2, s21Var2, v71Var2, fy3Var2);
                        try {
                            cy3.m653a().mo1538e().f5877l = jg5Var.mo271j();
                            Map mapM1920d = gu1Var.f4127c.m1920d(uri);
                            this.f30387x = kx2VarM2635a2;
                            this.f30388y = kx2VarM2635a2;
                            this.f30385v = (byte) 1;
                            if (mq1Var4.invoke(mapM1920d, this) != ap0Var3) {
                                mx3Var8 = kx2VarM2635a2;
                                lb5.m7941v(mx3Var8, null);
                            }
                        } catch (Throwable th18) {
                            th = th18;
                            mx3Var7 = kx2VarM2635a2;
                            mx3Var8 = mx3Var7;
                            mx3Var7.m1736b(th);
                            if (!(th instanceof ka5)) {
                                throw th;
                            }
                            if (!(th instanceof zm4)) {
                                mx3Var7.m1735a(th);
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
                        mx3 mx3VarM655a = cy3.m655a(s21Var2, v71Var2, true);
                        try {
                            cy3.m653a().mo1538e().f5877l = jg5Var.mo271j();
                            Map mapM1920d2 = gu1Var.f4127c.m1920d(uri);
                            this.f30387x = mx3VarM655a;
                            this.f30388y = mx3VarM655a;
                            this.f30385v = (byte) 2;
                            if (mq1Var4.invoke(mapM1920d2, this) != ap0Var3) {
                                mx3Var6 = mx3VarM655a;
                                lb5.m7941v(mx3Var6, null);
                            }
                        } catch (Throwable th19) {
                            th = th19;
                            mx3Var5 = mx3VarM655a;
                            mx3Var6 = mx3Var5;
                            mx3Var5.m1736b(th);
                            if (!(th instanceof ka5)) {
                                throw th;
                            }
                            if (!(th instanceof zm4)) {
                                mx3Var5.m1735a(th);
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
                    return ap0Var3;
                }
                if (b2 == 1) {
                    mx3Var8 = (mx3) this.f30388y;
                    mx3Var7 = (mx3) this.f30387x;
                    try {
                        k43.m7376J(obj);
                        lb5.m7941v(mx3Var8, null);
                    } catch (Throwable th20) {
                        th = th20;
                        try {
                            mx3Var7.m1736b(th);
                            if (!(th instanceof ka5)) {
                                throw th;
                            }
                            if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                                mx3Var7.m1735a(th);
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
                        } catch (Throwable th21) {
                            try {
                                throw th21;
                            } catch (Throwable th22) {
                                lb5.m7941v(mx3Var8, th21);
                                throw th22;
                            }
                        }
                    }
                } else {
                    if (b2 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mx3Var6 = (mx3) this.f30388y;
                    mx3Var5 = (mx3) this.f30387x;
                    try {
                        k43.m7376J(obj);
                        lb5.m7941v(mx3Var6, null);
                    } catch (Throwable th23) {
                        th = th23;
                        try {
                            mx3Var5.m1736b(th);
                            if (!(th instanceof ka5)) {
                                throw th;
                            }
                            if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                                mx3Var5.m1735a(th);
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
                        } catch (Throwable th24) {
                            try {
                                throw th24;
                            } catch (Throwable th25) {
                                lb5.m7941v(mx3Var6, th24);
                                throw th25;
                            }
                        }
                    }
                }
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1150sm(AbstractC0054bv abstractC0054bv, wm0 wm0Var) {
        super(1, wm0Var);
        this.f30382A = abstractC0054bv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1150sm(Context context, mq1 mq1Var, wm0 wm0Var) {
        super(1, wm0Var);
        this.f30382A = context;
        this.f30387x = mq1Var;
    }
}
