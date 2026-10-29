package p000;

import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import org.chromium.net.C0995R;

/* JADX INFO: renamed from: vc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1251vc extends ar3 {

    /* JADX INFO: renamed from: j */
    public /* synthetic */ ViewOnAttachStateChangeListenerC1400zc f32516j;

    /* JADX WARN: Code duplicated, block: B:103:0x0237  */
    /* JADX WARN: Code duplicated, block: B:106:0x023c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0251  */
    /* JADX WARN: Code duplicated, block: B:112:0x025b  */
    /* JADX WARN: Code duplicated, block: B:115:0x026a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0284  */
    /* JADX WARN: Code duplicated, block: B:119:0x028d  */
    /* JADX WARN: Code duplicated, block: B:122:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:134:0x0314 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x0316  */
    /* JADX WARN: Code duplicated, block: B:136:0x0319  */
    /* JADX WARN: Code duplicated, block: B:138:0x031d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0320  */
    /* JADX WARN: Code duplicated, block: B:142:0x032b  */
    /* JADX WARN: Code duplicated, block: B:144:0x032e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0332  */
    /* JADX WARN: Code duplicated, block: B:147:0x0334  */
    /* JADX WARN: Code duplicated, block: B:149:0x0337 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x033b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x033d  */
    /* JADX WARN: Code duplicated, block: B:153:0x033f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x0341  */
    /* JADX WARN: Code duplicated, block: B:155:0x0343  */
    /* JADX WARN: Code duplicated, block: B:158:0x034e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0354  */
    /* JADX WARN: Code duplicated, block: B:163:0x0360  */
    /* JADX WARN: Code duplicated, block: B:165:0x036a  */
    /* JADX WARN: Code duplicated, block: B:168:0x037b  */
    /* JADX WARN: Code duplicated, block: B:171:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:174:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:176:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:185:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:187:0x040b A[LOOP:3: B:184:0x03f7->B:187:0x040b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x0428  */
    /* JADX WARN: Code duplicated, block: B:194:0x043b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0459  */
    /* JADX WARN: Code duplicated, block: B:203:0x0464  */
    /* JADX WARN: Code duplicated, block: B:205:0x047c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0496  */
    /* JADX WARN: Code duplicated, block: B:211:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:219:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:221:0x04df  */
    /* JADX WARN: Code duplicated, block: B:223:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:225:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:227:0x0509  */
    /* JADX WARN: Code duplicated, block: B:229:0x0513  */
    /* JADX WARN: Code duplicated, block: B:231:0x0528  */
    /* JADX WARN: Code duplicated, block: B:234:0x0536  */
    /* JADX WARN: Code duplicated, block: B:237:0x0559  */
    /* JADX WARN: Code duplicated, block: B:239:0x0563  */
    /* JADX WARN: Code duplicated, block: B:243:0x0588  */
    /* JADX WARN: Code duplicated, block: B:245:0x058c  */
    /* JADX WARN: Code duplicated, block: B:246:0x0593  */
    /* JADX WARN: Code duplicated, block: B:248:0x0597  */
    /* JADX WARN: Code duplicated, block: B:251:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:253:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:254:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:256:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:258:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:263:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:265:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:266:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:270:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:272:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:275:0x060d A[LOOP:8: B:271:0x05f4->B:275:0x060d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:278:0x0615  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:281:0x0622  */
    /* JADX WARN: Code duplicated, block: B:282:0x0629  */
    /* JADX WARN: Code duplicated, block: B:285:0x0634  */
    /* JADX WARN: Code duplicated, block: B:288:0x063c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:290:0x0646  */
    /* JADX WARN: Code duplicated, block: B:291:0x064a  */
    /* JADX WARN: Code duplicated, block: B:294:0x0673  */
    /* JADX WARN: Code duplicated, block: B:295:0x0678  */
    /* JADX WARN: Code duplicated, block: B:298:0x0692  */
    /* JADX WARN: Code duplicated, block: B:300:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:302:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:303:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:306:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:307:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:310:0x06db  */
    /* JADX WARN: Code duplicated, block: B:311:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:314:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:317:0x0700  */
    /* JADX WARN: Code duplicated, block: B:320:0x070d  */
    /* JADX WARN: Code duplicated, block: B:323:0x0713 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:330:0x0720 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:334:0x0727  */
    /* JADX WARN: Code duplicated, block: B:337:0x0733  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:342:0x0755  */
    /* JADX WARN: Code duplicated, block: B:344:0x0761  */
    /* JADX WARN: Code duplicated, block: B:347:0x0777  */
    /* JADX WARN: Code duplicated, block: B:350:0x0789  */
    /* JADX WARN: Code duplicated, block: B:352:0x0793  */
    /* JADX WARN: Code duplicated, block: B:355:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:358:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:361:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:365:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:366:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:368:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:371:0x0809  */
    /* JADX WARN: Code duplicated, block: B:376:0x0828  */
    /* JADX WARN: Code duplicated, block: B:377:0x082b  */
    /* JADX WARN: Code duplicated, block: B:380:0x0856  */
    /* JADX WARN: Code duplicated, block: B:382:0x085c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:391:0x087d  */
    /* JADX WARN: Code duplicated, block: B:393:0x0883  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:401:0x089c  */
    /* JADX WARN: Code duplicated, block: B:403:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:405:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:407:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:410:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:413:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:421:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:424:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:427:0x091e  */
    /* JADX WARN: Code duplicated, block: B:429:0x092e  */
    /* JADX WARN: Code duplicated, block: B:430:0x0934  */
    /* JADX WARN: Code duplicated, block: B:433:0x093d  */
    /* JADX WARN: Code duplicated, block: B:436:0x094b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:440:0x0955  */
    /* JADX WARN: Code duplicated, block: B:441:0x0957  */
    /* JADX WARN: Code duplicated, block: B:444:0x095c  */
    /* JADX WARN: Code duplicated, block: B:447:0x0965  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:450:0x096a  */
    /* JADX WARN: Code duplicated, block: B:453:0x0975  */
    /* JADX WARN: Code duplicated, block: B:458:0x09a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:461:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:463:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:465:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:468:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:471:0x09e1  */
    /* JADX WARN: Code duplicated, block: B:474:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:476:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:478:0x0a00  */
    /* JADX WARN: Code duplicated, block: B:479:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:481:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:484:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:486:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:487:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:491:0x0a2e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:514:0x0a99  */
    /* JADX WARN: Code duplicated, block: B:517:0x0ab0  */
    /* JADX WARN: Code duplicated, block: B:519:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:522:0x0ad0  */
    /* JADX WARN: Code duplicated, block: B:525:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:528:0x0afa  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:530:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:532:0x0b20  */
    /* JADX WARN: Code duplicated, block: B:533:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:535:0x0b25  */
    /* JADX WARN: Code duplicated, block: B:537:0x0b37 A[LOOP:10: B:536:0x0b35->B:537:0x0b37, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:540:0x0b4f  */
    /* JADX WARN: Code duplicated, block: B:542:0x0b5f  */
    /* JADX WARN: Code duplicated, block: B:544:0x0b65  */
    /* JADX WARN: Code duplicated, block: B:546:0x0b7c  */
    /* JADX WARN: Code duplicated, block: B:549:0x0b83 A[LOOP:12: B:545:0x0b7a->B:549:0x0b83, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:552:0x0b8b  */
    /* JADX WARN: Code duplicated, block: B:556:0x0bae  */
    /* JADX WARN: Code duplicated, block: B:55:0x013d  */
    /* JADX WARN: Code duplicated, block: B:560:0x0bc3 A[LOOP:13: B:559:0x0bc1->B:560:0x0bc3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:561:0x0be0  */
    /* JADX WARN: Code duplicated, block: B:563:0x0bea A[LOOP:14: B:562:0x0be8->B:563:0x0bea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:565:0x0c10  */
    /* JADX WARN: Code duplicated, block: B:569:0x0c2e  */
    /* JADX WARN: Code duplicated, block: B:571:0x0c3a  */
    /* JADX WARN: Code duplicated, block: B:572:0x0c40  */
    /* JADX WARN: Code duplicated, block: B:574:0x0c4d  */
    /* JADX WARN: Code duplicated, block: B:577:0x0c58  */
    /* JADX WARN: Code duplicated, block: B:582:0x0c77  */
    /* JADX WARN: Code duplicated, block: B:58:0x014a  */
    /* JADX WARN: Code duplicated, block: B:593:0x0c8c  */
    /* JADX WARN: Code duplicated, block: B:597:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x041e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0152  */
    /* JADX WARN: Code duplicated, block: B:623:0x0602 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x0612 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x0898 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x0893 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x0b97 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x0b88 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x0b89 A[EDGE_INSN: B:636:0x0b89->B:551:0x0b89 BREAK  A[LOOP:12: B:545:0x0b7a->B:549:0x0b83], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x015a  */
    /* JADX WARN: Code duplicated, block: B:66:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0173  */
    /* JADX WARN: Code duplicated, block: B:70:0x0182  */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:73:0x0194  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:93:0x020a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x020c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0210  */
    /* JADX WARN: Instruction removed from duplicated block: B:593:0x0c8c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v80 */
    /* JADX WARN: Type inference failed for: r10v81 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r2v32, types: [v71] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r47v1 */
    /* JADX WARN: Type inference failed for: r47v2, types: [java.lang.Throwable, v3] */
    /* JADX WARN: Type inference failed for: r47v3 */
    /* JADX WARN: Type inference failed for: r47v4 */
    /* JADX WARN: Type inference failed for: r4v102, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v104 */
    /* JADX WARN: Type inference failed for: r4v110 */
    /* JADX WARN: Type inference failed for: r4v111 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v60, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v61, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v131 */
    /* JADX WARN: Type inference failed for: r5v132 */
    /* JADX WARN: Type inference failed for: r5v133 */
    /* JADX WARN: Type inference failed for: r5v71, types: [wf2] */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r5v73, types: [wf2] */
    /* JADX WARN: Type inference failed for: r5v81, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r7v82 */
    /* JADX WARN: Type inference failed for: r7v83, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r7v92 */
    /* JADX WARN: Type inference failed for: r8v24, types: [zc] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v56, types: [zc] */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r9v127 */
    /* JADX WARN: Type inference failed for: r9v128 */
    /* JADX WARN: Type inference failed for: r9v129 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: F */
    public final C1242v3 m11804F(int i) {
        ?? Obtain;
        C1242v3 c1242v3;
        int i2;
        ?? r47;
        Bundle extras;
        int i3;
        i14 i14VarM6550l;
        ?? r7;
        int iIntValue;
        Integer numValueOf;
        kv2 kv2Var;
        jv2 jv2Var;
        ra4 ra4Var;
        Resources resources;
        e14 e14Var;
        lw2 lw2Var;
        Object objM8132g;
        ?? r10;
        lq3 lq3Var;
        kv2 kv2Var2;
        ra4 ra4Var2;
        boolean zM4333g;
        List listM6548i;
        int size;
        boolean z;
        int i4;
        int i5;
        int i6;
        AccessibilityNodeInfo accessibilityNodeInfo;
        C0875lk c0875lkM11866y;
        ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc;
        i14 i14Var;
        lw2 lw2Var2;
        jv2 jv2Var2;
        lq3 lq3Var2;
        Resources resources2;
        ?? r6;
        ?? r0;
        C1242v3 c1242v4;
        p14 p14Var;
        lw2 lw2Var3;
        i14 i14Var2;
        ln4 ln4Var;
        Boolean bool;
        lq3 lq3Var3;
        int i7;
        List list;
        ?? r4;
        String str;
        boolean z2;
        int i8;
        Boolean bool2;
        Integer num;
        int iIntValue2;
        p14 p14Var2;
        ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc2;
        boolean z3;
        ?? r8;
        i14 i14VarM6550l2;
        boolean z4;
        C1353y2 c1353y2;
        C1353y2 c1353y3;
        C1353y2 c1353y4;
        String strM13470m;
        ArrayList arrayList;
        CharSequence charSequenceM11715d;
        bh3 bh3Var;
        ww3 ww3Var;
        ww3 ww3Var2;
        boolean z5;
        int iM7293d;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc;
        int iM7293d2;
        String str2;
        C1242v3 c1242v5;
        AbstractC0492bi abstractC0492biM13856T;
        AbstractC0492bi abstractC0492biM13856T2;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        C1353y2 c1353y5;
        C1353y2 c1353y6;
        C1353y2 c1353y7;
        p14 p14Var3;
        List list2;
        int size2;
        kv2 kv2Var3;
        int i9;
        ra4 ra4Var3;
        yv2 yv2VarM9357a;
        ra4 ra4Var4;
        boolean z6;
        int size3;
        int i10;
        yv2 yv2Var;
        kv2 kv2Var4;
        int[] iArr;
        int i11;
        int i12;
        ArrayList arrayList2;
        int size4;
        int i13;
        int size5;
        int i14;
        fs0 fs0Var;
        String str3;
        int iM13260d;
        int i15;
        int[] iArr2;
        int i16;
        int i17;
        int i18;
        ?? r9;
        Object objM8132g2;
        ?? r11;
        wf2 wf2Var;
        C1131s3 c1131s3;
        C1131s3 c1131s4;
        Object objM8132g3;
        ?? r12;
        C1353y2 c1353y8;
        float f;
        float f2;
        float f3;
        p14 p14Var4;
        float f4;
        C1353y2 c1353y9;
        ?? r13;
        List list3;
        ?? M12295v;
        e14 e14VarM12297x;
        boolean zM13387o;
        Object objM8132g4;
        ?? r5;
        e14 e14VarM12297x2;
        C1353y2 c1353y10;
        C1353y2 c1353y11;
        C1353y2 c1353y12;
        C1353y2 c1353y13;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        boolean z7;
        boolean z8;
        boolean zIsFocused;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        int iM7293d3;
        i14 i14VarM6550l3;
        boolean zBooleanValue;
        e14 e14Var2;
        p14 p14Var5;
        boolean zBooleanValue2;
        Object objM8132g5;
        ?? r1;
        ky0 density;
        tt2 tt2Var;
        SpannableString spannableString;
        List list4;
        ArrayList arrayList3;
        SpannableString spannableString2;
        ?? arrayList4;
        ?? arrayList5;
        int size6;
        int i19;
        ?? arrayList6;
        int size7;
        int i20;
        int size8;
        int i21;
        C0838kk c0838kk;
        int i22;
        Object obj;
        int i23;
        jl2 jl2Var;
        WeakHashMap weakHashMap;
        Object obj2;
        Object obj3;
        C0838kk c0838kk2;
        il2 il2Var;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        int size9;
        int i24;
        C0838kk c0838kk3;
        nv4 nv4Var;
        WeakHashMap weakHashMap3;
        Object uRLSpan2;
        int size10;
        int i25;
        C0838kk c0838kk4;
        nx4 nx4Var;
        int i26;
        int i27;
        int size11;
        int i28;
        C0838kk c0838kk5;
        int size12;
        int i29;
        int i30;
        int i31;
        long jMo5689a;
        xm1 xm1Var;
        tm1 tm1Var;
        zk4 zk4Var;
        long j;
        uj4 uj4Var;
        yk4 yk4Var;
        long jMo5689a2;
        SpannableString spannableString3;
        xm1 xm1Var2;
        int i32;
        boolean z9;
        boolean z10;
        int i33;
        int i34;
        int i35;
        i14 i14Var3;
        m52 m52VarM13491l;
        int i36;
        AbstractC0492bi abstractC0492bi;
        k14 k14Var;
        boolean zM13387o2;
        i14 i14Var4;
        ?? r14;
        byte b;
        byte b2;
        String strM13861Y;
        Object parentForAccessibility;
        ?? r15;
        ?? r16;
        ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc3 = this.f32516j;
        AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC1400zc3.f35954g;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc2 = viewOnAttachStateChangeListenerC1400zc3.f35951d;
        ii0 composeViewContext = viewTreeObserverOnGlobalLayoutListenerC1140sc2.getComposeViewContext();
        composeViewContext.m6809e();
        if (composeViewContext.f21437d.getLifecycle().mo6016b() == fk2.f19054a) {
            if (accessibilityManager.isEnabled()) {
                c1242v5 = null;
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                c1242v5 = new C1242v3();
                c1242v5.f32354b = -1;
                c1242v5.f32355c = -1;
                c1242v5.f32353a = accessibilityNodeInfoObtain;
                VarHandle.storeStoreFence();
            }
            r16 = viewOnAttachStateChangeListenerC1400zc3;
            i8 = i;
        } else {
            k14 k14Var2 = (k14) viewOnAttachStateChangeListenerC1400zc3.m13491l().m8197b(i);
            if (k14Var2 == null) {
                if (accessibilityManager.isEnabled()) {
                    c1242v5 = null;
                } else {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain();
                    c1242v5 = new C1242v3();
                    c1242v5.f32354b = -1;
                    c1242v5.f32355c = -1;
                    c1242v5.f32353a = accessibilityNodeInfoObtain2;
                    VarHandle.storeStoreFence();
                }
                r16 = viewOnAttachStateChangeListenerC1400zc3;
                i8 = i;
            } else {
                i14 i14Var5 = k14Var2.f22816a;
                e14 e14VarM6549k = i14Var5.m6549k();
                wf2 wf2Var2 = i14Var5.f21011c;
                Object objM8132g6 = e14VarM6549k.f17631a.m8132g(m14.f24566o);
                if (objM8132g6 == null) {
                    objM8132g6 = null;
                }
                boolean zM13387o3 = z62.m13387o(objM8132g6, Boolean.TRUE);
                if (!zM13387o3) {
                    Obtain = AccessibilityNodeInfo.obtain();
                    c1242v3 = new C1242v3();
                    c1242v3.f32354b = -1;
                    c1242v3.f32355c = -1;
                    c1242v3.f32353a = Obtain;
                    VarHandle.storeStoreFence();
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        AbstractC0561d3.m4335i(Obtain, zM13387o3);
                        r47 = 0;
                    } else {
                        r47 = 0;
                        r47 = 0;
                        extras = Obtain.getExtras();
                        if (extras != null) {
                            int i37 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65);
                            if (zM13387o3) {
                                i3 = 64;
                            } else {
                                i3 = 0;
                            }
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i37 | i3);
                        }
                    }
                    if (i == -1) {
                        parentForAccessibility = viewTreeObserverOnGlobalLayoutListenerC1140sc2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            r15 = (View) parentForAccessibility;
                        } else {
                            r15 = r47;
                        }
                        c1242v3.f32354b = -1;
                        Obtain.setParent(r15);
                    } else {
                        i14VarM6550l = i14Var5.m6550l();
                        if (i14VarM6550l != null) {
                            numValueOf = Integer.valueOf(i14VarM6550l.f21014f);
                        } else {
                            r7 = r47;
                        }
                        if (r7 != 0) {
                            r7 = numValueOf;
                            q32.m9722d("semanticsNode " + i + " has null parent");
                            xy4.m12794w();
                            return null;
                        }
                        iIntValue = r7.intValue();
                        if (iIntValue == viewTreeObserverOnGlobalLayoutListenerC1140sc2.getSemanticsOwner().m7810a().f21014f) {
                            r7 = numValueOf;
                            iIntValue = -1;
                        }
                        r7 = numValueOf;
                        c1242v3.f32354b = iIntValue;
                        Obtain.setParent(viewTreeObserverOnGlobalLayoutListenerC1140sc2, iIntValue);
                    }
                    c1242v3.f32355c = i;
                    Obtain.setSource(viewTreeObserverOnGlobalLayoutListenerC1140sc2, i);
                    Obtain.setBoundsInScreen(viewOnAttachStateChangeListenerC1400zc3.m13483d(k14Var2));
                    kv2Var = ViewOnAttachStateChangeListenerC1400zc.f35937N;
                    jv2Var = viewOnAttachStateChangeListenerC1400zc3.f35947J;
                    ra4Var = viewOnAttachStateChangeListenerC1400zc3.f35966s;
                    resources = viewTreeObserverOnGlobalLayoutListenerC1140sc2.getContext().getResources();
                    c1242v3.m11716e("android.view.View");
                    e14Var = i14Var5.f21012d;
                    lw2Var = e14Var.f17631a;
                    if (lw2Var.m8128c(m14.f24539F)) {
                        c1242v3.m11716e("android.widget.EditText");
                    }
                    if (lw2Var.m8128c(m14.f24535B)) {
                        c1242v3.m11716e("android.widget.TextView");
                    }
                    objM8132g = lw2Var.m8132g(m14.f24576y);
                    r10 = objM8132g;
                    if (objM8132g == null) {
                        r10 = r47;
                    }
                    lq3Var = (lq3) r10;
                    if (lq3Var != null) {
                        b = lq3Var.f24281a;
                        if (i14Var5.m6552n()) {
                            ra4Var2 = ra4Var;
                            b2 = 4;
                            kv2Var2 = kv2Var;
                            if (i14Var5.m6548i((4 & 1) != 0 ? !i14Var5.f21010b : false, (4 & 2) == 0).isEmpty()) {
                            }
                        } else {
                            ra4Var2 = ra4Var;
                            b2 = 4;
                            kv2Var2 = kv2Var;
                        }
                        if (b == b2) {
                            Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(C0995R.string.tab));
                        } else if (b == 2) {
                            Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(C0995R.string.switch_role));
                        } else {
                            strM13861Y = zy5.m13861Y(b);
                            if (b == 5 || vd6.m11821E(i14Var5) || e14Var.f17633c) {
                                c1242v3.m11716e(strM13861Y);
                            }
                        }
                    } else {
                        kv2Var2 = kv2Var;
                        ra4Var2 = ra4Var;
                    }
                    Obtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC1140sc2.getContext().getPackageName());
                    Obtain.setImportantForAccessibility(C0006a5.m88z(i14Var5));
                    if (i2 >= 34) {
                        zM4333g = AbstractC0561d3.m4333g(accessibilityManager);
                    } else {
                        zM4333g = true;
                    }
                    listM6548i = i14Var5.m6548i((4 & 1) != 0 ? !i14Var5.f21010b : false, (4 & 2) == 0);
                    size = listM6548i.size();
                    z = zM4333g;
                    i4 = 0;
                    i5 = 0;
                    while (i5 < size) {
                        List list5 = listM6548i;
                        i14Var3 = (i14) listM6548i.get(i5);
                        int i38 = size;
                        m52VarM13491l = viewOnAttachStateChangeListenerC1400zc3.m13491l();
                        int i39 = i5;
                        i36 = i14Var3.f21014f;
                        if (m52VarM13491l.m8196a(i36)) {
                            abstractC0492bi = viewTreeObserverOnGlobalLayoutListenerC1140sc2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(i14Var3.f21011c);
                            if (i36 != -1) {
                                if (abstractC0492bi != null) {
                                    Obtain.addChild(abstractC0492bi);
                                } else {
                                    k14Var = (k14) viewOnAttachStateChangeListenerC1400zc3.m13491l().m8197b(i36);
                                    if (k14Var != null || (i14Var4 = k14Var.f22816a) == null) {
                                        zM13387o2 = false;
                                    } else {
                                        Object objM8132g7 = i14Var4.m6549k().f17631a.m8132g(m14.f24566o);
                                        if (objM8132g7 == null) {
                                            r14 = objM8132g7;
                                            r14 = r47;
                                        }
                                        r14 = objM8132g7;
                                        zM13387o2 = z62.m13387o(r14, Boolean.TRUE);
                                    }
                                    if (z || !zM13387o2) {
                                        Obtain.addChild(viewTreeObserverOnGlobalLayoutListenerC1140sc2, i36);
                                    }
                                }
                                jv2Var.m7295f(i36, i4);
                                i4++;
                            }
                        }
                        i5 = i39 + 1;
                        size = i38;
                        listM6548i = list5;
                    }
                    i6 = viewOnAttachStateChangeListenerC1400zc3.f35958k;
                    accessibilityNodeInfo = c1242v3.f32353a;
                    if (i == i6) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        c1242v3.m11713a(C1131s3.f29845d);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        c1242v3.m11713a(C1131s3.f29844c);
                    }
                    c0875lkM11866y = vd6.m11866y(i14Var5);
                    if (c0875lkM11866y != null) {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc2.getFontFamilyResolver();
                        density = viewTreeObserverOnGlobalLayoutListenerC1140sc2.getDensity();
                        tt2Var = viewOnAttachStateChangeListenerC1400zc3.f35943F;
                        String str4 = c0875lkM11866y.f24092b;
                        list4 = c0875lkM11866y.f24091a;
                        spannableString = new SpannableString(str4);
                        arrayList3 = c0875lkM11866y.f24093c;
                        if (arrayList3 != null) {
                            size12 = arrayList3.size();
                            i29 = 0;
                            while (i29 < size12) {
                                ArrayList arrayList7 = arrayList3;
                                C0838kk c0838kk6 = (C0838kk) arrayList3.get(i29);
                                int i40 = size12;
                                pa4 pa4Var = (pa4) c0838kk6.f23186a;
                                int i41 = i29;
                                i30 = c0838kk6.f23187b;
                                i31 = c0838kk6.f23188c;
                                ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc4 = viewOnAttachStateChangeListenerC1400zc3;
                                jMo5689a = pa4Var.f27478a.mo5689a();
                                lq3 lq3Var4 = lq3Var;
                                Resources resources3 = resources;
                                long j2 = pa4Var.f27479b;
                                xm1Var = pa4Var.f27480c;
                                tm1Var = pa4Var.f27481d;
                                zk4Var = pa4Var.f27487j;
                                jv2 jv2Var3 = jv2Var;
                                zm2 zm2Var = pa4Var.f27488k;
                                i14 i14Var6 = i14Var5;
                                lw2 lw2Var4 = lw2Var;
                                j = pa4Var.f27489l;
                                uj4Var = pa4Var.f27490m;
                                yk4Var = pa4Var.f27478a;
                                ?? r17 = Obtain;
                                C1242v3 c1242v6 = c1242v3;
                                jMo5689a2 = yk4Var.mo5689a();
                                int i42 = pb0.f27502i;
                                if (!ws4.m12408a(jMo5689a, jMo5689a2)) {
                                    if (jMo5689a != 16) {
                                        fd0 fd0Var = new fd0();
                                        fd0Var.f18920a = jMo5689a;
                                        if (jMo5689a == 16) {
                                            Obtain = Obtain;
                                            r32.m10186a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
                                        }
                                        Obtain = Obtain;
                                        VarHandle.storeStoreFence();
                                        yk4Var = fd0Var;
                                    } else {
                                        Obtain = Obtain;
                                        yk4Var = ig1.f21365D;
                                    }
                                }
                                Obtain = Obtain;
                                C0006a5.m54J(spannableString, yk4Var.mo5689a(), i30, i31);
                                spannableString3 = spannableString;
                                C0006a5.m55K(spannableString3, j2, density, i30, i31);
                                if (xm1Var == null || tm1Var != null) {
                                    if (xm1Var == null) {
                                        xm1Var2 = xm1.f34413f;
                                    } else {
                                        xm1Var2 = xm1Var;
                                    }
                                    if (tm1Var != null) {
                                        i32 = tm1Var.f31237a;
                                    } else {
                                        i32 = 0;
                                    }
                                    if (xm1Var2.compareTo(xm1.f34411d) >= 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (i32 == 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10 && z9) {
                                        i33 = 3;
                                    } else if (z9) {
                                        i33 = 1;
                                    } else if (z10) {
                                        i33 = 2;
                                    } else {
                                        i33 = 0;
                                    }
                                    StyleSpan styleSpan = new StyleSpan(i33);
                                    i34 = 33;
                                    spannableString3.setSpan(styleSpan, i30, i31, 33);
                                } else {
                                    i34 = 33;
                                }
                                if (uj4Var != null) {
                                    i35 = uj4Var.f31941a;
                                    if ((i35 | 1) == i35) {
                                        spannableString3.setSpan(new UnderlineSpan(), i30, i31, i34);
                                    }
                                    if ((i35 | 2) == i35) {
                                        spannableString3.setSpan(new StrikethroughSpan(), i30, i31, i34);
                                    }
                                }
                                if (zk4Var != null) {
                                    spannableString3.setSpan(new ScaleXSpan(zk4Var.f36161a), i30, i31, i34);
                                }
                                C0006a5.m56L(spannableString3, zm2Var, i30, i31);
                                if (j != 16) {
                                    spannableString3.setSpan(new BackgroundColorSpan(zy5.m13858V(j)), i30, i31, i34);
                                }
                                i29 = i41 + 1;
                                spannableString = spannableString3;
                                Obtain = r17;
                                arrayList3 = arrayList7;
                                size12 = i40;
                                viewOnAttachStateChangeListenerC1400zc3 = viewOnAttachStateChangeListenerC1400zc4;
                                resources = resources3;
                                lq3Var = lq3Var4;
                                jv2Var = jv2Var3;
                                i14Var5 = i14Var6;
                                lw2Var = lw2Var4;
                                c1242v3 = c1242v6;
                            }
                            Obtain = Obtain;
                        }
                        viewOnAttachStateChangeListenerC1400zc = viewOnAttachStateChangeListenerC1400zc3;
                        i14Var = i14Var5;
                        lw2Var2 = lw2Var;
                        jv2Var2 = jv2Var;
                        lq3Var2 = lq3Var;
                        resources2 = resources;
                        r6 = Obtain;
                        C1242v3 c1242v7 = c1242v3;
                        spannableString2 = spannableString;
                        int length = str4.length();
                        arrayList4 = v71.f32439a;
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size11 = list4.size();
                            while (i28 < size11) {
                                Object obj4 = list4.get(i28);
                                c0838kk5 = (C0838kk) obj4;
                                if (!(c0838kk5.f23186a instanceof nx4) && AbstractC0912mk.m8336b(0, length, c0838kk5.f23187b, c0838kk5.f23188c)) {
                                    arrayList5.add(obj4);
                                }
                            }
                        } else {
                            arrayList5 = arrayList4;
                        }
                        size6 = ((Collection) arrayList5).size();
                        while (i19 < size6) {
                            C0838kk c0838kk7 = (C0838kk) arrayList5.get(i19);
                            nx4Var = (nx4) c0838kk7.f23186a;
                            i26 = c0838kk7.f23187b;
                            i27 = c0838kk7.f23188c;
                            if (nx4Var instanceof nx4) {
                                C0670g.m5864c();
                                return r47;
                            }
                            spannableString2.setSpan(new TtsSpan.VerbatimBuilder(nx4Var.f26180a).build(), i26, i27, 33);
                        }
                        int length2 = str4.length();
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size10 = list4.size();
                            while (i25 < size10) {
                                Object obj5 = list4.get(i25);
                                c0838kk4 = (C0838kk) obj5;
                                if (!(c0838kk4.f23186a instanceof nv4) && AbstractC0912mk.m8336b(0, length2, c0838kk4.f23187b, c0838kk4.f23188c)) {
                                    arrayList6.add(obj5);
                                }
                            }
                        } else {
                            arrayList6 = arrayList4;
                        }
                        size7 = ((Collection) arrayList6).size();
                        while (i20 < size7) {
                            C0838kk c0838kk8 = (C0838kk) arrayList6.get(i20);
                            nv4Var = (nv4) c0838kk8.f23186a;
                            int i43 = c0838kk8.f23187b;
                            int i44 = c0838kk8.f23188c;
                            weakHashMap3 = (WeakHashMap) tt2Var.f31428b;
                            uRLSpan2 = weakHashMap3.get(nv4Var);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(nv4Var.f26126a);
                                weakHashMap3.put(nv4Var, uRLSpan2);
                            }
                            spannableString2.setSpan((URLSpan) uRLSpan2, i43, i44, 33);
                        }
                        int length3 = str4.length();
                        if (list4 != null) {
                            arrayList4 = new ArrayList(list4.size());
                            size9 = list4.size();
                            while (i24 < size9) {
                                Object obj6 = list4.get(i24);
                                c0838kk3 = (C0838kk) obj6;
                                if (!(c0838kk3.f23186a instanceof jl2) && AbstractC0912mk.m8336b(0, length3, c0838kk3.f23187b, c0838kk3.f23188c)) {
                                    arrayList4.add(obj6);
                                }
                            }
                        }
                        size8 = ((Collection) arrayList4).size();
                        while (i21 < size8) {
                            c0838kk = (C0838kk) arrayList4.get(i21);
                            i22 = c0838kk.f23187b;
                            obj = c0838kk.f23186a;
                            i23 = c0838kk.f23188c;
                            if (i22 != i23) {
                                jl2Var = (jl2) obj;
                                if (jl2Var instanceof il2) {
                                    il2Var = (il2) obj;
                                    c0838kk2 = new C0838kk(i22, i23, il2Var);
                                    weakHashMap2 = (WeakHashMap) tt2Var.f31429c;
                                    uRLSpan = weakHashMap2.get(c0838kk2);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(il2Var.f21529a);
                                        weakHashMap2.put(c0838kk2, uRLSpan);
                                    }
                                    spannableString2.setSpan((URLSpan) uRLSpan, i22, i23, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) tt2Var.f31430d;
                                    obj2 = weakHashMap.get(c0838kk);
                                    if (obj2 == null) {
                                        obj3 = obj2;
                                        lh0 lh0Var = new lh0();
                                        lh0Var.f24029a = jl2Var;
                                        VarHandle.storeStoreFence();
                                        weakHashMap.put(c0838kk, lh0Var);
                                        obj3 = lh0Var;
                                    }
                                    obj3 = obj2;
                                    spannableString2.setSpan((ClickableSpan) obj3, i22, i23, 33);
                                }
                            }
                        }
                        c1242v4 = c1242v7;
                        r0 = (SpannableString) ViewOnAttachStateChangeListenerC1400zc.m13469J(spannableString2);
                    } else {
                        viewOnAttachStateChangeListenerC1400zc = viewOnAttachStateChangeListenerC1400zc3;
                        i14Var = i14Var5;
                        lw2Var2 = lw2Var;
                        jv2Var2 = jv2Var;
                        wf2Var2 = wf2Var2;
                        lq3Var2 = lq3Var;
                        resources2 = resources;
                        r6 = Obtain;
                        r0 = r47;
                        c1242v4 = c1242v3;
                    }
                    c1242v4.f32353a.setText(r0);
                    p14Var = m14.f24547N;
                    lw2Var3 = lw2Var2;
                    if (lw2Var3.m8128c(p14Var)) {
                        r6.setContentInvalid(true);
                        objM8132g5 = lw2Var3.m8132g(p14Var);
                        if (objM8132g5 == null) {
                            r1 = objM8132g5;
                            r1 = r47;
                        }
                        r1 = objM8132g5;
                        r6.setError((CharSequence) r1);
                    }
                    Resources resources4 = resources2;
                    i14Var2 = i14Var;
                    c1242v4.f32353a.setStateDescription(vd6.m11865x(i14Var2, resources4));
                    r6.setCheckable(vd6.m11864w(i14Var2));
                    ln4Var = (ln4) lb5.m7906O(e14Var, m14.f24544K);
                    if (ln4Var != null) {
                        if (ln4Var == ln4.f24214a) {
                            c1242v4.f32353a.setChecked(true);
                        } else if (ln4Var == ln4.f24215b) {
                            c1242v4.f32353a.setChecked(false);
                        }
                    }
                    bool = (Boolean) lb5.m7906O(e14Var, m14.f24543J);
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (lq3Var2 == null) {
                            lq3Var3 = lq3Var2;
                            i7 = 4;
                        } else {
                            lq3Var3 = lq3Var2;
                            i7 = 4;
                            if (lq3Var3.f24281a == 4) {
                                r6.setSelected(zBooleanValue2);
                            }
                        }
                        c1242v4.f32353a.setChecked(zBooleanValue2);
                    } else {
                        lq3Var3 = lq3Var2;
                        i7 = 4;
                    }
                    if (e14Var.f17633c || i14Var2.m6548i((4 & 1) != 0 ? !i14Var2.f21010b : false, (4 & 2) == 0).isEmpty()) {
                        list = (List) lb5.m7906O(e14Var, m14.f24552a);
                        if (list != null) {
                            r4 = (String) hb0.m6301M0(list);
                        } else {
                            r4 = r47;
                        }
                        r6.setContentDescription(r4);
                    }
                    str = (String) lb5.m7906O(e14Var, m14.f24577z);
                    if (str != null) {
                        i14VarM6550l3 = i14Var2;
                        while (true) {
                            if (i14VarM6550l3 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            e14Var2 = i14VarM6550l3.f21012d;
                            p14Var5 = C0638f5.f18755i;
                            if (e14Var2.f17631a.m8128c(p14Var5)) {
                                zBooleanValue = ((Boolean) e14Var2.m4900c(p14Var5)).booleanValue();
                                break;
                            }
                            i14VarM6550l3 = i14VarM6550l3.m6550l();
                        }
                        if (zBooleanValue) {
                            r6.setViewIdResourceName(str);
                        }
                    }
                    if (((ju4) lb5.m7906O(e14Var, m14.f24559h)) != null) {
                        z2 = true;
                        c1242v4.f32353a.setHeading(true);
                    } else {
                        z2 = true;
                    }
                    if (((ju4) lb5.m7906O(e14Var, m14.f24560i)) != null) {
                        r6.setTextEntryKey(z2);
                    }
                    i8 = i;
                    if (i8 != -1) {
                        iM7293d3 = jv2Var2.m7293d(i14Var2.f21014f);
                        if (iM7293d3 != -1) {
                            r6.setDrawingOrder(iM7293d3);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    r6.setPassword(lw2Var3.m8128c(m14.f24546M));
                    Object objM7906O = lb5.m7906O(e14Var, m14.f24549P);
                    bool2 = Boolean.TRUE;
                    r6.setEditable(z62.m13387o(objM7906O, bool2));
                    num = (Integer) lb5.m7906O(e14Var, m14.f24550Q);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    r6.setMaxTextLength(iIntValue2);
                    r6.setEnabled(vd6.m11857p(i14Var2));
                    p14Var2 = m14.f24563l;
                    r6.setFocusable(lw2Var3.m8128c(p14Var2));
                    if (r6.isFocusable()) {
                        r6.setFocused(((Boolean) e14Var.m4900c(p14Var2)).booleanValue());
                        zIsFocused = r6.isFocused();
                        accessibilityNodeInfo3 = c1242v4.f32353a;
                        if (zIsFocused) {
                            accessibilityNodeInfo3.addAction(2);
                            ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc5 = viewOnAttachStateChangeListenerC1400zc;
                            viewOnAttachStateChangeListenerC1400zc5.f35959l = i8;
                            viewOnAttachStateChangeListenerC1400zc2 = viewOnAttachStateChangeListenerC1400zc5;
                        } else {
                            r8 = viewOnAttachStateChangeListenerC1400zc;
                            z3 = true;
                            accessibilityNodeInfo3.addAction(1);
                        }
                        c1242v4.f32353a.setVisibleToUser(C0006a5.m87y(i14Var2) ^ z3);
                        if (i14Var2.m6552n()) {
                            i14VarM6550l2 = i14Var2.m6550l();
                        } else {
                            i14VarM6550l2 = i14Var2;
                        }
                        if (i14VarM6550l2.m6551m().m7171g()) {
                            z4 = false;
                            c1242v4.f32353a.setVisibleToUser(false);
                        } else {
                            z4 = false;
                        }
                        if (((jm2) lb5.m7906O(e14Var, m14.f24562k)) != null) {
                            r6.setLiveRegion(2);
                        }
                        c1242v4.f32353a.setClickable(z4);
                        c1353y2 = (C1353y2) lb5.m7906O(e14Var, d14.f16705b);
                        if (c1353y2 != null) {
                            boolean zM13387o4 = z62.m13387o(lb5.m7906O(e14Var, m14.f24543J), bool2);
                            z7 = (lq3Var3 == null && lq3Var3.f24281a == 4) || (lq3Var3 != null && lq3Var3.f24281a == 3);
                            if (z7 || (z7 && !zM13387o4)) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            c1242v4.f32353a.setClickable(z8);
                            if (vd6.m11857p(i14Var2) && r6.isClickable()) {
                                c1242v4.m11713a(new C1131s3(16, c1353y2.f34817a));
                            }
                        }
                        c1242v4.f32353a.setLongClickable(false);
                        c1353y3 = (C1353y2) lb5.m7906O(e14Var, d14.f16706c);
                        if (c1353y3 != null) {
                            c1242v4.f32353a.setLongClickable(true);
                            if (vd6.m11857p(i14Var2)) {
                                c1242v4.m11713a(new C1131s3(32, c1353y3.f34817a));
                            }
                        }
                        c1353y4 = (C1353y2) lb5.m7906O(e14Var, d14.f16720q);
                        if (c1353y4 != null) {
                            c1242v4.m11713a(new C1131s3(16384, c1353y4.f34817a));
                        }
                        if (vd6.m11857p(i14Var2)) {
                            c1353y10 = (C1353y2) lb5.m7906O(e14Var, d14.f16714k);
                            if (c1353y10 != null) {
                                c1242v4.m11713a(new C1131s3(2097152, c1353y10.f34817a));
                            }
                            c1353y11 = (C1353y2) lb5.m7906O(e14Var, d14.f16719p);
                            if (c1353y11 != null) {
                                c1242v4.m11713a(new C1131s3(R.id.accessibilityActionImeEnter, c1353y11.f34817a));
                            }
                            c1353y12 = (C1353y2) lb5.m7906O(e14Var, d14.f16721r);
                            if (c1353y12 != null) {
                                c1242v4.m11713a(new C1131s3(65536, c1353y12.f34817a));
                            }
                            c1353y13 = (C1353y2) lb5.m7906O(e14Var, d14.f16722s);
                            if (c1353y13 != null && r6.isFocused()) {
                                primaryClipDescription = ((z32) viewTreeObserverOnGlobalLayoutListenerC1140sc2.getClipboardManager()).m13305A().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    c1242v4.m11713a(new C1131s3(32768, c1353y13.f34817a));
                                }
                            }
                        }
                        strM13470m = ViewOnAttachStateChangeListenerC1400zc.m13470m(i14Var2);
                        if (strM13470m != null && strM13470m.length() != 0) {
                            r6.setTextSelection(r8.m13490k(i14Var2), r8.m13489j(i14Var2));
                            c1353y9 = (C1353y2) lb5.m7906O(e14Var, d14.f16713j);
                            if (c1353y9 != null) {
                                r13 = c1353y9.f34817a;
                            } else {
                                r13 = r47;
                            }
                            c1242v4.m11713a(new C1131s3(131072, r13));
                            c1242v4.f32353a.addAction(256);
                            c1242v4.f32353a.addAction(512);
                            c1242v4.f32353a.setMovementGranularities(11);
                            list3 = (List) lb5.m7906O(e14Var, m14.f24552a);
                            if ((list3 != null || list3.isEmpty()) && lw2Var3.m8128c(d14.f16704a) && (!lw2Var3.m8128c(m14.f24539F) || z62.m13387o(lb5.m7906O(e14Var, p14Var2), bool2))) {
                                M12295v = wf2Var2.m12295v();
                                while (true) {
                                    if (M12295v == 0) {
                                        M12295v = r47;
                                        break;
                                    }
                                    e14VarM12297x2 = M12295v.m12297x();
                                    if (e14VarM12297x2 == null && e14VarM12297x2.f17633c) {
                                        if (e14VarM12297x2.f17631a.m8128c(m14.f24539F)) {
                                            break;
                                        }
                                    }
                                    M12295v = M12295v.m12295v();
                                }
                                if (M12295v == 0) {
                                    c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                                } else {
                                    e14VarM12297x = M12295v.m12297x();
                                    if (e14VarM12297x != null) {
                                        objM8132g4 = e14VarM12297x.f17631a.m8132g(m14.f24563l);
                                        if (objM8132g4 == null) {
                                            r5 = objM8132g4;
                                            r5 = r47;
                                        }
                                        r5 = objM8132g4;
                                        zM13387o = z62.m13387o(r5, Boolean.TRUE);
                                    } else {
                                        zM13387o = false;
                                    }
                                    if (zM13387o) {
                                        c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceM11715d = c1242v4.m11715d();
                        if (charSequenceM11715d != null && charSequenceM11715d.length() != 0 && lw2Var3.m8128c(d14.f16704a)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (lw2Var3.m8128c(m14.f24577z)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (lw2Var3.m8128c(m14.f24551R)) {
                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        r6.setAvailableExtraData(arrayList);
                        bh3Var = (bh3) lb5.m7906O(e14Var, m14.f24554c);
                        if (bh3Var != null) {
                            f = bh3Var.f15271a;
                            ma0 ma0Var = bh3Var.f15272b;
                            f2 = ma0Var.f24778a;
                            f3 = ma0Var.f24779b;
                            p14Var4 = d14.f16712i;
                            if (lw2Var3.m8128c(p14Var4)) {
                                c1242v4.m11716e("android.widget.SeekBar");
                            } else {
                                c1242v4.m11716e("android.widget.ProgressBar");
                            }
                            if (bh3Var != bh3.f15270c) {
                                r6.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, f2, f3, f));
                            }
                            if (lw2Var3.m8128c(p14Var4) && vd6.m11857p(i14Var2)) {
                                if (f3 < f2) {
                                    f4 = f2;
                                } else {
                                    f4 = f3;
                                }
                                if (f < f4) {
                                    c1242v4.m11713a(C1131s3.f29846e);
                                }
                                if (f2 > f3) {
                                    f2 = f3;
                                }
                                if (f > f2) {
                                    c1242v4.m11713a(C1131s3.f29847f);
                                }
                            }
                        }
                        if (vd6.m11857p(i14Var2) && (c1353y8 = (C1353y2) lb5.m7906O(e14Var, d14.f16712i)) != null) {
                            c1242v4.m11713a(new C1131s3(R.id.accessibilityActionSetProgress, c1353y8.f34817a));
                        }
                        zt5.m13764J(c1242v4, i14Var2);
                        zt5.m13765K(c1242v4, i14Var2);
                        ww3Var = (ww3) lb5.m7906O(e14Var, m14.f24573v);
                        C1353y2 c1353y14 = (C1353y2) lb5.m7906O(e14Var, d14.f16707d);
                        if (ww3Var != null && c1353y14 != null) {
                            objM8132g2 = i14Var2.m6549k().f17631a.m8132g(m14.f24557f);
                            if (objM8132g2 == null) {
                                r11 = objM8132g2;
                                r11 = r47;
                            }
                            if (r11 == 0) {
                                objM8132g3 = i14Var2.m6549k().f17631a.m8132g(m14.f24556e);
                                r12 = objM8132g3;
                                if (objM8132g3 == null) {
                                    r12 = r47;
                                }
                                if (r12 == 0) {
                                    c1242v4.m11716e("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) ww3Var.f33801b.invoke()).floatValue() > 0.0f) {
                                c1242v4.f32353a.setScrollable(true);
                            }
                            if (vd6.m11857p(i14Var2)) {
                                if (ViewOnAttachStateChangeListenerC1400zc.m13473s(ww3Var)) {
                                    c1242v4.m11713a(C1131s3.f29846e);
                                    wf2Var = wf2Var2;
                                    if (wf2Var.f33293A == df2.f17012b) {
                                        c1131s4 = C1131s3.f29849h;
                                    } else {
                                        c1131s4 = C1131s3.f29851j;
                                    }
                                    c1242v4.m11713a(c1131s4);
                                } else {
                                    wf2Var = wf2Var2;
                                }
                                if (ViewOnAttachStateChangeListenerC1400zc.m13472r(ww3Var)) {
                                    c1242v4.m11713a(C1131s3.f29847f);
                                    if (wf2Var.f33293A == df2.f17012b) {
                                        c1131s3 = C1131s3.f29851j;
                                    } else {
                                        c1131s3 = C1131s3.f29849h;
                                    }
                                    c1242v4.m11713a(c1131s3);
                                }
                            }
                        }
                        ww3Var2 = (ww3) lb5.m7906O(e14Var, m14.f24574w);
                        if (ww3Var2 != null || c1353y14 == null) {
                            z5 = true;
                        } else {
                            Object objM8132g8 = i14Var2.m6549k().f17631a.m8132g(m14.f24557f);
                            if (objM8132g8 == null) {
                                r9 = objM8132g8;
                                r9 = r47;
                            }
                            if (r9 == 0) {
                                Object objM8132g9 = i14Var2.m6549k().f17631a.m8132g(m14.f24556e);
                                ?? r18 = objM8132g9;
                                if (objM8132g9 == null) {
                                    r18 = r47;
                                }
                                if (r18 == 0) {
                                    c1242v4.m11716e("android.widget.ScrollView");
                                }
                            }
                            if (((Number) ww3Var2.f33801b.invoke()).floatValue() > 0.0f) {
                                z5 = true;
                                c1242v4.f32353a.setScrollable(true);
                            } else {
                                z5 = true;
                            }
                            if (vd6.m11857p(i14Var2)) {
                                if (ViewOnAttachStateChangeListenerC1400zc.m13473s(ww3Var2)) {
                                    c1242v4.m11713a(C1131s3.f29846e);
                                    c1242v4.m11713a(C1131s3.f29850i);
                                }
                                if (ViewOnAttachStateChangeListenerC1400zc.m13472r(ww3Var2)) {
                                    c1242v4.m11713a(C1131s3.f29847f);
                                    c1242v4.m11713a(C1131s3.f29848g);
                                }
                            }
                        }
                        zc6.m13529n(c1242v4, i14Var2);
                        c1242v4.f32353a.setPaneTitle((CharSequence) lb5.m7906O(e14Var, m14.f24555d));
                        if (vd6.m11857p(i14Var2)) {
                            c1353y5 = (C1353y2) lb5.m7906O(e14Var, d14.f16723t);
                            if (c1353y5 != null) {
                                c1242v4.m11713a(new C1131s3(262144, c1353y5.f34817a));
                            }
                            c1353y6 = (C1353y2) lb5.m7906O(e14Var, d14.f16724u);
                            if (c1353y6 != null) {
                                c1242v4.m11713a(new C1131s3(524288, c1353y6.f34817a));
                            }
                            c1353y7 = (C1353y2) lb5.m7906O(e14Var, d14.f16725v);
                            if (c1353y7 != null) {
                                c1242v4.m11713a(new C1131s3(1048576, c1353y7.f34817a));
                            }
                            p14Var3 = d14.f16727x;
                            if (lw2Var3.m8128c(p14Var3)) {
                                list2 = (List) e14Var.m4900c(p14Var3);
                                size2 = list2.size();
                                kv2Var3 = kv2Var2;
                                i9 = kv2Var3.f23538b;
                                if (size2 < i9) {
                                    C1077qn.m9989o(c75.m3878j("Can't have more than ", i9, " custom actions for one widget"));
                                    return r47;
                                }
                                ra4Var3 = new ra4(0);
                                yv2VarM9357a = p23.m9357a();
                                ra4Var4 = ra4Var2;
                                if (qq2.m10024h(ra4Var4.f29119a, ra4Var4.f29121c, i8) >= 0) {
                                    z6 = z5;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    yv2Var = (yv2) sc6.m10680u(ra4Var4, i8);
                                    kv2Var4 = new kv2();
                                    iArr = kv2Var3.f23537a;
                                    i11 = kv2Var3.f23538b;
                                    while (i12 < i11) {
                                        kv2Var4.m7633a(iArr[i12]);
                                    }
                                    arrayList2 = new ArrayList();
                                    size4 = list2.size();
                                    i13 = 0;
                                    while (i13 < size4) {
                                        fs0Var = (fs0) list2.get(i13);
                                        int i45 = size4;
                                        str3 = fs0Var.f19247a;
                                        if (yv2Var.m13260d(str3) >= 0) {
                                            iM13260d = yv2Var.m13260d(str3);
                                            if (iM13260d >= 0) {
                                                kx5.m7737u0("There is no key " + ((Object) str3) + " in the map");
                                                throw r47;
                                            }
                                            i15 = yv2Var.f35549c[iM13260d];
                                            ra4Var3.m10256c(i15, str3);
                                            yv2VarM9357a.m13263g(i15, str3);
                                            iArr2 = kv2Var4.f23537a;
                                            i16 = kv2Var4.f23538b;
                                            i17 = 0;
                                            while (true) {
                                                if (i17 < i16) {
                                                    i17 = -1;
                                                    break;
                                                }
                                                i18 = i16;
                                                if (i15 == iArr2[i17]) {
                                                    break;
                                                }
                                                i17++;
                                                i16 = i18;
                                            }
                                            if (i17 >= 0) {
                                                kv2Var4.m7637e(i17);
                                            }
                                            c1242v4.m11713a(new C1131s3(i15, str3));
                                        } else {
                                            arrayList2.add(fs0Var);
                                        }
                                        i13++;
                                        size4 = i45;
                                        yv2Var = yv2Var;
                                    }
                                    size5 = arrayList2.size();
                                    while (i14 < size5) {
                                        fs0 fs0Var2 = (fs0) arrayList2.get(i14);
                                        int iM7635c = kv2Var4.m7635c(i14);
                                        String str5 = fs0Var2.f19247a;
                                        ra4Var3.m10256c(iM7635c, str5);
                                        yv2VarM9357a.m13263g(iM7635c, str5);
                                        c1242v4.m11713a(new C1131s3(iM7635c, str5));
                                    }
                                } else {
                                    size3 = list2.size();
                                    while (i10 < size3) {
                                        fs0 fs0Var3 = (fs0) list2.get(i10);
                                        int iM7635c2 = kv2Var3.m7635c(i10);
                                        String str6 = fs0Var3.f19247a;
                                        ra4Var3.m10256c(iM7635c2, str6);
                                        yv2VarM9357a.m13263g(iM7635c2, str6);
                                        c1242v4.m11713a(new C1131s3(iM7635c2, str6));
                                    }
                                }
                                r8.f35965r.m10256c(i8, ra4Var3);
                                ra4Var4.m10256c(i8, yv2VarM9357a);
                            }
                        }
                        c1242v4.f32353a.setScreenReaderFocusable(vd6.m11820D(i14Var2, resources4));
                        iM7293d = r8.f35939B.m7293d(i8);
                        if (iM7293d != -1) {
                            abstractC0492biM13856T2 = zy5.m13856T(viewTreeObserverOnGlobalLayoutListenerC1140sc2.getAndroidViewsHandler$ui(), iM7293d);
                            accessibilityNodeInfo2 = c1242v4.f32353a;
                            if (abstractC0492biM13856T2 != null) {
                                accessibilityNodeInfo2.setTraversalBefore(abstractC0492biM13856T2);
                                viewTreeObserverOnGlobalLayoutListenerC1140sc = viewTreeObserverOnGlobalLayoutListenerC1140sc2;
                            } else {
                                viewTreeObserverOnGlobalLayoutListenerC1140sc = viewTreeObserverOnGlobalLayoutListenerC1140sc2;
                                accessibilityNodeInfo2.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC1140sc, iM7293d);
                            }
                            r8.m13482c(i8, c1242v4, r8.f35941D, r47);
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC1140sc = viewTreeObserverOnGlobalLayoutListenerC1140sc2;
                        }
                        iM7293d2 = r8.f35940C.m7293d(i8);
                        if (iM7293d2 != -1 && (abstractC0492biM13856T = zy5.m13856T(viewTreeObserverOnGlobalLayoutListenerC1140sc.getAndroidViewsHandler$ui(), iM7293d2)) != null) {
                            c1242v4.f32353a.setTraversalAfter(abstractC0492biM13856T);
                            r8.m13482c(i8, c1242v4, r8.f35942E, null);
                        }
                        str2 = (String) lb5.m7906O(e14Var, C0638f5.f18756j);
                        if (str2 != null) {
                            c1242v4.m11716e(str2);
                        }
                        c1242v5 = c1242v4;
                        r16 = r8;
                    } else {
                        viewOnAttachStateChangeListenerC1400zc2 = viewOnAttachStateChangeListenerC1400zc;
                    }
                    z3 = true;
                    r8 = viewOnAttachStateChangeListenerC1400zc2;
                    c1242v4.f32353a.setVisibleToUser(C0006a5.m87y(i14Var2) ^ z3);
                    if (i14Var2.m6552n()) {
                        i14VarM6550l2 = i14Var2.m6550l();
                    } else {
                        i14VarM6550l2 = i14Var2;
                    }
                    if (i14VarM6550l2.m6551m().m7171g()) {
                        z4 = false;
                        c1242v4.f32353a.setVisibleToUser(false);
                    } else {
                        z4 = false;
                    }
                    if (((jm2) lb5.m7906O(e14Var, m14.f24562k)) != null) {
                        r6.setLiveRegion(2);
                    }
                    c1242v4.f32353a.setClickable(z4);
                    c1353y2 = (C1353y2) lb5.m7906O(e14Var, d14.f16705b);
                    if (c1353y2 != null) {
                        boolean zM13387o5 = z62.m13387o(lb5.m7906O(e14Var, m14.f24543J), bool2);
                        if (lq3Var3 == null) {
                        }
                        if (z7) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        c1242v4.f32353a.setClickable(z8);
                        if (vd6.m11857p(i14Var2)) {
                            c1242v4.m11713a(new C1131s3(16, c1353y2.f34817a));
                        }
                    }
                    c1242v4.f32353a.setLongClickable(false);
                    c1353y3 = (C1353y2) lb5.m7906O(e14Var, d14.f16706c);
                    if (c1353y3 != null) {
                        c1242v4.f32353a.setLongClickable(true);
                        if (vd6.m11857p(i14Var2)) {
                            c1242v4.m11713a(new C1131s3(32, c1353y3.f34817a));
                        }
                    }
                    c1353y4 = (C1353y2) lb5.m7906O(e14Var, d14.f16720q);
                    if (c1353y4 != null) {
                        c1242v4.m11713a(new C1131s3(16384, c1353y4.f34817a));
                    }
                    if (vd6.m11857p(i14Var2)) {
                        c1353y10 = (C1353y2) lb5.m7906O(e14Var, d14.f16714k);
                        if (c1353y10 != null) {
                            c1242v4.m11713a(new C1131s3(2097152, c1353y10.f34817a));
                        }
                        c1353y11 = (C1353y2) lb5.m7906O(e14Var, d14.f16719p);
                        if (c1353y11 != null) {
                            c1242v4.m11713a(new C1131s3(R.id.accessibilityActionImeEnter, c1353y11.f34817a));
                        }
                        c1353y12 = (C1353y2) lb5.m7906O(e14Var, d14.f16721r);
                        if (c1353y12 != null) {
                            c1242v4.m11713a(new C1131s3(65536, c1353y12.f34817a));
                        }
                        c1353y13 = (C1353y2) lb5.m7906O(e14Var, d14.f16722s);
                        if (c1353y13 != null) {
                            primaryClipDescription = ((z32) viewTreeObserverOnGlobalLayoutListenerC1140sc2.getClipboardManager()).m13305A().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                c1242v4.m11713a(new C1131s3(32768, c1353y13.f34817a));
                            }
                        }
                    }
                    strM13470m = ViewOnAttachStateChangeListenerC1400zc.m13470m(i14Var2);
                    if (strM13470m != null) {
                        r6.setTextSelection(r8.m13490k(i14Var2), r8.m13489j(i14Var2));
                        c1353y9 = (C1353y2) lb5.m7906O(e14Var, d14.f16713j);
                        if (c1353y9 != null) {
                            r13 = c1353y9.f34817a;
                        } else {
                            r13 = r47;
                        }
                        c1242v4.m11713a(new C1131s3(131072, r13));
                        c1242v4.f32353a.addAction(256);
                        c1242v4.f32353a.addAction(512);
                        c1242v4.f32353a.setMovementGranularities(11);
                        list3 = (List) lb5.m7906O(e14Var, m14.f24552a);
                        if (list3 != null) {
                            M12295v = wf2Var2.m12295v();
                            while (true) {
                                if (M12295v == 0) {
                                    M12295v = r47;
                                    break;
                                }
                                e14VarM12297x2 = M12295v.m12297x();
                                if (e14VarM12297x2 == null) {
                                }
                                M12295v = M12295v.m12295v();
                            }
                            if (M12295v == 0) {
                                c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                            } else {
                                e14VarM12297x = M12295v.m12297x();
                                if (e14VarM12297x != null) {
                                    objM8132g4 = e14VarM12297x.f17631a.m8132g(m14.f24563l);
                                    if (objM8132g4 == null) {
                                        r5 = objM8132g4;
                                        r5 = r47;
                                    }
                                    r5 = objM8132g4;
                                    zM13387o = z62.m13387o(r5, Boolean.TRUE);
                                } else {
                                    zM13387o = false;
                                }
                                if (zM13387o) {
                                    c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                                }
                            }
                        } else {
                            M12295v = wf2Var2.m12295v();
                            while (true) {
                                if (M12295v == 0) {
                                    M12295v = r47;
                                    break;
                                }
                                e14VarM12297x2 = M12295v.m12297x();
                                if (e14VarM12297x2 == null) {
                                }
                                M12295v = M12295v.m12295v();
                            }
                            if (M12295v == 0) {
                                c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                            } else {
                                e14VarM12297x = M12295v.m12297x();
                                if (e14VarM12297x != null) {
                                    objM8132g4 = e14VarM12297x.f17631a.m8132g(m14.f24563l);
                                    if (objM8132g4 == null) {
                                        r5 = objM8132g4;
                                        r5 = r47;
                                    }
                                    r5 = objM8132g4;
                                    zM13387o = z62.m13387o(r5, Boolean.TRUE);
                                } else {
                                    zM13387o = false;
                                }
                                if (zM13387o) {
                                    c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceM11715d = c1242v4.m11715d();
                    if (charSequenceM11715d != null) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (lw2Var3.m8128c(m14.f24577z)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (lw2Var3.m8128c(m14.f24551R)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    r6.setAvailableExtraData(arrayList);
                    bh3Var = (bh3) lb5.m7906O(e14Var, m14.f24554c);
                    if (bh3Var != null) {
                        f = bh3Var.f15271a;
                        ma0 ma0Var2 = bh3Var.f15272b;
                        f2 = ma0Var2.f24778a;
                        f3 = ma0Var2.f24779b;
                        p14Var4 = d14.f16712i;
                        if (lw2Var3.m8128c(p14Var4)) {
                            c1242v4.m11716e("android.widget.SeekBar");
                        } else {
                            c1242v4.m11716e("android.widget.ProgressBar");
                        }
                        if (bh3Var != bh3.f15270c) {
                            r6.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, f2, f3, f));
                        }
                        if (lw2Var3.m8128c(p14Var4)) {
                            if (f3 < f2) {
                                f4 = f2;
                            } else {
                                f4 = f3;
                            }
                            if (f < f4) {
                                c1242v4.m11713a(C1131s3.f29846e);
                            }
                            if (f2 > f3) {
                                f2 = f3;
                            }
                            if (f > f2) {
                                c1242v4.m11713a(C1131s3.f29847f);
                            }
                        }
                    }
                    if (vd6.m11857p(i14Var2)) {
                        c1242v4.m11713a(new C1131s3(R.id.accessibilityActionSetProgress, c1353y8.f34817a));
                    }
                    zt5.m13764J(c1242v4, i14Var2);
                    zt5.m13765K(c1242v4, i14Var2);
                    ww3Var = (ww3) lb5.m7906O(e14Var, m14.f24573v);
                    C1353y2 c1353y15 = (C1353y2) lb5.m7906O(e14Var, d14.f16707d);
                    if (ww3Var != null) {
                        objM8132g2 = i14Var2.m6549k().f17631a.m8132g(m14.f24557f);
                        if (objM8132g2 == null) {
                            r11 = objM8132g2;
                            r11 = r47;
                        }
                        if (r11 == 0) {
                            objM8132g3 = i14Var2.m6549k().f17631a.m8132g(m14.f24556e);
                            r12 = objM8132g3;
                            if (objM8132g3 == null) {
                                r12 = r47;
                            }
                            if (r12 == 0) {
                                c1242v4.m11716e("android.widget.HorizontalScrollView");
                            }
                        }
                        if (((Number) ww3Var.f33801b.invoke()).floatValue() > 0.0f) {
                            c1242v4.f32353a.setScrollable(true);
                        }
                        if (vd6.m11857p(i14Var2)) {
                            if (ViewOnAttachStateChangeListenerC1400zc.m13473s(ww3Var)) {
                                c1242v4.m11713a(C1131s3.f29846e);
                                wf2Var = wf2Var2;
                                if (wf2Var.f33293A == df2.f17012b) {
                                    c1131s4 = C1131s3.f29849h;
                                } else {
                                    c1131s4 = C1131s3.f29851j;
                                }
                                c1242v4.m11713a(c1131s4);
                            } else {
                                wf2Var = wf2Var2;
                            }
                            if (ViewOnAttachStateChangeListenerC1400zc.m13472r(ww3Var)) {
                                c1242v4.m11713a(C1131s3.f29847f);
                                if (wf2Var.f33293A == df2.f17012b) {
                                    c1131s3 = C1131s3.f29851j;
                                } else {
                                    c1131s3 = C1131s3.f29849h;
                                }
                                c1242v4.m11713a(c1131s3);
                            }
                        }
                    }
                    ww3Var2 = (ww3) lb5.m7906O(e14Var, m14.f24574w);
                    if (ww3Var2 != null) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    zc6.m13529n(c1242v4, i14Var2);
                    c1242v4.f32353a.setPaneTitle((CharSequence) lb5.m7906O(e14Var, m14.f24555d));
                    if (vd6.m11857p(i14Var2)) {
                        c1353y5 = (C1353y2) lb5.m7906O(e14Var, d14.f16723t);
                        if (c1353y5 != null) {
                            c1242v4.m11713a(new C1131s3(262144, c1353y5.f34817a));
                        }
                        c1353y6 = (C1353y2) lb5.m7906O(e14Var, d14.f16724u);
                        if (c1353y6 != null) {
                            c1242v4.m11713a(new C1131s3(524288, c1353y6.f34817a));
                        }
                        c1353y7 = (C1353y2) lb5.m7906O(e14Var, d14.f16725v);
                        if (c1353y7 != null) {
                            c1242v4.m11713a(new C1131s3(1048576, c1353y7.f34817a));
                        }
                        p14Var3 = d14.f16727x;
                        if (lw2Var3.m8128c(p14Var3)) {
                            list2 = (List) e14Var.m4900c(p14Var3);
                            size2 = list2.size();
                            kv2Var3 = kv2Var2;
                            i9 = kv2Var3.f23538b;
                            if (size2 < i9) {
                                C1077qn.m9989o(c75.m3878j("Can't have more than ", i9, " custom actions for one widget"));
                                return r47;
                            }
                            ra4Var3 = new ra4(0);
                            yv2VarM9357a = p23.m9357a();
                            ra4Var4 = ra4Var2;
                            if (qq2.m10024h(ra4Var4.f29119a, ra4Var4.f29121c, i8) >= 0) {
                                z6 = z5;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                yv2Var = (yv2) sc6.m10680u(ra4Var4, i8);
                                kv2Var4 = new kv2();
                                iArr = kv2Var3.f23537a;
                                i11 = kv2Var3.f23538b;
                                while (i12 < i11) {
                                    kv2Var4.m7633a(iArr[i12]);
                                }
                                arrayList2 = new ArrayList();
                                size4 = list2.size();
                                i13 = 0;
                                while (i13 < size4) {
                                    fs0Var = (fs0) list2.get(i13);
                                    int i46 = size4;
                                    str3 = fs0Var.f19247a;
                                    if (yv2Var.m13260d(str3) >= 0) {
                                        iM13260d = yv2Var.m13260d(str3);
                                        if (iM13260d >= 0) {
                                            kx5.m7737u0("There is no key " + ((Object) str3) + " in the map");
                                            throw r47;
                                        }
                                        i15 = yv2Var.f35549c[iM13260d];
                                        ra4Var3.m10256c(i15, str3);
                                        yv2VarM9357a.m13263g(i15, str3);
                                        iArr2 = kv2Var4.f23537a;
                                        i16 = kv2Var4.f23538b;
                                        i17 = 0;
                                        while (true) {
                                            if (i17 < i16) {
                                                i17 = -1;
                                                break;
                                            }
                                            i18 = i16;
                                            if (i15 == iArr2[i17]) {
                                                break;
                                                break;
                                            }
                                            i17++;
                                            i16 = i18;
                                        }
                                        if (i17 >= 0) {
                                            kv2Var4.m7637e(i17);
                                        }
                                        c1242v4.m11713a(new C1131s3(i15, str3));
                                    } else {
                                        arrayList2.add(fs0Var);
                                    }
                                    i13++;
                                    size4 = i46;
                                    yv2Var = yv2Var;
                                }
                                size5 = arrayList2.size();
                                while (i14 < size5) {
                                    fs0 fs0Var4 = (fs0) arrayList2.get(i14);
                                    int iM7635c3 = kv2Var4.m7635c(i14);
                                    String str7 = fs0Var4.f19247a;
                                    ra4Var3.m10256c(iM7635c3, str7);
                                    yv2VarM9357a.m13263g(iM7635c3, str7);
                                    c1242v4.m11713a(new C1131s3(iM7635c3, str7));
                                }
                            } else {
                                size3 = list2.size();
                                while (i10 < size3) {
                                    fs0 fs0Var5 = (fs0) list2.get(i10);
                                    int iM7635c4 = kv2Var3.m7635c(i10);
                                    String str8 = fs0Var5.f19247a;
                                    ra4Var3.m10256c(iM7635c4, str8);
                                    yv2VarM9357a.m13263g(iM7635c4, str8);
                                    c1242v4.m11713a(new C1131s3(iM7635c4, str8));
                                }
                            }
                            r8.f35965r.m10256c(i8, ra4Var3);
                            ra4Var4.m10256c(i8, yv2VarM9357a);
                        }
                    }
                    c1242v4.f32353a.setScreenReaderFocusable(vd6.m11820D(i14Var2, resources4));
                    iM7293d = r8.f35939B.m7293d(i8);
                    if (iM7293d != -1) {
                        abstractC0492biM13856T2 = zy5.m13856T(viewTreeObserverOnGlobalLayoutListenerC1140sc2.getAndroidViewsHandler$ui(), iM7293d);
                        accessibilityNodeInfo2 = c1242v4.f32353a;
                        if (abstractC0492biM13856T2 != null) {
                            accessibilityNodeInfo2.setTraversalBefore(abstractC0492biM13856T2);
                            viewTreeObserverOnGlobalLayoutListenerC1140sc = viewTreeObserverOnGlobalLayoutListenerC1140sc2;
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC1140sc = viewTreeObserverOnGlobalLayoutListenerC1140sc2;
                            accessibilityNodeInfo2.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC1140sc, iM7293d);
                        }
                        r8.m13482c(i8, c1242v4, r8.f35941D, r47);
                    } else {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc = viewTreeObserverOnGlobalLayoutListenerC1140sc2;
                    }
                    iM7293d2 = r8.f35940C.m7293d(i8);
                    if (iM7293d2 != -1) {
                        c1242v4.f32353a.setTraversalAfter(abstractC0492biM13856T);
                        r8.m13482c(i8, c1242v4, r8.f35942E, null);
                    }
                    str2 = (String) lb5.m7906O(e14Var, C0638f5.f18756j);
                    if (str2 != null) {
                        c1242v4.m11716e(str2);
                    }
                    c1242v5 = c1242v4;
                    r16 = r8;
                } else if (Build.VERSION.SDK_INT >= 34 ? AbstractC0561d3.m4333g(accessibilityManager) : true) {
                    Obtain = AccessibilityNodeInfo.obtain();
                    c1242v3 = new C1242v3();
                    c1242v3.f32354b = -1;
                    c1242v3.f32355c = -1;
                    c1242v3.f32353a = Obtain;
                    VarHandle.storeStoreFence();
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        AbstractC0561d3.m4335i(Obtain, zM13387o3);
                        r47 = 0;
                    } else {
                        r47 = 0;
                        r47 = 0;
                        extras = Obtain.getExtras();
                        if (extras != null) {
                            int i310 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65);
                            if (zM13387o3) {
                                i3 = 64;
                            } else {
                                i3 = 0;
                            }
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i310 | i3);
                        }
                    }
                    if (i == -1) {
                        parentForAccessibility = viewTreeObserverOnGlobalLayoutListenerC1140sc2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            r15 = (View) parentForAccessibility;
                        } else {
                            r15 = r47;
                        }
                        c1242v3.f32354b = -1;
                        Obtain.setParent(r15);
                    } else {
                        i14VarM6550l = i14Var5.m6550l();
                        if (i14VarM6550l != null) {
                            numValueOf = Integer.valueOf(i14VarM6550l.f21014f);
                        } else {
                            r7 = r47;
                        }
                        if (r7 != 0) {
                            r7 = numValueOf;
                            q32.m9722d("semanticsNode " + i + " has null parent");
                            xy4.m12794w();
                            return null;
                        }
                        iIntValue = r7.intValue();
                        if (iIntValue == viewTreeObserverOnGlobalLayoutListenerC1140sc2.getSemanticsOwner().m7810a().f21014f) {
                            r7 = numValueOf;
                            iIntValue = -1;
                        }
                        r7 = numValueOf;
                        c1242v3.f32354b = iIntValue;
                        Obtain.setParent(viewTreeObserverOnGlobalLayoutListenerC1140sc2, iIntValue);
                    }
                    c1242v3.f32355c = i;
                    Obtain.setSource(viewTreeObserverOnGlobalLayoutListenerC1140sc2, i);
                    Obtain.setBoundsInScreen(viewOnAttachStateChangeListenerC1400zc3.m13483d(k14Var2));
                    kv2Var = ViewOnAttachStateChangeListenerC1400zc.f35937N;
                    jv2Var = viewOnAttachStateChangeListenerC1400zc3.f35947J;
                    ra4Var = viewOnAttachStateChangeListenerC1400zc3.f35966s;
                    resources = viewTreeObserverOnGlobalLayoutListenerC1140sc2.getContext().getResources();
                    c1242v3.m11716e("android.view.View");
                    e14Var = i14Var5.f21012d;
                    lw2Var = e14Var.f17631a;
                    if (lw2Var.m8128c(m14.f24539F)) {
                        c1242v3.m11716e("android.widget.EditText");
                    }
                    if (lw2Var.m8128c(m14.f24535B)) {
                        c1242v3.m11716e("android.widget.TextView");
                    }
                    objM8132g = lw2Var.m8132g(m14.f24576y);
                    r10 = objM8132g;
                    if (objM8132g == null) {
                        r10 = r47;
                    }
                    lq3Var = (lq3) r10;
                    if (lq3Var != null) {
                        b = lq3Var.f24281a;
                        if (i14Var5.m6552n()) {
                            ra4Var2 = ra4Var;
                            b2 = 4;
                            kv2Var2 = kv2Var;
                        } else {
                            ra4Var2 = ra4Var;
                            b2 = 4;
                            kv2Var2 = kv2Var;
                            if (i14Var5.m6548i((4 & 1) != 0 ? !i14Var5.f21010b : false, (4 & 2) == 0).isEmpty()) {
                            }
                        }
                        if (b == b2) {
                            Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(C0995R.string.tab));
                        } else if (b == 2) {
                            Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(C0995R.string.switch_role));
                        } else {
                            strM13861Y = zy5.m13861Y(b);
                            if (b == 5) {
                                c1242v3.m11716e(strM13861Y);
                            } else {
                                c1242v3.m11716e(strM13861Y);
                            }
                        }
                    } else {
                        kv2Var2 = kv2Var;
                        ra4Var2 = ra4Var;
                    }
                    Obtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC1140sc2.getContext().getPackageName());
                    Obtain.setImportantForAccessibility(C0006a5.m88z(i14Var5));
                    if (i2 >= 34) {
                        zM4333g = AbstractC0561d3.m4333g(accessibilityManager);
                    } else {
                        zM4333g = true;
                    }
                    listM6548i = i14Var5.m6548i((4 & 1) != 0 ? !i14Var5.f21010b : false, (4 & 2) == 0);
                    size = listM6548i.size();
                    z = zM4333g;
                    i4 = 0;
                    i5 = 0;
                    while (i5 < size) {
                        List list6 = listM6548i;
                        i14Var3 = (i14) listM6548i.get(i5);
                        int i311 = size;
                        m52VarM13491l = viewOnAttachStateChangeListenerC1400zc3.m13491l();
                        int i312 = i5;
                        i36 = i14Var3.f21014f;
                        if (m52VarM13491l.m8196a(i36)) {
                            abstractC0492bi = viewTreeObserverOnGlobalLayoutListenerC1140sc2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(i14Var3.f21011c);
                            if (i36 != -1) {
                                if (abstractC0492bi != null) {
                                    Obtain.addChild(abstractC0492bi);
                                } else {
                                    k14Var = (k14) viewOnAttachStateChangeListenerC1400zc3.m13491l().m8197b(i36);
                                    if (k14Var != null) {
                                        zM13387o2 = false;
                                    } else {
                                        zM13387o2 = false;
                                    }
                                    if (z) {
                                        Obtain.addChild(viewTreeObserverOnGlobalLayoutListenerC1140sc2, i36);
                                    } else {
                                        Obtain.addChild(viewTreeObserverOnGlobalLayoutListenerC1140sc2, i36);
                                    }
                                }
                                jv2Var.m7295f(i36, i4);
                                i4++;
                            }
                        }
                        i5 = i312 + 1;
                        size = i311;
                        listM6548i = list6;
                    }
                    i6 = viewOnAttachStateChangeListenerC1400zc3.f35958k;
                    accessibilityNodeInfo = c1242v3.f32353a;
                    if (i == i6) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        c1242v3.m11713a(C1131s3.f29845d);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        c1242v3.m11713a(C1131s3.f29844c);
                    }
                    c0875lkM11866y = vd6.m11866y(i14Var5);
                    if (c0875lkM11866y != null) {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc2.getFontFamilyResolver();
                        density = viewTreeObserverOnGlobalLayoutListenerC1140sc2.getDensity();
                        tt2Var = viewOnAttachStateChangeListenerC1400zc3.f35943F;
                        String str9 = c0875lkM11866y.f24092b;
                        list4 = c0875lkM11866y.f24091a;
                        spannableString = new SpannableString(str9);
                        arrayList3 = c0875lkM11866y.f24093c;
                        if (arrayList3 != null) {
                            size12 = arrayList3.size();
                            i29 = 0;
                            while (i29 < size12) {
                                ArrayList arrayList8 = arrayList3;
                                C0838kk c0838kk9 = (C0838kk) arrayList3.get(i29);
                                int i47 = size12;
                                pa4 pa4Var2 = (pa4) c0838kk9.f23186a;
                                int i48 = i29;
                                i30 = c0838kk9.f23187b;
                                i31 = c0838kk9.f23188c;
                                ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc6 = viewOnAttachStateChangeListenerC1400zc3;
                                jMo5689a = pa4Var2.f27478a.mo5689a();
                                lq3 lq3Var5 = lq3Var;
                                Resources resources5 = resources;
                                long j3 = pa4Var2.f27479b;
                                xm1Var = pa4Var2.f27480c;
                                tm1Var = pa4Var2.f27481d;
                                zk4Var = pa4Var2.f27487j;
                                jv2 jv2Var4 = jv2Var;
                                zm2 zm2Var2 = pa4Var2.f27488k;
                                i14 i14Var7 = i14Var5;
                                lw2 lw2Var5 = lw2Var;
                                j = pa4Var2.f27489l;
                                uj4Var = pa4Var2.f27490m;
                                yk4Var = pa4Var2.f27478a;
                                ?? r19 = Obtain;
                                C1242v3 c1242v8 = c1242v3;
                                jMo5689a2 = yk4Var.mo5689a();
                                int i49 = pb0.f27502i;
                                if (!ws4.m12408a(jMo5689a, jMo5689a2)) {
                                    if (jMo5689a != 16) {
                                        fd0 fd0Var2 = new fd0();
                                        fd0Var2.f18920a = jMo5689a;
                                        if (jMo5689a == 16) {
                                            Obtain = Obtain;
                                            r32.m10186a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
                                        }
                                        Obtain = Obtain;
                                        VarHandle.storeStoreFence();
                                        yk4Var = fd0Var2;
                                    } else {
                                        Obtain = Obtain;
                                        yk4Var = ig1.f21365D;
                                    }
                                }
                                Obtain = Obtain;
                                C0006a5.m54J(spannableString, yk4Var.mo5689a(), i30, i31);
                                spannableString3 = spannableString;
                                C0006a5.m55K(spannableString3, j3, density, i30, i31);
                                if (xm1Var == null) {
                                    if (xm1Var == null) {
                                        xm1Var2 = xm1.f34413f;
                                    } else {
                                        xm1Var2 = xm1Var;
                                    }
                                    if (tm1Var != null) {
                                        i32 = tm1Var.f31237a;
                                    } else {
                                        i32 = 0;
                                    }
                                    if (xm1Var2.compareTo(xm1.f34411d) >= 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (i32 == 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        if (z9) {
                                            i33 = 1;
                                        } else if (z10) {
                                            i33 = 2;
                                        } else {
                                            i33 = 0;
                                        }
                                    } else if (z9) {
                                        i33 = 1;
                                    } else if (z10) {
                                        i33 = 2;
                                    } else {
                                        i33 = 0;
                                    }
                                    StyleSpan styleSpan2 = new StyleSpan(i33);
                                    i34 = 33;
                                    spannableString3.setSpan(styleSpan2, i30, i31, 33);
                                } else {
                                    if (xm1Var == null) {
                                        xm1Var2 = xm1.f34413f;
                                    } else {
                                        xm1Var2 = xm1Var;
                                    }
                                    if (tm1Var != null) {
                                        i32 = tm1Var.f31237a;
                                    } else {
                                        i32 = 0;
                                    }
                                    if (xm1Var2.compareTo(xm1.f34411d) >= 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (i32 == 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        if (z9) {
                                            i33 = 1;
                                        } else if (z10) {
                                            i33 = 2;
                                        } else {
                                            i33 = 0;
                                        }
                                    } else if (z9) {
                                        i33 = 1;
                                    } else if (z10) {
                                        i33 = 2;
                                    } else {
                                        i33 = 0;
                                    }
                                    StyleSpan styleSpan3 = new StyleSpan(i33);
                                    i34 = 33;
                                    spannableString3.setSpan(styleSpan3, i30, i31, 33);
                                }
                                if (uj4Var != null) {
                                    i35 = uj4Var.f31941a;
                                    if ((i35 | 1) == i35) {
                                        spannableString3.setSpan(new UnderlineSpan(), i30, i31, i34);
                                    }
                                    if ((i35 | 2) == i35) {
                                        spannableString3.setSpan(new StrikethroughSpan(), i30, i31, i34);
                                    }
                                }
                                if (zk4Var != null) {
                                    spannableString3.setSpan(new ScaleXSpan(zk4Var.f36161a), i30, i31, i34);
                                }
                                C0006a5.m56L(spannableString3, zm2Var2, i30, i31);
                                if (j != 16) {
                                    spannableString3.setSpan(new BackgroundColorSpan(zy5.m13858V(j)), i30, i31, i34);
                                }
                                i29 = i48 + 1;
                                spannableString = spannableString3;
                                Obtain = r19;
                                arrayList3 = arrayList8;
                                size12 = i47;
                                viewOnAttachStateChangeListenerC1400zc3 = viewOnAttachStateChangeListenerC1400zc6;
                                resources = resources5;
                                lq3Var = lq3Var5;
                                jv2Var = jv2Var4;
                                i14Var5 = i14Var7;
                                lw2Var = lw2Var5;
                                c1242v3 = c1242v8;
                            }
                            Obtain = Obtain;
                        }
                        viewOnAttachStateChangeListenerC1400zc = viewOnAttachStateChangeListenerC1400zc3;
                        i14Var = i14Var5;
                        lw2Var2 = lw2Var;
                        jv2Var2 = jv2Var;
                        lq3Var2 = lq3Var;
                        resources2 = resources;
                        r6 = Obtain;
                        C1242v3 c1242v9 = c1242v3;
                        spannableString2 = spannableString;
                        int length4 = str9.length();
                        arrayList4 = v71.f32439a;
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size11 = list4.size();
                            for (i28 = 0; i28 < size11; i28++) {
                                Object obj7 = list4.get(i28);
                                c0838kk5 = (C0838kk) obj7;
                                if (!(c0838kk5.f23186a instanceof nx4)) {
                                }
                            }
                        } else {
                            arrayList5 = arrayList4;
                        }
                        size6 = ((Collection) arrayList5).size();
                        for (i19 = 0; i19 < size6; i19++) {
                            C0838kk c0838kk10 = (C0838kk) arrayList5.get(i19);
                            nx4Var = (nx4) c0838kk10.f23186a;
                            i26 = c0838kk10.f23187b;
                            i27 = c0838kk10.f23188c;
                            if (nx4Var instanceof nx4) {
                                C0670g.m5864c();
                                return r47;
                            }
                            spannableString2.setSpan(new TtsSpan.VerbatimBuilder(nx4Var.f26180a).build(), i26, i27, 33);
                        }
                        int length5 = str9.length();
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size10 = list4.size();
                            for (i25 = 0; i25 < size10; i25++) {
                                Object obj8 = list4.get(i25);
                                c0838kk4 = (C0838kk) obj8;
                                if (!(c0838kk4.f23186a instanceof nv4)) {
                                }
                            }
                        } else {
                            arrayList6 = arrayList4;
                        }
                        size7 = ((Collection) arrayList6).size();
                        for (i20 = 0; i20 < size7; i20++) {
                            C0838kk c0838kk11 = (C0838kk) arrayList6.get(i20);
                            nv4Var = (nv4) c0838kk11.f23186a;
                            int i410 = c0838kk11.f23187b;
                            int i411 = c0838kk11.f23188c;
                            weakHashMap3 = (WeakHashMap) tt2Var.f31428b;
                            uRLSpan2 = weakHashMap3.get(nv4Var);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(nv4Var.f26126a);
                                weakHashMap3.put(nv4Var, uRLSpan2);
                            }
                            spannableString2.setSpan((URLSpan) uRLSpan2, i410, i411, 33);
                        }
                        int length6 = str9.length();
                        if (list4 != null) {
                            arrayList4 = new ArrayList(list4.size());
                            size9 = list4.size();
                            for (i24 = 0; i24 < size9; i24++) {
                                Object obj9 = list4.get(i24);
                                c0838kk3 = (C0838kk) obj9;
                                if (!(c0838kk3.f23186a instanceof jl2)) {
                                }
                            }
                        }
                        size8 = ((Collection) arrayList4).size();
                        for (i21 = 0; i21 < size8; i21++) {
                            c0838kk = (C0838kk) arrayList4.get(i21);
                            i22 = c0838kk.f23187b;
                            obj = c0838kk.f23186a;
                            i23 = c0838kk.f23188c;
                            if (i22 != i23) {
                                jl2Var = (jl2) obj;
                                if (jl2Var instanceof il2) {
                                    il2Var = (il2) obj;
                                    c0838kk2 = new C0838kk(i22, i23, il2Var);
                                    weakHashMap2 = (WeakHashMap) tt2Var.f31429c;
                                    uRLSpan = weakHashMap2.get(c0838kk2);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(il2Var.f21529a);
                                        weakHashMap2.put(c0838kk2, uRLSpan);
                                    }
                                    spannableString2.setSpan((URLSpan) uRLSpan, i22, i23, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) tt2Var.f31430d;
                                    obj2 = weakHashMap.get(c0838kk);
                                    if (obj2 == null) {
                                        obj3 = obj2;
                                        lh0 lh0Var2 = new lh0();
                                        lh0Var2.f24029a = jl2Var;
                                        VarHandle.storeStoreFence();
                                        weakHashMap.put(c0838kk, lh0Var2);
                                        obj3 = lh0Var2;
                                    }
                                    obj3 = obj2;
                                    spannableString2.setSpan((ClickableSpan) obj3, i22, i23, 33);
                                }
                            }
                        }
                        c1242v4 = c1242v9;
                        r0 = (SpannableString) ViewOnAttachStateChangeListenerC1400zc.m13469J(spannableString2);
                    } else {
                        viewOnAttachStateChangeListenerC1400zc = viewOnAttachStateChangeListenerC1400zc3;
                        i14Var = i14Var5;
                        lw2Var2 = lw2Var;
                        jv2Var2 = jv2Var;
                        wf2Var2 = wf2Var2;
                        lq3Var2 = lq3Var;
                        resources2 = resources;
                        r6 = Obtain;
                        r0 = r47;
                        c1242v4 = c1242v3;
                    }
                    c1242v4.f32353a.setText(r0);
                    p14Var = m14.f24547N;
                    lw2Var3 = lw2Var2;
                    if (lw2Var3.m8128c(p14Var)) {
                        r6.setContentInvalid(true);
                        objM8132g5 = lw2Var3.m8132g(p14Var);
                        if (objM8132g5 == null) {
                            r1 = objM8132g5;
                            r1 = r47;
                        }
                        r1 = objM8132g5;
                        r6.setError((CharSequence) r1);
                    }
                    Resources resources6 = resources2;
                    i14Var2 = i14Var;
                    c1242v4.f32353a.setStateDescription(vd6.m11865x(i14Var2, resources6));
                    r6.setCheckable(vd6.m11864w(i14Var2));
                    ln4Var = (ln4) lb5.m7906O(e14Var, m14.f24544K);
                    if (ln4Var != null) {
                        if (ln4Var == ln4.f24214a) {
                            c1242v4.f32353a.setChecked(true);
                        } else if (ln4Var == ln4.f24215b) {
                            c1242v4.f32353a.setChecked(false);
                        }
                    }
                    bool = (Boolean) lb5.m7906O(e14Var, m14.f24543J);
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (lq3Var2 == null) {
                            lq3Var3 = lq3Var2;
                            i7 = 4;
                        } else {
                            lq3Var3 = lq3Var2;
                            i7 = 4;
                            if (lq3Var3.f24281a == 4) {
                                r6.setSelected(zBooleanValue2);
                            }
                        }
                        c1242v4.f32353a.setChecked(zBooleanValue2);
                    } else {
                        lq3Var3 = lq3Var2;
                        i7 = 4;
                    }
                    if (e14Var.f17633c) {
                        list = (List) lb5.m7906O(e14Var, m14.f24552a);
                        if (list != null) {
                            r4 = (String) hb0.m6301M0(list);
                        } else {
                            r4 = r47;
                        }
                        r6.setContentDescription(r4);
                    } else {
                        list = (List) lb5.m7906O(e14Var, m14.f24552a);
                        if (list != null) {
                            r4 = (String) hb0.m6301M0(list);
                        } else {
                            r4 = r47;
                        }
                        r6.setContentDescription(r4);
                    }
                    str = (String) lb5.m7906O(e14Var, m14.f24577z);
                    if (str != null) {
                        i14VarM6550l3 = i14Var2;
                        while (true) {
                            if (i14VarM6550l3 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            e14Var2 = i14VarM6550l3.f21012d;
                            p14Var5 = C0638f5.f18755i;
                            if (e14Var2.f17631a.m8128c(p14Var5)) {
                                zBooleanValue = ((Boolean) e14Var2.m4900c(p14Var5)).booleanValue();
                                break;
                            }
                            i14VarM6550l3 = i14VarM6550l3.m6550l();
                        }
                        if (zBooleanValue) {
                            r6.setViewIdResourceName(str);
                        }
                    }
                    if (((ju4) lb5.m7906O(e14Var, m14.f24559h)) != null) {
                        z2 = true;
                        c1242v4.f32353a.setHeading(true);
                    } else {
                        z2 = true;
                    }
                    if (((ju4) lb5.m7906O(e14Var, m14.f24560i)) != null) {
                        r6.setTextEntryKey(z2);
                    }
                    i8 = i;
                    if (i8 != -1) {
                        iM7293d3 = jv2Var2.m7293d(i14Var2.f21014f);
                        if (iM7293d3 != -1) {
                            r6.setDrawingOrder(iM7293d3);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    r6.setPassword(lw2Var3.m8128c(m14.f24546M));
                    Object objM7906O2 = lb5.m7906O(e14Var, m14.f24549P);
                    bool2 = Boolean.TRUE;
                    r6.setEditable(z62.m13387o(objM7906O2, bool2));
                    num = (Integer) lb5.m7906O(e14Var, m14.f24550Q);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    r6.setMaxTextLength(iIntValue2);
                    r6.setEnabled(vd6.m11857p(i14Var2));
                    p14Var2 = m14.f24563l;
                    r6.setFocusable(lw2Var3.m8128c(p14Var2));
                    if (r6.isFocusable()) {
                        r6.setFocused(((Boolean) e14Var.m4900c(p14Var2)).booleanValue());
                        zIsFocused = r6.isFocused();
                        accessibilityNodeInfo3 = c1242v4.f32353a;
                        if (zIsFocused) {
                            accessibilityNodeInfo3.addAction(2);
                            ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc7 = viewOnAttachStateChangeListenerC1400zc;
                            viewOnAttachStateChangeListenerC1400zc7.f35959l = i8;
                            viewOnAttachStateChangeListenerC1400zc2 = viewOnAttachStateChangeListenerC1400zc7;
                        } else {
                            r8 = viewOnAttachStateChangeListenerC1400zc;
                            z3 = true;
                            accessibilityNodeInfo3.addAction(1);
                        }
                        c1242v4.f32353a.setVisibleToUser(C0006a5.m87y(i14Var2) ^ z3);
                        if (i14Var2.m6552n()) {
                            i14VarM6550l2 = i14Var2.m6550l();
                        } else {
                            i14VarM6550l2 = i14Var2;
                        }
                        if (i14VarM6550l2.m6551m().m7171g()) {
                            z4 = false;
                            c1242v4.f32353a.setVisibleToUser(false);
                        } else {
                            z4 = false;
                        }
                        if (((jm2) lb5.m7906O(e14Var, m14.f24562k)) != null) {
                            r6.setLiveRegion(2);
                        }
                        c1242v4.f32353a.setClickable(z4);
                        c1353y2 = (C1353y2) lb5.m7906O(e14Var, d14.f16705b);
                        if (c1353y2 != null) {
                            boolean zM13387o6 = z62.m13387o(lb5.m7906O(e14Var, m14.f24543J), bool2);
                            if (lq3Var3 == null) {
                            }
                            if (z7) {
                                z8 = true;
                            } else {
                                z8 = true;
                            }
                            c1242v4.f32353a.setClickable(z8);
                            if (vd6.m11857p(i14Var2)) {
                                c1242v4.m11713a(new C1131s3(16, c1353y2.f34817a));
                            }
                        }
                        c1242v4.f32353a.setLongClickable(false);
                        c1353y3 = (C1353y2) lb5.m7906O(e14Var, d14.f16706c);
                        if (c1353y3 != null) {
                            c1242v4.f32353a.setLongClickable(true);
                            if (vd6.m11857p(i14Var2)) {
                                c1242v4.m11713a(new C1131s3(32, c1353y3.f34817a));
                            }
                        }
                        c1353y4 = (C1353y2) lb5.m7906O(e14Var, d14.f16720q);
                        if (c1353y4 != null) {
                            c1242v4.m11713a(new C1131s3(16384, c1353y4.f34817a));
                        }
                        if (vd6.m11857p(i14Var2)) {
                            c1353y10 = (C1353y2) lb5.m7906O(e14Var, d14.f16714k);
                            if (c1353y10 != null) {
                                c1242v4.m11713a(new C1131s3(2097152, c1353y10.f34817a));
                            }
                            c1353y11 = (C1353y2) lb5.m7906O(e14Var, d14.f16719p);
                            if (c1353y11 != null) {
                                c1242v4.m11713a(new C1131s3(R.id.accessibilityActionImeEnter, c1353y11.f34817a));
                            }
                            c1353y12 = (C1353y2) lb5.m7906O(e14Var, d14.f16721r);
                            if (c1353y12 != null) {
                                c1242v4.m11713a(new C1131s3(65536, c1353y12.f34817a));
                            }
                            c1353y13 = (C1353y2) lb5.m7906O(e14Var, d14.f16722s);
                            if (c1353y13 != null) {
                                primaryClipDescription = ((z32) viewTreeObserverOnGlobalLayoutListenerC1140sc2.getClipboardManager()).m13305A().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    c1242v4.m11713a(new C1131s3(32768, c1353y13.f34817a));
                                }
                            }
                        }
                        strM13470m = ViewOnAttachStateChangeListenerC1400zc.m13470m(i14Var2);
                        if (strM13470m != null) {
                            r6.setTextSelection(r8.m13490k(i14Var2), r8.m13489j(i14Var2));
                            c1353y9 = (C1353y2) lb5.m7906O(e14Var, d14.f16713j);
                            if (c1353y9 != null) {
                                r13 = c1353y9.f34817a;
                            } else {
                                r13 = r47;
                            }
                            c1242v4.m11713a(new C1131s3(131072, r13));
                            c1242v4.f32353a.addAction(256);
                            c1242v4.f32353a.addAction(512);
                            c1242v4.f32353a.setMovementGranularities(11);
                            list3 = (List) lb5.m7906O(e14Var, m14.f24552a);
                            if (list3 != null) {
                                M12295v = wf2Var2.m12295v();
                                while (true) {
                                    if (M12295v == 0) {
                                        M12295v = r47;
                                        break;
                                    }
                                    e14VarM12297x2 = M12295v.m12297x();
                                    if (e14VarM12297x2 == null) {
                                    }
                                    M12295v = M12295v.m12295v();
                                }
                                if (M12295v == 0) {
                                    c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                                } else {
                                    e14VarM12297x = M12295v.m12297x();
                                    if (e14VarM12297x != null) {
                                        objM8132g4 = e14VarM12297x.f17631a.m8132g(m14.f24563l);
                                        if (objM8132g4 == null) {
                                            r5 = objM8132g4;
                                            r5 = r47;
                                        }
                                        r5 = objM8132g4;
                                        zM13387o = z62.m13387o(r5, Boolean.TRUE);
                                    } else {
                                        zM13387o = false;
                                    }
                                    if (zM13387o) {
                                        c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                                    }
                                }
                            } else {
                                M12295v = wf2Var2.m12295v();
                                while (true) {
                                    if (M12295v == 0) {
                                        M12295v = r47;
                                        break;
                                    }
                                    e14VarM12297x2 = M12295v.m12297x();
                                    if (e14VarM12297x2 == null) {
                                    }
                                    M12295v = M12295v.m12295v();
                                }
                                if (M12295v == 0) {
                                    c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                                } else {
                                    e14VarM12297x = M12295v.m12297x();
                                    if (e14VarM12297x != null) {
                                        objM8132g4 = e14VarM12297x.f17631a.m8132g(m14.f24563l);
                                        if (objM8132g4 == null) {
                                            r5 = objM8132g4;
                                            r5 = r47;
                                        }
                                        r5 = objM8132g4;
                                        zM13387o = z62.m13387o(r5, Boolean.TRUE);
                                    } else {
                                        zM13387o = false;
                                    }
                                    if (zM13387o) {
                                        c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceM11715d = c1242v4.m11715d();
                        if (charSequenceM11715d != null) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (lw2Var3.m8128c(m14.f24577z)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (lw2Var3.m8128c(m14.f24551R)) {
                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        r6.setAvailableExtraData(arrayList);
                        bh3Var = (bh3) lb5.m7906O(e14Var, m14.f24554c);
                        if (bh3Var != null) {
                            f = bh3Var.f15271a;
                            ma0 ma0Var3 = bh3Var.f15272b;
                            f2 = ma0Var3.f24778a;
                            f3 = ma0Var3.f24779b;
                            p14Var4 = d14.f16712i;
                            if (lw2Var3.m8128c(p14Var4)) {
                                c1242v4.m11716e("android.widget.SeekBar");
                            } else {
                                c1242v4.m11716e("android.widget.ProgressBar");
                            }
                            if (bh3Var != bh3.f15270c) {
                                r6.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, f2, f3, f));
                            }
                            if (lw2Var3.m8128c(p14Var4)) {
                                if (f3 < f2) {
                                    f4 = f2;
                                } else {
                                    f4 = f3;
                                }
                                if (f < f4) {
                                    c1242v4.m11713a(C1131s3.f29846e);
                                }
                                if (f2 > f3) {
                                    f2 = f3;
                                }
                                if (f > f2) {
                                    c1242v4.m11713a(C1131s3.f29847f);
                                }
                            }
                        }
                        if (vd6.m11857p(i14Var2)) {
                            c1242v4.m11713a(new C1131s3(R.id.accessibilityActionSetProgress, c1353y8.f34817a));
                        }
                        zt5.m13764J(c1242v4, i14Var2);
                        zt5.m13765K(c1242v4, i14Var2);
                        ww3Var = (ww3) lb5.m7906O(e14Var, m14.f24573v);
                        C1353y2 c1353y16 = (C1353y2) lb5.m7906O(e14Var, d14.f16707d);
                        if (ww3Var != null) {
                            objM8132g2 = i14Var2.m6549k().f17631a.m8132g(m14.f24557f);
                            if (objM8132g2 == null) {
                                r11 = objM8132g2;
                                r11 = r47;
                            }
                            if (r11 == 0) {
                                objM8132g3 = i14Var2.m6549k().f17631a.m8132g(m14.f24556e);
                                r12 = objM8132g3;
                                if (objM8132g3 == null) {
                                    r12 = r47;
                                }
                                if (r12 == 0) {
                                    c1242v4.m11716e("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) ww3Var.f33801b.invoke()).floatValue() > 0.0f) {
                                c1242v4.f32353a.setScrollable(true);
                            }
                            if (vd6.m11857p(i14Var2)) {
                                if (ViewOnAttachStateChangeListenerC1400zc.m13473s(ww3Var)) {
                                    c1242v4.m11713a(C1131s3.f29846e);
                                    wf2Var = wf2Var2;
                                    if (wf2Var.f33293A == df2.f17012b) {
                                        c1131s4 = C1131s3.f29849h;
                                    } else {
                                        c1131s4 = C1131s3.f29851j;
                                    }
                                    c1242v4.m11713a(c1131s4);
                                } else {
                                    wf2Var = wf2Var2;
                                }
                                if (ViewOnAttachStateChangeListenerC1400zc.m13472r(ww3Var)) {
                                    c1242v4.m11713a(C1131s3.f29847f);
                                    if (wf2Var.f33293A == df2.f17012b) {
                                        c1131s3 = C1131s3.f29851j;
                                    } else {
                                        c1131s3 = C1131s3.f29849h;
                                    }
                                    c1242v4.m11713a(c1131s3);
                                }
                            }
                        }
                        ww3Var2 = (ww3) lb5.m7906O(e14Var, m14.f24574w);
                        if (ww3Var2 != null) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        zc6.m13529n(c1242v4, i14Var2);
                        c1242v4.f32353a.setPaneTitle((CharSequence) lb5.m7906O(e14Var, m14.f24555d));
                        if (vd6.m11857p(i14Var2)) {
                            c1353y5 = (C1353y2) lb5.m7906O(e14Var, d14.f16723t);
                            if (c1353y5 != null) {
                                c1242v4.m11713a(new C1131s3(262144, c1353y5.f34817a));
                            }
                            c1353y6 = (C1353y2) lb5.m7906O(e14Var, d14.f16724u);
                            if (c1353y6 != null) {
                                c1242v4.m11713a(new C1131s3(524288, c1353y6.f34817a));
                            }
                            c1353y7 = (C1353y2) lb5.m7906O(e14Var, d14.f16725v);
                            if (c1353y7 != null) {
                                c1242v4.m11713a(new C1131s3(1048576, c1353y7.f34817a));
                            }
                            p14Var3 = d14.f16727x;
                            if (lw2Var3.m8128c(p14Var3)) {
                                list2 = (List) e14Var.m4900c(p14Var3);
                                size2 = list2.size();
                                kv2Var3 = kv2Var2;
                                i9 = kv2Var3.f23538b;
                                if (size2 < i9) {
                                    C1077qn.m9989o(c75.m3878j("Can't have more than ", i9, " custom actions for one widget"));
                                    return r47;
                                }
                                ra4Var3 = new ra4(0);
                                yv2VarM9357a = p23.m9357a();
                                ra4Var4 = ra4Var2;
                                if (qq2.m10024h(ra4Var4.f29119a, ra4Var4.f29121c, i8) >= 0) {
                                    z6 = z5;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    yv2Var = (yv2) sc6.m10680u(ra4Var4, i8);
                                    kv2Var4 = new kv2();
                                    iArr = kv2Var3.f23537a;
                                    i11 = kv2Var3.f23538b;
                                    for (i12 = 0; i12 < i11; i12++) {
                                        kv2Var4.m7633a(iArr[i12]);
                                    }
                                    arrayList2 = new ArrayList();
                                    size4 = list2.size();
                                    i13 = 0;
                                    while (i13 < size4) {
                                        fs0Var = (fs0) list2.get(i13);
                                        int i412 = size4;
                                        str3 = fs0Var.f19247a;
                                        if (yv2Var.m13260d(str3) >= 0) {
                                            iM13260d = yv2Var.m13260d(str3);
                                            if (iM13260d >= 0) {
                                                kx5.m7737u0("There is no key " + ((Object) str3) + " in the map");
                                                throw r47;
                                            }
                                            i15 = yv2Var.f35549c[iM13260d];
                                            ra4Var3.m10256c(i15, str3);
                                            yv2VarM9357a.m13263g(i15, str3);
                                            iArr2 = kv2Var4.f23537a;
                                            i16 = kv2Var4.f23538b;
                                            i17 = 0;
                                            while (true) {
                                                if (i17 < i16) {
                                                    i17 = -1;
                                                    break;
                                                }
                                                i18 = i16;
                                                if (i15 == iArr2[i17]) {
                                                    break;
                                                    break;
                                                }
                                                i17++;
                                                i16 = i18;
                                            }
                                            if (i17 >= 0) {
                                                kv2Var4.m7637e(i17);
                                            }
                                            c1242v4.m11713a(new C1131s3(i15, str3));
                                        } else {
                                            arrayList2.add(fs0Var);
                                        }
                                        i13++;
                                        size4 = i412;
                                        yv2Var = yv2Var;
                                    }
                                    size5 = arrayList2.size();
                                    for (i14 = 0; i14 < size5; i14++) {
                                        fs0 fs0Var6 = (fs0) arrayList2.get(i14);
                                        int iM7635c5 = kv2Var4.m7635c(i14);
                                        String str10 = fs0Var6.f19247a;
                                        ra4Var3.m10256c(iM7635c5, str10);
                                        yv2VarM9357a.m13263g(iM7635c5, str10);
                                        c1242v4.m11713a(new C1131s3(iM7635c5, str10));
                                    }
                                } else {
                                    size3 = list2.size();
                                    for (i10 = 0; i10 < size3; i10++) {
                                        fs0 fs0Var7 = (fs0) list2.get(i10);
                                        int iM7635c6 = kv2Var3.m7635c(i10);
                                        String str11 = fs0Var7.f19247a;
                                        ra4Var3.m10256c(iM7635c6, str11);
                                        yv2VarM9357a.m13263g(iM7635c6, str11);
                                        c1242v4.m11713a(new C1131s3(iM7635c6, str11));
                                    }
                                }
                                r8.f35965r.m10256c(i8, ra4Var3);
                                ra4Var4.m10256c(i8, yv2VarM9357a);
                            }
                        }
                        c1242v4.f32353a.setScreenReaderFocusable(vd6.m11820D(i14Var2, resources6));
                        iM7293d = r8.f35939B.m7293d(i8);
                        if (iM7293d != -1) {
                            abstractC0492biM13856T2 = zy5.m13856T(viewTreeObserverOnGlobalLayoutListenerC1140sc2.getAndroidViewsHandler$ui(), iM7293d);
                            accessibilityNodeInfo2 = c1242v4.f32353a;
                            if (abstractC0492biM13856T2 != null) {
                                accessibilityNodeInfo2.setTraversalBefore(abstractC0492biM13856T2);
                                viewTreeObserverOnGlobalLayoutListenerC1140sc = viewTreeObserverOnGlobalLayoutListenerC1140sc2;
                            } else {
                                viewTreeObserverOnGlobalLayoutListenerC1140sc = viewTreeObserverOnGlobalLayoutListenerC1140sc2;
                                accessibilityNodeInfo2.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC1140sc, iM7293d);
                            }
                            r8.m13482c(i8, c1242v4, r8.f35941D, r47);
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC1140sc = viewTreeObserverOnGlobalLayoutListenerC1140sc2;
                        }
                        iM7293d2 = r8.f35940C.m7293d(i8);
                        if (iM7293d2 != -1) {
                            c1242v4.f32353a.setTraversalAfter(abstractC0492biM13856T);
                            r8.m13482c(i8, c1242v4, r8.f35942E, null);
                        }
                        str2 = (String) lb5.m7906O(e14Var, C0638f5.f18756j);
                        if (str2 != null) {
                            c1242v4.m11716e(str2);
                        }
                        c1242v5 = c1242v4;
                        r16 = r8;
                    } else {
                        viewOnAttachStateChangeListenerC1400zc2 = viewOnAttachStateChangeListenerC1400zc;
                    }
                    z3 = true;
                    r8 = viewOnAttachStateChangeListenerC1400zc2;
                    c1242v4.f32353a.setVisibleToUser(C0006a5.m87y(i14Var2) ^ z3);
                    if (i14Var2.m6552n()) {
                        i14VarM6550l2 = i14Var2.m6550l();
                    } else {
                        i14VarM6550l2 = i14Var2;
                    }
                    if (i14VarM6550l2.m6551m().m7171g()) {
                        z4 = false;
                        c1242v4.f32353a.setVisibleToUser(false);
                    } else {
                        z4 = false;
                    }
                    if (((jm2) lb5.m7906O(e14Var, m14.f24562k)) != null) {
                        r6.setLiveRegion(2);
                    }
                    c1242v4.f32353a.setClickable(z4);
                    c1353y2 = (C1353y2) lb5.m7906O(e14Var, d14.f16705b);
                    if (c1353y2 != null) {
                        boolean zM13387o7 = z62.m13387o(lb5.m7906O(e14Var, m14.f24543J), bool2);
                        if (lq3Var3 == null) {
                        }
                        if (z7) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        c1242v4.f32353a.setClickable(z8);
                        if (vd6.m11857p(i14Var2)) {
                            c1242v4.m11713a(new C1131s3(16, c1353y2.f34817a));
                        }
                    }
                    c1242v4.f32353a.setLongClickable(false);
                    c1353y3 = (C1353y2) lb5.m7906O(e14Var, d14.f16706c);
                    if (c1353y3 != null) {
                        c1242v4.f32353a.setLongClickable(true);
                        if (vd6.m11857p(i14Var2)) {
                            c1242v4.m11713a(new C1131s3(32, c1353y3.f34817a));
                        }
                    }
                    c1353y4 = (C1353y2) lb5.m7906O(e14Var, d14.f16720q);
                    if (c1353y4 != null) {
                        c1242v4.m11713a(new C1131s3(16384, c1353y4.f34817a));
                    }
                    if (vd6.m11857p(i14Var2)) {
                        c1353y10 = (C1353y2) lb5.m7906O(e14Var, d14.f16714k);
                        if (c1353y10 != null) {
                            c1242v4.m11713a(new C1131s3(2097152, c1353y10.f34817a));
                        }
                        c1353y11 = (C1353y2) lb5.m7906O(e14Var, d14.f16719p);
                        if (c1353y11 != null) {
                            c1242v4.m11713a(new C1131s3(R.id.accessibilityActionImeEnter, c1353y11.f34817a));
                        }
                        c1353y12 = (C1353y2) lb5.m7906O(e14Var, d14.f16721r);
                        if (c1353y12 != null) {
                            c1242v4.m11713a(new C1131s3(65536, c1353y12.f34817a));
                        }
                        c1353y13 = (C1353y2) lb5.m7906O(e14Var, d14.f16722s);
                        if (c1353y13 != null) {
                            primaryClipDescription = ((z32) viewTreeObserverOnGlobalLayoutListenerC1140sc2.getClipboardManager()).m13305A().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                c1242v4.m11713a(new C1131s3(32768, c1353y13.f34817a));
                            }
                        }
                    }
                    strM13470m = ViewOnAttachStateChangeListenerC1400zc.m13470m(i14Var2);
                    if (strM13470m != null) {
                        r6.setTextSelection(r8.m13490k(i14Var2), r8.m13489j(i14Var2));
                        c1353y9 = (C1353y2) lb5.m7906O(e14Var, d14.f16713j);
                        if (c1353y9 != null) {
                            r13 = c1353y9.f34817a;
                        } else {
                            r13 = r47;
                        }
                        c1242v4.m11713a(new C1131s3(131072, r13));
                        c1242v4.f32353a.addAction(256);
                        c1242v4.f32353a.addAction(512);
                        c1242v4.f32353a.setMovementGranularities(11);
                        list3 = (List) lb5.m7906O(e14Var, m14.f24552a);
                        if (list3 != null) {
                            M12295v = wf2Var2.m12295v();
                            while (true) {
                                if (M12295v == 0) {
                                    M12295v = r47;
                                    break;
                                }
                                e14VarM12297x2 = M12295v.m12297x();
                                if (e14VarM12297x2 == null) {
                                }
                                M12295v = M12295v.m12295v();
                            }
                            if (M12295v == 0) {
                                c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                            } else {
                                e14VarM12297x = M12295v.m12297x();
                                if (e14VarM12297x != null) {
                                    objM8132g4 = e14VarM12297x.f17631a.m8132g(m14.f24563l);
                                    if (objM8132g4 == null) {
                                        r5 = objM8132g4;
                                        r5 = r47;
                                    }
                                    r5 = objM8132g4;
                                    zM13387o = z62.m13387o(r5, Boolean.TRUE);
                                } else {
                                    zM13387o = false;
                                }
                                if (zM13387o) {
                                    c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                                }
                            }
                        } else {
                            M12295v = wf2Var2.m12295v();
                            while (true) {
                                if (M12295v == 0) {
                                    M12295v = r47;
                                    break;
                                }
                                e14VarM12297x2 = M12295v.m12297x();
                                if (e14VarM12297x2 == null) {
                                }
                                M12295v = M12295v.m12295v();
                            }
                            if (M12295v == 0) {
                                c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                            } else {
                                e14VarM12297x = M12295v.m12297x();
                                if (e14VarM12297x != null) {
                                    objM8132g4 = e14VarM12297x.f17631a.m8132g(m14.f24563l);
                                    if (objM8132g4 == null) {
                                        r5 = objM8132g4;
                                        r5 = r47;
                                    }
                                    r5 = objM8132g4;
                                    zM13387o = z62.m13387o(r5, Boolean.TRUE);
                                } else {
                                    zM13387o = false;
                                }
                                if (zM13387o) {
                                    c1242v4.f32353a.setMovementGranularities(r6.getMovementGranularities() | 20);
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceM11715d = c1242v4.m11715d();
                    if (charSequenceM11715d != null) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (lw2Var3.m8128c(m14.f24577z)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (lw2Var3.m8128c(m14.f24551R)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    r6.setAvailableExtraData(arrayList);
                    bh3Var = (bh3) lb5.m7906O(e14Var, m14.f24554c);
                    if (bh3Var != null) {
                        f = bh3Var.f15271a;
                        ma0 ma0Var4 = bh3Var.f15272b;
                        f2 = ma0Var4.f24778a;
                        f3 = ma0Var4.f24779b;
                        p14Var4 = d14.f16712i;
                        if (lw2Var3.m8128c(p14Var4)) {
                            c1242v4.m11716e("android.widget.SeekBar");
                        } else {
                            c1242v4.m11716e("android.widget.ProgressBar");
                        }
                        if (bh3Var != bh3.f15270c) {
                            r6.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, f2, f3, f));
                        }
                        if (lw2Var3.m8128c(p14Var4)) {
                            if (f3 < f2) {
                                f4 = f2;
                            } else {
                                f4 = f3;
                            }
                            if (f < f4) {
                                c1242v4.m11713a(C1131s3.f29846e);
                            }
                            if (f2 > f3) {
                                f2 = f3;
                            }
                            if (f > f2) {
                                c1242v4.m11713a(C1131s3.f29847f);
                            }
                        }
                    }
                    if (vd6.m11857p(i14Var2)) {
                        c1242v4.m11713a(new C1131s3(R.id.accessibilityActionSetProgress, c1353y8.f34817a));
                    }
                    zt5.m13764J(c1242v4, i14Var2);
                    zt5.m13765K(c1242v4, i14Var2);
                    ww3Var = (ww3) lb5.m7906O(e14Var, m14.f24573v);
                    C1353y2 c1353y17 = (C1353y2) lb5.m7906O(e14Var, d14.f16707d);
                    if (ww3Var != null) {
                        objM8132g2 = i14Var2.m6549k().f17631a.m8132g(m14.f24557f);
                        if (objM8132g2 == null) {
                            r11 = objM8132g2;
                            r11 = r47;
                        }
                        if (r11 == 0) {
                            objM8132g3 = i14Var2.m6549k().f17631a.m8132g(m14.f24556e);
                            r12 = objM8132g3;
                            if (objM8132g3 == null) {
                                r12 = r47;
                            }
                            if (r12 == 0) {
                                c1242v4.m11716e("android.widget.HorizontalScrollView");
                            }
                        }
                        if (((Number) ww3Var.f33801b.invoke()).floatValue() > 0.0f) {
                            c1242v4.f32353a.setScrollable(true);
                        }
                        if (vd6.m11857p(i14Var2)) {
                            if (ViewOnAttachStateChangeListenerC1400zc.m13473s(ww3Var)) {
                                c1242v4.m11713a(C1131s3.f29846e);
                                wf2Var = wf2Var2;
                                if (wf2Var.f33293A == df2.f17012b) {
                                    c1131s4 = C1131s3.f29849h;
                                } else {
                                    c1131s4 = C1131s3.f29851j;
                                }
                                c1242v4.m11713a(c1131s4);
                            } else {
                                wf2Var = wf2Var2;
                            }
                            if (ViewOnAttachStateChangeListenerC1400zc.m13472r(ww3Var)) {
                                c1242v4.m11713a(C1131s3.f29847f);
                                if (wf2Var.f33293A == df2.f17012b) {
                                    c1131s3 = C1131s3.f29851j;
                                } else {
                                    c1131s3 = C1131s3.f29849h;
                                }
                                c1242v4.m11713a(c1131s3);
                            }
                        }
                    }
                    ww3Var2 = (ww3) lb5.m7906O(e14Var, m14.f24574w);
                    if (ww3Var2 != null) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    zc6.m13529n(c1242v4, i14Var2);
                    c1242v4.f32353a.setPaneTitle((CharSequence) lb5.m7906O(e14Var, m14.f24555d));
                    if (vd6.m11857p(i14Var2)) {
                        c1353y5 = (C1353y2) lb5.m7906O(e14Var, d14.f16723t);
                        if (c1353y5 != null) {
                            c1242v4.m11713a(new C1131s3(262144, c1353y5.f34817a));
                        }
                        c1353y6 = (C1353y2) lb5.m7906O(e14Var, d14.f16724u);
                        if (c1353y6 != null) {
                            c1242v4.m11713a(new C1131s3(524288, c1353y6.f34817a));
                        }
                        c1353y7 = (C1353y2) lb5.m7906O(e14Var, d14.f16725v);
                        if (c1353y7 != null) {
                            c1242v4.m11713a(new C1131s3(1048576, c1353y7.f34817a));
                        }
                        p14Var3 = d14.f16727x;
                        if (lw2Var3.m8128c(p14Var3)) {
                            list2 = (List) e14Var.m4900c(p14Var3);
                            size2 = list2.size();
                            kv2Var3 = kv2Var2;
                            i9 = kv2Var3.f23538b;
                            if (size2 < i9) {
                                C1077qn.m9989o(c75.m3878j("Can't have more than ", i9, " custom actions for one widget"));
                                return r47;
                            }
                            ra4Var3 = new ra4(0);
                            yv2VarM9357a = p23.m9357a();
                            ra4Var4 = ra4Var2;
                            if (qq2.m10024h(ra4Var4.f29119a, ra4Var4.f29121c, i8) >= 0) {
                                z6 = z5;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                yv2Var = (yv2) sc6.m10680u(ra4Var4, i8);
                                kv2Var4 = new kv2();
                                iArr = kv2Var3.f23537a;
                                i11 = kv2Var3.f23538b;
                                while (i12 < i11) {
                                    kv2Var4.m7633a(iArr[i12]);
                                }
                                arrayList2 = new ArrayList();
                                size4 = list2.size();
                                i13 = 0;
                                while (i13 < size4) {
                                    fs0Var = (fs0) list2.get(i13);
                                    int i413 = size4;
                                    str3 = fs0Var.f19247a;
                                    if (yv2Var.m13260d(str3) >= 0) {
                                        iM13260d = yv2Var.m13260d(str3);
                                        if (iM13260d >= 0) {
                                            kx5.m7737u0("There is no key " + ((Object) str3) + " in the map");
                                            throw r47;
                                        }
                                        i15 = yv2Var.f35549c[iM13260d];
                                        ra4Var3.m10256c(i15, str3);
                                        yv2VarM9357a.m13263g(i15, str3);
                                        iArr2 = kv2Var4.f23537a;
                                        i16 = kv2Var4.f23538b;
                                        i17 = 0;
                                        while (true) {
                                            if (i17 < i16) {
                                                i17 = -1;
                                                break;
                                            }
                                            i18 = i16;
                                            if (i15 == iArr2[i17]) {
                                                break;
                                                break;
                                            }
                                            i17++;
                                            i16 = i18;
                                        }
                                        if (i17 >= 0) {
                                            kv2Var4.m7637e(i17);
                                        }
                                        c1242v4.m11713a(new C1131s3(i15, str3));
                                    } else {
                                        arrayList2.add(fs0Var);
                                    }
                                    i13++;
                                    size4 = i413;
                                    yv2Var = yv2Var;
                                }
                                size5 = arrayList2.size();
                                while (i14 < size5) {
                                    fs0 fs0Var8 = (fs0) arrayList2.get(i14);
                                    int iM7635c7 = kv2Var4.m7635c(i14);
                                    String str12 = fs0Var8.f19247a;
                                    ra4Var3.m10256c(iM7635c7, str12);
                                    yv2VarM9357a.m13263g(iM7635c7, str12);
                                    c1242v4.m11713a(new C1131s3(iM7635c7, str12));
                                }
                            } else {
                                size3 = list2.size();
                                while (i10 < size3) {
                                    fs0 fs0Var9 = (fs0) list2.get(i10);
                                    int iM7635c8 = kv2Var3.m7635c(i10);
                                    String str13 = fs0Var9.f19247a;
                                    ra4Var3.m10256c(iM7635c8, str13);
                                    yv2VarM9357a.m13263g(iM7635c8, str13);
                                    c1242v4.m11713a(new C1131s3(iM7635c8, str13));
                                }
                            }
                            r8.f35965r.m10256c(i8, ra4Var3);
                            ra4Var4.m10256c(i8, yv2VarM9357a);
                        }
                    }
                    c1242v4.f32353a.setScreenReaderFocusable(vd6.m11820D(i14Var2, resources6));
                    iM7293d = r8.f35939B.m7293d(i8);
                    if (iM7293d != -1) {
                        abstractC0492biM13856T2 = zy5.m13856T(viewTreeObserverOnGlobalLayoutListenerC1140sc2.getAndroidViewsHandler$ui(), iM7293d);
                        accessibilityNodeInfo2 = c1242v4.f32353a;
                        if (abstractC0492biM13856T2 != null) {
                            accessibilityNodeInfo2.setTraversalBefore(abstractC0492biM13856T2);
                            viewTreeObserverOnGlobalLayoutListenerC1140sc = viewTreeObserverOnGlobalLayoutListenerC1140sc2;
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC1140sc = viewTreeObserverOnGlobalLayoutListenerC1140sc2;
                            accessibilityNodeInfo2.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC1140sc, iM7293d);
                        }
                        r8.m13482c(i8, c1242v4, r8.f35941D, r47);
                    } else {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc = viewTreeObserverOnGlobalLayoutListenerC1140sc2;
                    }
                    iM7293d2 = r8.f35940C.m7293d(i8);
                    if (iM7293d2 != -1) {
                        c1242v4.f32353a.setTraversalAfter(abstractC0492biM13856T);
                        r8.m13482c(i8, c1242v4, r8.f35942E, null);
                    }
                    str2 = (String) lb5.m7906O(e14Var, C0638f5.f18756j);
                    if (str2 != null) {
                        c1242v4.m11716e(str2);
                    }
                    c1242v5 = c1242v4;
                    r16 = r8;
                } else {
                    r16 = viewOnAttachStateChangeListenerC1400zc3;
                    i8 = i;
                    c1242v5 = null;
                }
            }
        }
        if (r16.f35962o) {
            if (i8 == r16.f35958k) {
                r16.f35960m = c1242v5;
            }
            if (i8 == r16.f35959l) {
                r16.f35961n = c1242v5;
            }
        }
        return c1242v5;
    }
}
