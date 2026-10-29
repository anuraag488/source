package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vn5 extends rl6 {

    /* JADX INFO: renamed from: h */
    public String f32750h;

    /* JADX INFO: renamed from: i */
    public HashSet f32751i;

    /* JADX INFO: renamed from: j */
    public C0805jo f32752j;

    /* JADX INFO: renamed from: k */
    public Long f32753k;

    /* JADX INFO: renamed from: l */
    public Long f32754l;

    /* JADX WARN: Code duplicated, block: B:102:0x023a A[LOOP:20: B:85:0x01ec->B:102:0x023a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x026a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0274  */
    /* JADX WARN: Code duplicated, block: B:123:0x027f  */
    /* JADX WARN: Code duplicated, block: B:125:0x028a  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b8 A[Catch: all -> 0x02d3, SQLiteException -> 0x02d5, LOOP:11: B:131:0x02b8->B:568:?, LOOP_START, TryCatch #4 {SQLiteException -> 0x02d5, blocks: (B:129:0x02b2, B:131:0x02b8, B:133:0x02c9, B:139:0x02d7, B:142:0x02ec), top: B:478:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02c9 A[Catch: all -> 0x02d3, SQLiteException -> 0x02d5, TryCatch #4 {SQLiteException -> 0x02d5, blocks: (B:129:0x02b2, B:131:0x02b8, B:133:0x02c9, B:139:0x02d7, B:142:0x02ec), top: B:478:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02ec A[Catch: all -> 0x02d3, SQLiteException -> 0x02d5, TRY_ENTER, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02d5, blocks: (B:129:0x02b2, B:131:0x02b8, B:133:0x02c9, B:139:0x02d7, B:142:0x02ec), top: B:478:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0329  */
    /* JADX WARN: Code duplicated, block: B:162:0x0337  */
    /* JADX WARN: Code duplicated, block: B:164:0x034e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0453  */
    /* JADX WARN: Code duplicated, block: B:194:0x0464  */
    /* JADX WARN: Code duplicated, block: B:196:0x0484  */
    /* JADX WARN: Code duplicated, block: B:202:0x049b  */
    /* JADX WARN: Code duplicated, block: B:206:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:211:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:223:0x051b  */
    /* JADX WARN: Code duplicated, block: B:226:0x0524  */
    /* JADX WARN: Code duplicated, block: B:228:0x0530  */
    /* JADX WARN: Code duplicated, block: B:230:0x0550  */
    /* JADX WARN: Code duplicated, block: B:231:0x0554  */
    /* JADX WARN: Code duplicated, block: B:236:0x056d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x058c  */
    /* JADX WARN: Code duplicated, block: B:249:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:252:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:255:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:262:0x060f  */
    /* JADX WARN: Code duplicated, block: B:265:0x0623  */
    /* JADX WARN: Code duplicated, block: B:271:0x0656  */
    /* JADX WARN: Code duplicated, block: B:275:0x0697  */
    /* JADX WARN: Code duplicated, block: B:282:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:288:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:299:0x06f9 A[LOOP:3: B:276:0x0699->B:299:0x06f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:315:0x072a  */
    /* JADX WARN: Code duplicated, block: B:320:0x0735  */
    /* JADX WARN: Code duplicated, block: B:322:0x0739  */
    /* JADX WARN: Code duplicated, block: B:326:0x074b  */
    /* JADX WARN: Code duplicated, block: B:332:0x0778  */
    /* JADX WARN: Code duplicated, block: B:334:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:336:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:339:0x07bb A[LOOP:5: B:330:0x0772->B:339:0x07bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:343:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:346:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:349:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:352:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:354:0x080c  */
    /* JADX WARN: Code duplicated, block: B:358:0x0847  */
    /* JADX WARN: Code duplicated, block: B:365:0x086f  */
    /* JADX WARN: Code duplicated, block: B:371:0x0880  */
    /* JADX WARN: Code duplicated, block: B:382:0x08ad A[LOOP:7: B:359:0x0849->B:382:0x08ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:400:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:404:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:406:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:410:0x0904  */
    /* JADX WARN: Code duplicated, block: B:414:0x0923  */
    /* JADX WARN: Code duplicated, block: B:417:0x0934  */
    /* JADX WARN: Code duplicated, block: B:419:0x094b  */
    /* JADX WARN: Code duplicated, block: B:421:0x0957  */
    /* JADX WARN: Code duplicated, block: B:423:0x0962  */
    /* JADX WARN: Code duplicated, block: B:425:0x0989  */
    /* JADX WARN: Code duplicated, block: B:428:0x0993  */
    /* JADX WARN: Code duplicated, block: B:441:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:442:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a18 A[PHI: r16 r20 r21
  0x0a18: PHI (r16v2 java.util.Map) = (r16v3 java.util.Map), (r16v4 java.util.Map) binds: [B:445:0x0a16, B:443:0x0a06] A[DONT_GENERATE, DONT_INLINE]
  0x0a18: PHI (r20v9 x64) = (r20v10 x64), (r2v41 x64) binds: [B:445:0x0a16, B:443:0x0a06] A[DONT_GENERATE, DONT_INLINE]
  0x0a18: PHI (r21v8 java.util.Iterator) = (r21v9 java.util.Iterator), (r3v56 java.util.Iterator) binds: [B:445:0x0a16, B:443:0x0a06] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:464:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:467:0x0acb  */
    /* JADX WARN: Code duplicated, block: B:536:0x0631 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0648 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x061d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x061d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x06f4 A[EDGE_INSN: B:542:0x06f4->B:298:0x06f4 BREAK  A[LOOP:3: B:276:0x0699->B:299:0x06f9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x0767 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x075d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x07c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x07ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x08a8 A[EDGE_INSN: B:553:0x08a8->B:381:0x08a8 BREAK  A[LOOP:7: B:359:0x0849->B:382:0x08ad], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x0916 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a1d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a10 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x09ea A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0a9d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0a3b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x04a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x04df A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x05ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0354 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x0236 A[EDGE_INSN: B:604:0x0236->B:101:0x0236 BREAK  A[LOOP:20: B:85:0x01ec->B:102:0x023a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0188  */
    /* JADX WARN: Code duplicated, block: B:67:0x018f  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cb A[Catch: all -> 0x01d7, SQLiteException -> 0x01da, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x01da, blocks: (B:72:0x01c5, B:74:0x01cb, B:83:0x01e5), top: B:474:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5 A[Catch: all -> 0x01d7, SQLiteException -> 0x01da, TRY_ENTER, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x01da, blocks: (B:72:0x01c5, B:74:0x01cb, B:83:0x01e5), top: B:474:0x01c5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v206 */
    /* JADX WARN: Type inference failed for: r0v207 */
    /* JADX WARN: Type inference failed for: r0v31, types: [x64] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v20, types: [x64] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [oa6] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24, types: [oa6] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v29 */
    /* JADX WARN: Type inference failed for: r18v30 */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r18v32 */
    /* JADX WARN: Type inference failed for: r18v34 */
    /* JADX WARN: Type inference failed for: r18v35 */
    /* JADX WARN: Type inference failed for: r18v36 */
    /* JADX WARN: Type inference failed for: r18v37 */
    /* JADX WARN: Type inference failed for: r18v38, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v42 */
    /* JADX WARN: Type inference failed for: r18v43 */
    /* JADX WARN: Type inference failed for: r18v44 */
    /* JADX WARN: Type inference failed for: r18v45 */
    /* JADX WARN: Type inference failed for: r18v46 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r3v69, types: [x66] */
    /* JADX WARN: Type inference failed for: r3v83, types: [x66] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r42v10 */
    /* JADX WARN: Type inference failed for: r42v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v12 */
    /* JADX WARN: Type inference failed for: r42v13 */
    /* JADX WARN: Type inference failed for: r42v14 */
    /* JADX WARN: Type inference failed for: r42v15 */
    /* JADX WARN: Type inference failed for: r42v16, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v17 */
    /* JADX WARN: Type inference failed for: r42v18 */
    /* JADX WARN: Type inference failed for: r42v19 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v20 */
    /* JADX WARN: Type inference failed for: r42v21 */
    /* JADX WARN: Type inference failed for: r42v22 */
    /* JADX WARN: Type inference failed for: r42v23 */
    /* JADX WARN: Type inference failed for: r42v24 */
    /* JADX WARN: Type inference failed for: r42v25 */
    /* JADX WARN: Type inference failed for: r42v26 */
    /* JADX WARN: Type inference failed for: r42v27 */
    /* JADX WARN: Type inference failed for: r42v28 */
    /* JADX WARN: Type inference failed for: r42v29 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v30 */
    /* JADX WARN: Type inference failed for: r42v31 */
    /* JADX WARN: Type inference failed for: r42v32 */
    /* JADX WARN: Type inference failed for: r42v33 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v5 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v7 */
    /* JADX WARN: Type inference failed for: r42v8 */
    /* JADX WARN: Type inference failed for: r42v9 */
    /* JADX WARN: Type inference failed for: r4v31, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v67, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v68, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: y */
    public final ArrayList m11941y(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        boolean z2;
        boolean z3;
        String str2;
        Map map;
        Object obj;
        ?? r5;
        Cursor cursorQuery;
        ?? r17;
        String str3;
        Object obj2;
        ?? r21;
        Map map2;
        String str4;
        qm6 qm6Var;
        Map map3;
        Map map4;
        Map map5;
        String str5;
        cb6 cb6Var;
        BitSet bitSet;
        BitSet bitSet2;
        C0805jo c0805jo;
        cb6 cb6Var2;
        C0805jo c0805jo2;
        List<f46> list3;
        long jLongValue;
        Integer numValueOf;
        int i;
        boolean z4;
        Iterator it;
        fb6 fb6Var;
        Long lValueOf;
        ar5 ar5VarM9952f0;
        String str6;
        ?? c0805jo3;
        ?? r7;
        Cursor cursorRawQuery;
        ?? r0;
        C0805jo c0805jo4;
        Iterator it2;
        Integer num;
        cb6 cb6Var3;
        List list4;
        ?? r18;
        Iterator it3;
        qm6 qm6Var2;
        Integer numValueOf2;
        List arrayList;
        String str7;
        ArrayList arrayList2;
        ar5 ar5VarM9952f1;
        oa6 oa6Var;
        String str8;
        ContentValues contentValues;
        Iterator it4;
        x64 x64Var;
        String strM9482q;
        Map map6;
        Iterator it5;
        Iterator it6;
        x64 x64Var2;
        Integer num2;
        int iIntValue;
        Iterator it7;
        boolean zM5760b;
        x64 x64Var3;
        Map map7;
        u46 u46Var;
        Integer numValueOf3;
        fn5 fn5Var;
        int i2;
        Integer numValueOf4;
        oa6 oa6Var2;
        String str9;
        C0805jo c0805jo5;
        Cursor cursor;
        oa6 oa6Var3;
        String str10;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        g76 g76Var;
        ?? c0805jo6;
        m96 m96VarM5912b;
        fs5 fs5VarM3191e0;
        long j;
        String strM8247r;
        Map map8;
        int iIntValue2;
        Iterator it8;
        boolean zM5759a;
        Map map9;
        g76 g76Var2;
        Integer num3;
        fn5 fn5Var2;
        int iM5511p;
        ur6 ur6Var;
        boolean z5;
        String str11;
        C0805jo c0805jo7;
        ?? r8;
        String str12;
        ?? r2;
        ?? r42;
        ?? r43;
        ?? Query;
        ?? r44;
        ?? r45;
        ?? r46;
        ?? r47;
        Integer numValueOf6;
        List list6;
        ?? r48;
        List arrayList4;
        C0805jo c0805jo8;
        int i3;
        ?? r6;
        Object obj3;
        ?? r9;
        ?? r19;
        ?? r110;
        List arrayList5;
        oa6 oa6Var4 = (oa6) this.f36084a;
        qm6 qm6Var3 = this.f19870f;
        y42.m12851X(str);
        y42.m12854a0(list);
        y42.m12854a0(list2);
        this.f32750h = str;
        this.f32751i = new HashSet();
        this.f32752j = new C0805jo();
        this.f32753k = l;
        this.f32754l = l2;
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((m96) it9.next()).m8247r())) {
                z2 = true;
                break;
            }
        }
        fn6.m5761a();
        boolean zM9225E = oa6Var4.f26512d.m9225E(this.f32750h, e56.f17728F0);
        fn6.m5761a();
        boolean zM9225E2 = oa6Var4.f26512d.m9225E(this.f32750h, e56.f17726E0);
        if (z2) {
            ar5 ar5VarM9952f2 = qm6Var3.m9952f0();
            String str13 = this.f32750h;
            ar5VarM9952f2.m10368u();
            ar5VarM9952f2.mo5038t();
            y42.m12851X(str13);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                ar5VarM9952f2.m3197l0().update("events", contentValues2, "app_id = ?", new String[]{str13});
            } catch (SQLiteException e) {
                ((oa6) ar5VarM9952f2.f36084a).mo9019b().f16835j.m12506c("Error resetting session-scoped event counts. appId", d76.m4401y(str13), e);
            }
        }
        Map map10 = Collections.EMPTY_MAP;
        String str14 = "Failed to merge filter. appId";
        Object objM4401y = "Database error querying filters. appId";
        String str15 = "audience_id";
        try {
            try {
                try {
                    if (zM9225E2 && zM9225E) {
                        ar5 ar5VarM9952f3 = qm6Var3.m9952f0();
                        oa6 oa6Var5 = (oa6) ar5VarM9952f3.f36084a;
                        String str16 = this.f32750h;
                        y42.m12851X(str16);
                        z3 = z2;
                        C0805jo c0805jo9 = new C0805jo();
                        try {
                            ?? Query2 = ar5VarM9952f3.m3197l0().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str16}, null, null, null);
                            try {
                                try {
                                    if (Query2.moveToFirst()) {
                                        str2 = "data";
                                        Query2 = Query2;
                                        ?? r111 = "event_filters";
                                        while (true) {
                                            try {
                                                try {
                                                    f46 f46Var = (f46) ((c46) q76.m9777k0(f46.m5507A(), Query2.getBlob(1))).m11056e();
                                                    if (f46Var.m5516u()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query2.getInt(0));
                                                        List list7 = (List) c0805jo9.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            c0805jo9.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(f46Var);
                                                        r111 = Query2;
                                                    } else {
                                                        r111 = Query2;
                                                    }
                                                } catch (IOException e2) {
                                                    r111 = Query2;
                                                    oa6Var5.mo9019b().f16835j.m12506c("Failed to merge filter. appId", d76.m4401y(str16), e2);
                                                }
                                                try {
                                                    if (!r111.moveToNext()) {
                                                        break;
                                                    }
                                                    Query2 = r111;
                                                    r111 = r111;
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    r110 = r111;
                                                    r9 = r110;
                                                    try {
                                                        oa6Var5.mo9019b().f16835j.m12506c("Database error querying filters. appId", d76.m4401y(str16), e);
                                                        map10 = Collections.EMPTY_MAP;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        map = map10;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r19 = r111;
                                                    r9 = r19;
                                                    if (r9 != 0) {
                                                        r9.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                r110 = Query2;
                                                r9 = r110;
                                                oa6Var5.mo9019b().f16835j.m12506c("Database error querying filters. appId", d76.m4401y(str16), e);
                                                map10 = Collections.EMPTY_MAP;
                                                if (r9 != 0) {
                                                    r9.close();
                                                }
                                                map = map10;
                                                ar5 ar5VarM9952f4 = qm6Var3.m9952f0();
                                                obj = (oa6) ar5VarM9952f4.f36084a;
                                                r5 = this.f32750h;
                                                ar5VarM9952f4.m10368u();
                                                ar5VarM9952f4.mo5038t();
                                                y42.m12851X(r5);
                                                cursorQuery = ar5VarM9952f4.m3197l0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    c0805jo8 = new C0805jo();
                                                    r17 = obj;
                                                    r21 = r5;
                                                    while (true) {
                                                        try {
                                                            i3 = cursorQuery.getInt(0);
                                                            try {
                                                                cb6 cb6Var4 = (cb6) ((bb6) q76.m9777k0(cb6.m3954w(), cursorQuery.getBlob(1))).m11056e();
                                                                Object objValueOf = Integer.valueOf(i3);
                                                                c0805jo8.put(objValueOf, cb6Var4);
                                                                str3 = str14;
                                                                obj2 = objM4401y;
                                                                obj3 = objValueOf;
                                                                r6 = r21;
                                                            } catch (IOException e5) {
                                                                x66 x66Var = r17.mo9019b().f16835j;
                                                                str3 = str14;
                                                                str14 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objM4401y;
                                                                try {
                                                                    objM4401y = d76.m4401y(r21);
                                                                    Integer numValueOf8 = Integer.valueOf(i3);
                                                                    x66Var.m12507d("Failed to merge filter results. appId, audienceId, error", objM4401y, numValueOf8, e5);
                                                                    obj3 = x66Var;
                                                                    r6 = numValueOf8;
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    r21 = r21;
                                                                    r17.mo9019b().f16835j.m12506c("Database error querying filter results. appId", d76.m4401y(r21), e);
                                                                    Map map11 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map11;
                                                                    if (map2.isEmpty()) {
                                                                        str5 = "audience_id";
                                                                        qm6Var = qm6Var3;
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z3) {
                                                                            String str17 = this.f32750h;
                                                                            ar5VarM9952f0 = qm6Var3.m9952f0();
                                                                            str6 = this.f32750h;
                                                                            ar5VarM9952f0.m10368u();
                                                                            ar5VarM9952f0.mo5038t();
                                                                            y42.m12851X(str6);
                                                                            c0805jo3 = new C0805jo();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = ar5VarM9952f0.m3197l0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) c0805jo3.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    c0805jo3.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            c0805jo3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e7) {
                                                                                        e = e7;
                                                                                        ((oa6) ar5VarM9952f0.f36084a).mo9019b().f16835j.m12506c("Database error querying scoped filters. appId", d76.m4401y(str6), e);
                                                                                        c0805jo3 = Collections.EMPTY_MAP;
                                                                                        r0 = c0805jo3;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        y42.m12851X(str17);
                                                                                        c0805jo4 = new C0805jo();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                cb6Var3 = (cb6) map2.get(num);
                                                                                                list4 = (List) r0.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r18 = r0;
                                                                                                it3 = it2;
                                                                                                qm6Var2 = qm6Var3;
                                                                                                c0805jo4.put(num, cb6Var3);
                                                                                                r0 = r18;
                                                                                                it2 = it3;
                                                                                                str15 = str15;
                                                                                                qm6Var3 = qm6Var2;
                                                                                            }
                                                                                        }
                                                                                        str4 = str15;
                                                                                        qm6Var = qm6Var3;
                                                                                        map3 = c0805jo4;
                                                                                        map5 = map3;
                                                                                        map4 = map2;
                                                                                        for (Integer num4 : hashSet) {
                                                                                            num4.getClass();
                                                                                            cb6Var = (cb6) map5.get(num4);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            c0805jo = new C0805jo();
                                                                                            if (cb6Var != null) {
                                                                                                for (j96 j96Var : cb6Var.m3966s()) {
                                                                                                    if (j96Var.m7056o()) {
                                                                                                        cb6 cb6Var5 = cb6Var;
                                                                                                        Integer numValueOf9 = Integer.valueOf(j96Var.m7057p());
                                                                                                        if (j96Var.m7058q()) {
                                                                                                            lValueOf = Long.valueOf(j96Var.m7059r());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        c0805jo.put(numValueOf9, lValueOf);
                                                                                                        cb6Var = cb6Var5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            cb6Var2 = cb6Var;
                                                                                            c0805jo2 = new C0805jo();
                                                                                            if (cb6Var2 != null) {
                                                                                                it = cb6Var2.m3968u().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    fb6Var = (fb6) it.next();
                                                                                                    if (!fb6Var.m5631o()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map12 = map5;
                                                                                            if (cb6Var2 != null) {
                                                                                                i = 0;
                                                                                                while (i < cb6Var2.m3963p() * 64) {
                                                                                                    if (q76.m9775e0((li6) cb6Var2.m3962o(), i)) {
                                                                                                        z4 = zM9225E;
                                                                                                        oa6Var4.mo9019b().f16831L.m12506c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                                                                                        bitSet2.set(i);
                                                                                                        if (q76.m9775e0((li6) cb6Var2.m3964q(), i)) {
                                                                                                            bitSet.set(i);
                                                                                                        }
                                                                                                        i++;
                                                                                                        zM9225E = z4;
                                                                                                    } else {
                                                                                                        z4 = zM9225E;
                                                                                                    }
                                                                                                    c0805jo.remove(Integer.valueOf(i));
                                                                                                    i++;
                                                                                                    zM9225E = z4;
                                                                                                }
                                                                                            }
                                                                                            boolean z6 = zM9225E;
                                                                                            cb6 cb6Var6 = (cb6) map4.get(num4);
                                                                                            if (zM9225E2) {
                                                                                                for (f46 f46Var2 : list3) {
                                                                                                    int iM5511p2 = f46Var2.m5511p();
                                                                                                    Integer num5 = num4;
                                                                                                    jLongValue = this.f32754l.longValue() / 1000;
                                                                                                    if (f46Var2.m5519x()) {
                                                                                                        jLongValue = this.f32753k.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iM5511p2);
                                                                                                    if (c0805jo.containsKey(numValueOf)) {
                                                                                                        c0805jo.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (c0805jo2.containsKey(numValueOf)) {
                                                                                                        c0805jo2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num4 = num5;
                                                                                                }
                                                                                            }
                                                                                            this.f32752j.put(num4, new ur6(this, this.f32750h, cb6Var6, bitSet, bitSet2, c0805jo, c0805jo2));
                                                                                            obj2 = obj2;
                                                                                            map = map;
                                                                                            str2 = str2;
                                                                                            zM9225E = z6;
                                                                                            map5 = map12;
                                                                                            map4 = map4;
                                                                                            zM9225E2 = zM9225E2;
                                                                                        }
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str18 = str3;
                                                                                        ?? r11 = obj2;
                                                                                        if (!list.isEmpty()) {
                                                                                            g76Var = new g76(this);
                                                                                            c0805jo6 = new C0805jo();
                                                                                            for (m96 m96Var : list) {
                                                                                                m96VarM5912b = g76Var.m5912b(this.f32750h, m96Var);
                                                                                                if (m96VarM5912b != null) {
                                                                                                    fs5VarM3191e0 = qm6Var.m9952f0().m3191e0(this.f32750h, m96Var, m96VarM5912b.m8247r());
                                                                                                    qm6Var.m9952f0().m3183V("events", fs5VarM3191e0);
                                                                                                    if (z) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        j = fs5VarM3191e0.f19256c;
                                                                                                        strM8247r = m96VarM5912b.m8247r();
                                                                                                        map8 = (Map) c0805jo6.get(strM8247r);
                                                                                                        if (map8 == null) {
                                                                                                            ar5 ar5VarM9952f5 = qm6Var.m9952f0();
                                                                                                            oa6 oa6Var6 = (oa6) ar5VarM9952f5.f36084a;
                                                                                                            str11 = this.f32750h;
                                                                                                            ar5VarM9952f5.m10368u();
                                                                                                            ar5VarM9952f5.mo5038t();
                                                                                                            y42.m12851X(str11);
                                                                                                            y42.m12851X(strM8247r);
                                                                                                            c0805jo7 = new C0805jo();
                                                                                                            try {
                                                                                                                Query = ar5VarM9952f5.m3197l0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM8247r}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (Query.moveToFirst()) {
                                                                                                                            str12 = str11;
                                                                                                                            Query = Query;
                                                                                                                            r46 = list;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        f46 f46Var3 = (f46) ((c46) q76.m9777k0(f46.m5507A(), Query.getBlob(1))).m11056e();
                                                                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                                                        list6 = (List) c0805jo7.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            r46 = Query;
                                                                                                                                            try {
                                                                                                                                                arrayList4 = new ArrayList();
                                                                                                                                                c0805jo7.put(numValueOf6, arrayList4);
                                                                                                                                                r48 = r46;
                                                                                                                                            } catch (SQLiteException e8) {
                                                                                                                                                e = e8;
                                                                                                                                                r45 = r46;
                                                                                                                                                r2 = r45;
                                                                                                                                                r42 = r45;
                                                                                                                                                try {
                                                                                                                                                    oa6Var6.mo9019b().f16835j.m12506c(r11, d76.m4401y(str12), e);
                                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                                    r43 = r42;
                                                                                                                                                    if (r2 != 0) {
                                                                                                                                                        r2.close();
                                                                                                                                                        r43 = r42;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th3) {
                                                                                                                                                    th = th3;
                                                                                                                                                    r8 = r2;
                                                                                                                                                    if (r8 != 0) {
                                                                                                                                                        r8.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th4) {
                                                                                                                                                th = th4;
                                                                                                                                                r44 = r46;
                                                                                                                                                r8 = r44;
                                                                                                                                                if (r8 != 0) {
                                                                                                                                                    r8.close();
                                                                                                                                                }
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            r48 = Query;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(f46Var3);
                                                                                                                                        r47 = r48;
                                                                                                                                    } catch (IOException e9) {
                                                                                                                                        r47 = Query;
                                                                                                                                        oa6Var6.mo9019b().f16835j.m12506c(str18, d76.m4401y(str12), e9);
                                                                                                                                    }
                                                                                                                                    if (!r47.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    Query = r47;
                                                                                                                                    r46 = r47;
                                                                                                                                } catch (SQLiteException e10) {
                                                                                                                                    e = e10;
                                                                                                                                    r45 = Query;
                                                                                                                                    r2 = r45;
                                                                                                                                    r42 = r45;
                                                                                                                                    oa6Var6.mo9019b().f16835j.m12506c(r11, d76.m4401y(str12), e);
                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                    r43 = r42;
                                                                                                                                    if (r2 != 0) {
                                                                                                                                        r2.close();
                                                                                                                                        r43 = r42;
                                                                                                                                    }
                                                                                                                                    c0805jo6.put(strM8247r, map8);
                                                                                                                                    list = r43;
                                                                                                                                    for (Integer num6 : map8.keySet()) {
                                                                                                                                        iIntValue2 = num6.intValue();
                                                                                                                                        if (this.f32751i.contains(num6)) {
                                                                                                                                            oa6Var4.mo9019b().f16831L.m12505b(num6, "Skipping failed audience ID");
                                                                                                                                        } else {
                                                                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                                                                            zM5759a = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it8.hasNext()) {
                                                                                                                                                    map9 = map8;
                                                                                                                                                    g76Var2 = g76Var;
                                                                                                                                                    num3 = num6;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                f46 f46Var4 = (f46) it8.next();
                                                                                                                                                g76Var2 = g76Var;
                                                                                                                                                num3 = num6;
                                                                                                                                                map9 = map8;
                                                                                                                                                fn5Var2 = new fn5(this, this.f32750h, iIntValue2, f46Var4, (byte) 0);
                                                                                                                                                Long l3 = this.f32753k;
                                                                                                                                                Long l4 = this.f32754l;
                                                                                                                                                iM5511p = f46Var4.m5511p();
                                                                                                                                                ur6Var = (ur6) this.f32752j.get(num3);
                                                                                                                                                if (ur6Var == null) {
                                                                                                                                                    z5 = false;
                                                                                                                                                } else {
                                                                                                                                                    z5 = ur6Var.f32125d.get(iM5511p);
                                                                                                                                                }
                                                                                                                                                zM5759a = fn5Var2.m5759a(l3, l4, m96VarM5912b, j, fs5VarM3191e0, z5);
                                                                                                                                                if (!zM5759a) {
                                                                                                                                                    this.f32751i.add(num3);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                m11942z(num3).m11636a(fn5Var2);
                                                                                                                                                num6 = num3;
                                                                                                                                                map8 = map9;
                                                                                                                                                g76Var = g76Var2;
                                                                                                                                            }
                                                                                                                                            if (!zM5759a) {
                                                                                                                                                this.f32751i.add(num3);
                                                                                                                                            }
                                                                                                                                            g76Var = g76Var2;
                                                                                                                                            map8 = map9;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            r47.close();
                                                                                                                            map8 = c0805jo7;
                                                                                                                            r43 = r47;
                                                                                                                        } else {
                                                                                                                            ?? r49 = Query;
                                                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                                                            r49.close();
                                                                                                                            r43 = r49;
                                                                                                                        }
                                                                                                                    } catch (Throwable th5) {
                                                                                                                        th = th5;
                                                                                                                        r44 = Query;
                                                                                                                    }
                                                                                                                } catch (SQLiteException e11) {
                                                                                                                    e = e11;
                                                                                                                    str12 = str11;
                                                                                                                }
                                                                                                            } catch (SQLiteException e12) {
                                                                                                                e = e12;
                                                                                                                str12 = str11;
                                                                                                                r2 = 0;
                                                                                                                r42 = list;
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                r8 = 0;
                                                                                                            }
                                                                                                            c0805jo6.put(strM8247r, map8);
                                                                                                            list = r43;
                                                                                                        } else {
                                                                                                            list = list;
                                                                                                        }
                                                                                                        while (r18.hasNext()) {
                                                                                                            iIntValue2 = num6.intValue();
                                                                                                            if (this.f32751i.contains(num6)) {
                                                                                                                oa6Var4.mo9019b().f16831L.m12505b(num6, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it8 = ((List) map8.get(num6)).iterator();
                                                                                                                zM5759a = true;
                                                                                                                while (true) {
                                                                                                                    if (!it8.hasNext()) {
                                                                                                                        map9 = map8;
                                                                                                                        g76Var2 = g76Var;
                                                                                                                        num3 = num6;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    f46 f46Var5 = (f46) it8.next();
                                                                                                                    g76Var2 = g76Var;
                                                                                                                    num3 = num6;
                                                                                                                    map9 = map8;
                                                                                                                    fn5Var2 = new fn5(this, this.f32750h, iIntValue2, f46Var5, (byte) 0);
                                                                                                                    Long l5 = this.f32753k;
                                                                                                                    Long l6 = this.f32754l;
                                                                                                                    iM5511p = f46Var5.m5511p();
                                                                                                                    ur6Var = (ur6) this.f32752j.get(num3);
                                                                                                                    if (ur6Var == null) {
                                                                                                                        z5 = false;
                                                                                                                    } else {
                                                                                                                        z5 = ur6Var.f32125d.get(iM5511p);
                                                                                                                    }
                                                                                                                    zM5759a = fn5Var2.m5759a(l5, l6, m96VarM5912b, j, fs5VarM3191e0, z5);
                                                                                                                    if (!zM5759a) {
                                                                                                                        this.f32751i.add(num3);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    m11942z(num3).m11636a(fn5Var2);
                                                                                                                    num6 = num3;
                                                                                                                    map8 = map9;
                                                                                                                    g76Var = g76Var2;
                                                                                                                }
                                                                                                                if (!zM5759a) {
                                                                                                                    this.f32751i.add(num3);
                                                                                                                }
                                                                                                                g76Var = g76Var2;
                                                                                                                map8 = map9;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            C0805jo c0805jo10 = new C0805jo();
                                                                                            it4 = list2.iterator();
                                                                                            x64Var = c0805jo10;
                                                                                            while (it4.hasNext()) {
                                                                                                pb6 pb6Var = (pb6) it4.next();
                                                                                                strM9482q = pb6Var.m9482q();
                                                                                                map6 = (Map) x64Var.get(strM9482q);
                                                                                                if (map6 == null) {
                                                                                                    ar5 ar5VarM9952f6 = qm6Var.m9952f0();
                                                                                                    oa6Var2 = (oa6) ar5VarM9952f6.f36084a;
                                                                                                    str9 = this.f32750h;
                                                                                                    ar5VarM9952f6.m10368u();
                                                                                                    ar5VarM9952f6.mo5038t();
                                                                                                    y42.m12851X(str9);
                                                                                                    y42.m12851X(strM9482q);
                                                                                                    c0805jo5 = new C0805jo();
                                                                                                    try {
                                                                                                        cursorQuery2 = ar5VarM9952f6.m3197l0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM9482q}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                    it5 = it4;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                u46 u46Var2 = (u46) ((q46) q76.m9777k0(u46.m11238w(), cursorQuery2.getBlob(1))).m11056e();
                                                                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                list5 = (List) c0805jo5.get(numValueOf5);
                                                                                                                                if (list5 == null) {
                                                                                                                                    oa6Var3 = oa6Var2;
                                                                                                                                    try {
                                                                                                                                        arrayList3 = new ArrayList();
                                                                                                                                        c0805jo5.put(numValueOf5, arrayList3);
                                                                                                                                    } catch (SQLiteException e13) {
                                                                                                                                        e = e13;
                                                                                                                                        str10 = str9;
                                                                                                                                        cursor = cursorQuery2;
                                                                                                                                        try {
                                                                                                                                            oa6Var3.mo9019b().f16835j.m12506c(r11, d76.m4401y(str10), e);
                                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            x64Var.put(strM9482q, map6);
                                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                                            x64Var2 = x64Var;
                                                                                                                                            while (it6.hasNext()) {
                                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                                if (this.f32751i.contains(num2)) {
                                                                                                                                                    oa6Var4.mo9019b().f16831L.m12505b(num2, "Skipping failed audience ID");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                                zM5760b = true;
                                                                                                                                                x64Var3 = x64Var2;
                                                                                                                                                while (true) {
                                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                                        u46Var = (u46) it7.next();
                                                                                                                                                        map7 = map6;
                                                                                                                                                        if (Log.isLoggable(oa6Var4.mo9019b().m4402A(), 2)) {
                                                                                                                                                            x66 x66Var2 = oa6Var4.mo9019b().f16831L;
                                                                                                                                                            if (u46Var.m11239o()) {
                                                                                                                                                                numValueOf4 = Integer.valueOf(u46Var.m11240p());
                                                                                                                                                            } else {
                                                                                                                                                                numValueOf4 = null;
                                                                                                                                                            }
                                                                                                                                                            x66Var2.m12507d("Evaluating filter. audience, filter, property", num2, numValueOf4, oa6Var4.f26518j.m9368c(u46Var.m11241q()));
                                                                                                                                                            oa6Var4.mo9019b().f16831L.m12505b(qm6Var.m9958i0().m9792b0(u46Var), "Filter definition");
                                                                                                                                                        }
                                                                                                                                                        if (u46Var.m11239o()) {
                                                                                                                                                        }
                                                                                                                                                        x66 x66Var3 = oa6Var4.mo9019b().f16838m;
                                                                                                                                                        z66 z66VarM4401y = d76.m4401y(this.f32750h);
                                                                                                                                                        if (u46Var.m11239o()) {
                                                                                                                                                            numValueOf3 = Integer.valueOf(u46Var.m11240p());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf3 = null;
                                                                                                                                                        }
                                                                                                                                                        x66Var3.m12506c("Invalid property filter ID. appId, id", z66VarM4401y, String.valueOf(numValueOf3));
                                                                                                                                                        this.f32751i.add(num2);
                                                                                                                                                        map6 = map7;
                                                                                                                                                        x64Var2 = x64Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    } else {
                                                                                                                                                        map7 = map6;
                                                                                                                                                        x64Var3 = x64Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    }
                                                                                                                                                    if (!zM5760b) {
                                                                                                                                                        this.f32751i.add(num2);
                                                                                                                                                    }
                                                                                                                                                    map6 = map7;
                                                                                                                                                    x64Var2 = x64Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                    m11942z(num2).m11636a(fn5Var);
                                                                                                                                                    iIntValue = i2;
                                                                                                                                                    map6 = map7;
                                                                                                                                                    x64Var3 = x64Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            it4 = it5;
                                                                                                                                            x64Var = x64Var2;
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    oa6Var3 = oa6Var2;
                                                                                                                                    arrayList3 = list5;
                                                                                                                                }
                                                                                                                                arrayList3.add(u46Var2);
                                                                                                                                str10 = str9;
                                                                                                                            } catch (IOException e14) {
                                                                                                                                oa6Var3 = oa6Var2;
                                                                                                                                str10 = str9;
                                                                                                                                oa6Var3.mo9019b().f16835j.m12506c("Failed to merge filter", d76.m4401y(str10), e14);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                oa6Var2 = oa6Var3;
                                                                                                                                str9 = str10;
                                                                                                                            } catch (SQLiteException e15) {
                                                                                                                                e = e15;
                                                                                                                                cursor = cursorQuery2;
                                                                                                                                oa6Var3.mo9019b().f16835j.m12506c(r11, d76.m4401y(str10), e);
                                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                                if (cursor != null) {
                                                                                                                                    cursor.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e16) {
                                                                                                                            e = e16;
                                                                                                                            oa6Var3 = oa6Var2;
                                                                                                                            str10 = str9;
                                                                                                                            cursor = cursorQuery2;
                                                                                                                            oa6Var3.mo9019b().f16835j.m12506c(r11, d76.m4401y(str10), e);
                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor != null) {
                                                                                                                                cursor.close();
                                                                                                                            }
                                                                                                                            x64Var.put(strM9482q, map6);
                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                            x64Var2 = x64Var;
                                                                                                                            while (it6.hasNext()) {
                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                if (this.f32751i.contains(num2)) {
                                                                                                                                    oa6Var4.mo9019b().f16831L.m12505b(num2, "Skipping failed audience ID");
                                                                                                                                    break;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                zM5760b = true;
                                                                                                                                x64Var3 = x64Var2;
                                                                                                                                while (true) {
                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                        u46Var = (u46) it7.next();
                                                                                                                                        map7 = map6;
                                                                                                                                        if (Log.isLoggable(oa6Var4.mo9019b().m4402A(), 2)) {
                                                                                                                                            x66 x66Var4 = oa6Var4.mo9019b().f16831L;
                                                                                                                                            if (u46Var.m11239o()) {
                                                                                                                                                numValueOf4 = Integer.valueOf(u46Var.m11240p());
                                                                                                                                            } else {
                                                                                                                                                numValueOf4 = null;
                                                                                                                                            }
                                                                                                                                            x66Var4.m12507d("Evaluating filter. audience, filter, property", num2, numValueOf4, oa6Var4.f26518j.m9368c(u46Var.m11241q()));
                                                                                                                                            oa6Var4.mo9019b().f16831L.m12505b(qm6Var.m9958i0().m9792b0(u46Var), "Filter definition");
                                                                                                                                        }
                                                                                                                                        if (u46Var.m11239o()) {
                                                                                                                                        }
                                                                                                                                        x66 x66Var5 = oa6Var4.mo9019b().f16838m;
                                                                                                                                        z66 z66VarM4401y2 = d76.m4401y(this.f32750h);
                                                                                                                                        if (u46Var.m11239o()) {
                                                                                                                                            numValueOf3 = Integer.valueOf(u46Var.m11240p());
                                                                                                                                        } else {
                                                                                                                                            numValueOf3 = null;
                                                                                                                                        }
                                                                                                                                        x66Var5.m12506c("Invalid property filter ID. appId, id", z66VarM4401y2, String.valueOf(numValueOf3));
                                                                                                                                        this.f32751i.add(num2);
                                                                                                                                        map6 = map7;
                                                                                                                                        x64Var2 = x64Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    } else {
                                                                                                                                        map7 = map6;
                                                                                                                                        x64Var3 = x64Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    }
                                                                                                                                    if (!zM5760b) {
                                                                                                                                        this.f32751i.add(num2);
                                                                                                                                    }
                                                                                                                                    map6 = map7;
                                                                                                                                    x64Var2 = x64Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                    m11942z(num2).m11636a(fn5Var);
                                                                                                                                    iIntValue = i2;
                                                                                                                                    map6 = map7;
                                                                                                                                    x64Var3 = x64Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            it4 = it5;
                                                                                                                            x64Var = x64Var2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery2.close();
                                                                                                                    map6 = c0805jo5;
                                                                                                                } else {
                                                                                                                    it5 = it4;
                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            } catch (SQLiteException e17) {
                                                                                                                e = e17;
                                                                                                                it5 = it4;
                                                                                                            }
                                                                                                            x64Var.put(strM9482q, map6);
                                                                                                        } catch (Throwable th8) {
                                                                                                            th = th8;
                                                                                                            cursor = cursorQuery2;
                                                                                                            if (cursor != null) {
                                                                                                                cursor.close();
                                                                                                            }
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (SQLiteException e18) {
                                                                                                        e = e18;
                                                                                                        it5 = it4;
                                                                                                        oa6Var3 = oa6Var2;
                                                                                                        str10 = str9;
                                                                                                        cursor = null;
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                        cursor = null;
                                                                                                    }
                                                                                                } else {
                                                                                                    it5 = it4;
                                                                                                }
                                                                                                it6 = map6.keySet().iterator();
                                                                                                x64Var2 = x64Var;
                                                                                                while (it6.hasNext()) {
                                                                                                    num2 = (Integer) it6.next();
                                                                                                    iIntValue = num2.intValue();
                                                                                                    if (this.f32751i.contains(num2)) {
                                                                                                        oa6Var4.mo9019b().f16831L.m12505b(num2, "Skipping failed audience ID");
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it7 = ((List) map6.get(num2)).iterator();
                                                                                                    zM5760b = true;
                                                                                                    x64Var3 = x64Var2;
                                                                                                    while (true) {
                                                                                                        if (it7.hasNext()) {
                                                                                                            u46Var = (u46) it7.next();
                                                                                                            map7 = map6;
                                                                                                            if (Log.isLoggable(oa6Var4.mo9019b().m4402A(), 2)) {
                                                                                                                x66 x66Var6 = oa6Var4.mo9019b().f16831L;
                                                                                                                if (u46Var.m11239o()) {
                                                                                                                    numValueOf4 = Integer.valueOf(u46Var.m11240p());
                                                                                                                } else {
                                                                                                                    numValueOf4 = null;
                                                                                                                }
                                                                                                                x66Var6.m12507d("Evaluating filter. audience, filter, property", num2, numValueOf4, oa6Var4.f26518j.m9368c(u46Var.m11241q()));
                                                                                                                oa6Var4.mo9019b().f16831L.m12505b(qm6Var.m9958i0().m9792b0(u46Var), "Filter definition");
                                                                                                            }
                                                                                                            if (u46Var.m11239o()) {
                                                                                                            }
                                                                                                            x66 x66Var7 = oa6Var4.mo9019b().f16838m;
                                                                                                            z66 z66VarM4401y3 = d76.m4401y(this.f32750h);
                                                                                                            if (u46Var.m11239o()) {
                                                                                                                numValueOf3 = Integer.valueOf(u46Var.m11240p());
                                                                                                            } else {
                                                                                                                numValueOf3 = null;
                                                                                                            }
                                                                                                            x66Var7.m12506c("Invalid property filter ID. appId, id", z66VarM4401y3, String.valueOf(numValueOf3));
                                                                                                            this.f32751i.add(num2);
                                                                                                            map6 = map7;
                                                                                                            x64Var2 = x64Var3;
                                                                                                            it6 = it6;
                                                                                                        } else {
                                                                                                            map7 = map6;
                                                                                                            x64Var3 = x64Var3;
                                                                                                            it6 = it6;
                                                                                                        }
                                                                                                        if (!zM5760b) {
                                                                                                            this.f32751i.add(num2);
                                                                                                        }
                                                                                                        map6 = map7;
                                                                                                        x64Var2 = x64Var3;
                                                                                                        it6 = it6;
                                                                                                        m11942z(num2).m11636a(fn5Var);
                                                                                                        iIntValue = i2;
                                                                                                        map6 = map7;
                                                                                                        x64Var3 = x64Var3;
                                                                                                        it6 = it6;
                                                                                                    }
                                                                                                }
                                                                                                it4 = it5;
                                                                                                x64Var = x64Var2;
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = new ArrayList();
                                                                                        C0695go<Integer> c0695go = (C0695go) this.f32752j.keySet();
                                                                                        c0695go.removeAll(this.f32751i);
                                                                                        for (Integer num7 : c0695go) {
                                                                                            int iIntValue3 = num7.intValue();
                                                                                            ur6 ur6Var2 = (ur6) this.f32752j.get(num7);
                                                                                            y42.m12854a0(ur6Var2);
                                                                                            r86 r86VarM11637b = ur6Var2.m11637b(iIntValue3);
                                                                                            arrayList2.add(r86VarM11637b);
                                                                                            ar5VarM9952f1 = qm6Var.m9952f0();
                                                                                            oa6Var = (oa6) ar5VarM9952f1.f36084a;
                                                                                            str8 = this.f32750h;
                                                                                            cb6 cb6VarM10239q = r86VarM11637b.m10239q();
                                                                                            ar5VarM9952f1.m10368u();
                                                                                            ar5VarM9952f1.mo5038t();
                                                                                            y42.m12851X(str8);
                                                                                            y42.m12854a0(cb6VarM10239q);
                                                                                            byte[] bArrM5118a = cb6VarM10239q.m5118a();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put("app_id", str8);
                                                                                            contentValues.put(str5, num7);
                                                                                            contentValues.put("current_results", bArrM5118a);
                                                                                            try {
                                                                                                try {
                                                                                                    if (ar5VarM9952f1.m3197l0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        oa6Var.mo9019b().f16835j.m12505b(d76.m4401y(str8), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e19) {
                                                                                                    e = e19;
                                                                                                    oa6Var.mo9019b().f16835j.m12506c("Error storing filter results. appId", d76.m4401y(str8), e);
                                                                                                }
                                                                                            } catch (SQLiteException e20) {
                                                                                                e = e20;
                                                                                            }
                                                                                        }
                                                                                        return arrayList2;
                                                                                    }
                                                                                } catch (SQLiteException e21) {
                                                                                    e = e21;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th10) {
                                                                                    th = th10;
                                                                                    r7 = 0;
                                                                                    if (r7 != 0) {
                                                                                        r7.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r0 = c0805jo3;
                                                                                y42.m12851X(str17);
                                                                                c0805jo4 = new C0805jo();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        cb6Var3 = (cb6) map2.get(num);
                                                                                        list4 = (List) r0.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r18 = r0;
                                                                                        it3 = it2;
                                                                                        qm6Var2 = qm6Var3;
                                                                                        c0805jo4.put(num, cb6Var3);
                                                                                        r0 = r18;
                                                                                        it2 = it3;
                                                                                        str15 = str15;
                                                                                        qm6Var3 = qm6Var2;
                                                                                    }
                                                                                }
                                                                                str4 = str15;
                                                                                qm6Var = qm6Var3;
                                                                                map3 = c0805jo4;
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                r7 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            qm6Var = qm6Var3;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map3;
                                                                        map4 = map2;
                                                                        while (r17.hasNext()) {
                                                                            num4.getClass();
                                                                            cb6Var = (cb6) map5.get(num4);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            c0805jo = new C0805jo();
                                                                            if (cb6Var != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (j96Var.m7056o()) {
                                                                                        cb6 cb6Var7 = cb6Var;
                                                                                        Integer numValueOf10 = Integer.valueOf(j96Var.m7057p());
                                                                                        if (j96Var.m7058q()) {
                                                                                            lValueOf = Long.valueOf(j96Var.m7059r());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        c0805jo.put(numValueOf10, lValueOf);
                                                                                        cb6Var = cb6Var7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            cb6Var2 = cb6Var;
                                                                            c0805jo2 = new C0805jo();
                                                                            if (cb6Var2 != null) {
                                                                                it = cb6Var2.m3968u().iterator();
                                                                                while (it.hasNext()) {
                                                                                    fb6Var = (fb6) it.next();
                                                                                    if (!fb6Var.m5631o()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map13 = map5;
                                                                            if (cb6Var2 != null) {
                                                                                i = 0;
                                                                                while (i < cb6Var2.m3963p() * 64) {
                                                                                    if (q76.m9775e0((li6) cb6Var2.m3962o(), i)) {
                                                                                        z4 = zM9225E;
                                                                                        oa6Var4.mo9019b().f16831L.m12506c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                                                                        bitSet2.set(i);
                                                                                        if (q76.m9775e0((li6) cb6Var2.m3964q(), i)) {
                                                                                            bitSet.set(i);
                                                                                        }
                                                                                        i++;
                                                                                        zM9225E = z4;
                                                                                    } else {
                                                                                        z4 = zM9225E;
                                                                                    }
                                                                                    c0805jo.remove(Integer.valueOf(i));
                                                                                    i++;
                                                                                    zM9225E = z4;
                                                                                }
                                                                            }
                                                                            boolean z7 = zM9225E;
                                                                            cb6 cb6Var8 = (cb6) map4.get(num4);
                                                                            if (zM9225E2) {
                                                                                while (r2.hasNext()) {
                                                                                    int iM5511p3 = f46Var2.m5511p();
                                                                                    Integer num8 = num4;
                                                                                    jLongValue = this.f32754l.longValue() / 1000;
                                                                                    if (f46Var2.m5519x()) {
                                                                                        jLongValue = this.f32753k.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iM5511p3);
                                                                                    if (c0805jo.containsKey(numValueOf)) {
                                                                                        c0805jo.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (c0805jo2.containsKey(numValueOf)) {
                                                                                        c0805jo2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num4 = num8;
                                                                                }
                                                                            }
                                                                            this.f32752j.put(num4, new ur6(this, this.f32750h, cb6Var8, bitSet, bitSet2, c0805jo, c0805jo2));
                                                                            obj2 = obj2;
                                                                            map = map;
                                                                            str2 = str2;
                                                                            zM9225E = z7;
                                                                            map5 = map13;
                                                                            map4 = map4;
                                                                            zM9225E2 = zM9225E2;
                                                                        }
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str19 = str3;
                                                                    ?? r12 = obj2;
                                                                    if (!list.isEmpty()) {
                                                                        g76Var = new g76(this);
                                                                        c0805jo6 = new C0805jo();
                                                                        while (r17.hasNext()) {
                                                                            m96VarM5912b = g76Var.m5912b(this.f32750h, m96Var);
                                                                            if (m96VarM5912b != null) {
                                                                                fs5VarM3191e0 = qm6Var.m9952f0().m3191e0(this.f32750h, m96Var, m96VarM5912b.m8247r());
                                                                                qm6Var.m9952f0().m3183V("events", fs5VarM3191e0);
                                                                                if (z) {
                                                                                    j = fs5VarM3191e0.f19256c;
                                                                                    strM8247r = m96VarM5912b.m8247r();
                                                                                    map8 = (Map) c0805jo6.get(strM8247r);
                                                                                    if (map8 == null) {
                                                                                        ar5 ar5VarM9952f7 = qm6Var.m9952f0();
                                                                                        oa6 oa6Var7 = (oa6) ar5VarM9952f7.f36084a;
                                                                                        str11 = this.f32750h;
                                                                                        ar5VarM9952f7.m10368u();
                                                                                        ar5VarM9952f7.mo5038t();
                                                                                        y42.m12851X(str11);
                                                                                        y42.m12851X(strM8247r);
                                                                                        c0805jo7 = new C0805jo();
                                                                                        Query = ar5VarM9952f7.m3197l0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM8247r}, null, null, null);
                                                                                        if (Query.moveToFirst()) {
                                                                                            str12 = str11;
                                                                                            Query = Query;
                                                                                            r46 = list;
                                                                                            while (true) {
                                                                                                f46 f46Var6 = (f46) ((c46) q76.m9777k0(f46.m5507A(), Query.getBlob(1))).m11056e();
                                                                                                numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                list6 = (List) c0805jo7.get(numValueOf6);
                                                                                                if (list6 == null) {
                                                                                                    r46 = Query;
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    c0805jo7.put(numValueOf6, arrayList4);
                                                                                                    r48 = r46;
                                                                                                } else {
                                                                                                    r48 = Query;
                                                                                                    arrayList4 = list6;
                                                                                                }
                                                                                                arrayList4.add(f46Var6);
                                                                                                r47 = r48;
                                                                                                if (!r47.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                Query = r47;
                                                                                                r46 = r47;
                                                                                            }
                                                                                            r47.close();
                                                                                            map8 = c0805jo7;
                                                                                            r43 = r47;
                                                                                        } else {
                                                                                            ?? r410 = Query;
                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                            r410.close();
                                                                                            r43 = r410;
                                                                                        }
                                                                                        c0805jo6.put(strM8247r, map8);
                                                                                        list = r43;
                                                                                    } else {
                                                                                        list = list;
                                                                                    }
                                                                                    while (r18.hasNext()) {
                                                                                        iIntValue2 = num6.intValue();
                                                                                        if (this.f32751i.contains(num6)) {
                                                                                            oa6Var4.mo9019b().f16831L.m12505b(num6, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                            zM5759a = true;
                                                                                            while (true) {
                                                                                                if (!it8.hasNext()) {
                                                                                                    map9 = map8;
                                                                                                    g76Var2 = g76Var;
                                                                                                    num3 = num6;
                                                                                                    break;
                                                                                                }
                                                                                                f46 f46Var7 = (f46) it8.next();
                                                                                                g76Var2 = g76Var;
                                                                                                num3 = num6;
                                                                                                map9 = map8;
                                                                                                fn5Var2 = new fn5(this, this.f32750h, iIntValue2, f46Var7, (byte) 0);
                                                                                                Long l7 = this.f32753k;
                                                                                                Long l8 = this.f32754l;
                                                                                                iM5511p = f46Var7.m5511p();
                                                                                                ur6Var = (ur6) this.f32752j.get(num3);
                                                                                                if (ur6Var == null) {
                                                                                                    z5 = false;
                                                                                                } else {
                                                                                                    z5 = ur6Var.f32125d.get(iM5511p);
                                                                                                }
                                                                                                zM5759a = fn5Var2.m5759a(l7, l8, m96VarM5912b, j, fs5VarM3191e0, z5);
                                                                                                if (!zM5759a) {
                                                                                                    this.f32751i.add(num3);
                                                                                                    break;
                                                                                                }
                                                                                                m11942z(num3).m11636a(fn5Var2);
                                                                                                num6 = num3;
                                                                                                map8 = map9;
                                                                                                g76Var = g76Var2;
                                                                                            }
                                                                                            if (!zM5759a) {
                                                                                                this.f32751i.add(num3);
                                                                                            }
                                                                                            g76Var = g76Var2;
                                                                                            map8 = map9;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        C0805jo c0805jo11 = new C0805jo();
                                                                        it4 = list2.iterator();
                                                                        x64Var = c0805jo11;
                                                                        while (it4.hasNext()) {
                                                                            pb6 pb6Var2 = (pb6) it4.next();
                                                                            strM9482q = pb6Var2.m9482q();
                                                                            map6 = (Map) x64Var.get(strM9482q);
                                                                            if (map6 == null) {
                                                                                ar5 ar5VarM9952f8 = qm6Var.m9952f0();
                                                                                oa6Var2 = (oa6) ar5VarM9952f8.f36084a;
                                                                                str9 = this.f32750h;
                                                                                ar5VarM9952f8.m10368u();
                                                                                ar5VarM9952f8.mo5038t();
                                                                                y42.m12851X(str9);
                                                                                y42.m12851X(strM9482q);
                                                                                c0805jo5 = new C0805jo();
                                                                                cursorQuery2 = ar5VarM9952f8.m3197l0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM9482q}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    it5 = it4;
                                                                                    while (true) {
                                                                                        u46 u46Var3 = (u46) ((q46) q76.m9777k0(u46.m11238w(), cursorQuery2.getBlob(1))).m11056e();
                                                                                        numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) c0805jo5.get(numValueOf5);
                                                                                        if (list5 == null) {
                                                                                            oa6Var3 = oa6Var2;
                                                                                            arrayList3 = new ArrayList();
                                                                                            c0805jo5.put(numValueOf5, arrayList3);
                                                                                        } else {
                                                                                            oa6Var3 = oa6Var2;
                                                                                            arrayList3 = list5;
                                                                                        }
                                                                                        arrayList3.add(u46Var3);
                                                                                        str10 = str9;
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        oa6Var2 = oa6Var3;
                                                                                        str9 = str10;
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    map6 = c0805jo5;
                                                                                } else {
                                                                                    it5 = it4;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                x64Var.put(strM9482q, map6);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            it6 = map6.keySet().iterator();
                                                                            x64Var2 = x64Var;
                                                                            while (it6.hasNext()) {
                                                                                num2 = (Integer) it6.next();
                                                                                iIntValue = num2.intValue();
                                                                                if (this.f32751i.contains(num2)) {
                                                                                    oa6Var4.mo9019b().f16831L.m12505b(num2, "Skipping failed audience ID");
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                zM5760b = true;
                                                                                x64Var3 = x64Var2;
                                                                                while (true) {
                                                                                    if (it7.hasNext()) {
                                                                                        u46Var = (u46) it7.next();
                                                                                        map7 = map6;
                                                                                        if (Log.isLoggable(oa6Var4.mo9019b().m4402A(), 2)) {
                                                                                            x66 x66Var8 = oa6Var4.mo9019b().f16831L;
                                                                                            if (u46Var.m11239o()) {
                                                                                                numValueOf4 = Integer.valueOf(u46Var.m11240p());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            x66Var8.m12507d("Evaluating filter. audience, filter, property", num2, numValueOf4, oa6Var4.f26518j.m9368c(u46Var.m11241q()));
                                                                                            oa6Var4.mo9019b().f16831L.m12505b(qm6Var.m9958i0().m9792b0(u46Var), "Filter definition");
                                                                                        }
                                                                                        if (u46Var.m11239o()) {
                                                                                        }
                                                                                        x66 x66Var9 = oa6Var4.mo9019b().f16838m;
                                                                                        z66 z66VarM4401y4 = d76.m4401y(this.f32750h);
                                                                                        if (u46Var.m11239o()) {
                                                                                            numValueOf3 = Integer.valueOf(u46Var.m11240p());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        x66Var9.m12506c("Invalid property filter ID. appId, id", z66VarM4401y4, String.valueOf(numValueOf3));
                                                                                        this.f32751i.add(num2);
                                                                                        map6 = map7;
                                                                                        x64Var2 = x64Var3;
                                                                                        it6 = it6;
                                                                                    } else {
                                                                                        map7 = map6;
                                                                                        x64Var3 = x64Var3;
                                                                                        it6 = it6;
                                                                                    }
                                                                                    if (!zM5760b) {
                                                                                        this.f32751i.add(num2);
                                                                                    }
                                                                                    map6 = map7;
                                                                                    x64Var2 = x64Var3;
                                                                                    it6 = it6;
                                                                                    m11942z(num2).m11636a(fn5Var);
                                                                                    iIntValue = i2;
                                                                                    map6 = map7;
                                                                                    x64Var3 = x64Var3;
                                                                                    it6 = it6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                            x64Var = x64Var2;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    C0695go<Integer> c0695go2 = (C0695go) this.f32752j.keySet();
                                                                    c0695go2.removeAll(this.f32751i);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue4 = num7.intValue();
                                                                        ur6 ur6Var3 = (ur6) this.f32752j.get(num7);
                                                                        y42.m12854a0(ur6Var3);
                                                                        r86 r86VarM11637b2 = ur6Var3.m11637b(iIntValue4);
                                                                        arrayList2.add(r86VarM11637b2);
                                                                        ar5VarM9952f1 = qm6Var.m9952f0();
                                                                        oa6Var = (oa6) ar5VarM9952f1.f36084a;
                                                                        str8 = this.f32750h;
                                                                        cb6 cb6VarM10239q2 = r86VarM11637b2.m10239q();
                                                                        ar5VarM9952f1.m10368u();
                                                                        ar5VarM9952f1.mo5038t();
                                                                        y42.m12851X(str8);
                                                                        y42.m12854a0(cb6VarM10239q2);
                                                                        byte[] bArrM5118a2 = cb6VarM10239q2.m5118a();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str8);
                                                                        contentValues.put(str5, num7);
                                                                        contentValues.put("current_results", bArrM5118a2);
                                                                        if (ar5VarM9952f1.m3197l0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            oa6Var.mo9019b().f16835j.m12505b(d76.m4401y(str8), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str14 = str3;
                                                                objM4401y = obj2;
                                                                r21 = r21;
                                                            } catch (SQLiteException e22) {
                                                                e = e22;
                                                                r17.mo9019b().f16835j.m12506c("Database error querying filter results. appId", d76.m4401y(r21), e);
                                                                Map map14 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map14;
                                                            }
                                                        } catch (SQLiteException e23) {
                                                            e = e23;
                                                            r21 = r21;
                                                            r17 = r17;
                                                            str3 = str14;
                                                            obj2 = objM4401y;
                                                            r21 = r21;
                                                            r17.mo9019b().f16835j.m12506c("Database error querying filter results. appId", d76.m4401y(r21), e);
                                                            Map map15 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map15;
                                                            if (map2.isEmpty()) {
                                                                str5 = "audience_id";
                                                                qm6Var = qm6Var3;
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z3) {
                                                                    String str110 = this.f32750h;
                                                                    ar5VarM9952f0 = qm6Var3.m9952f0();
                                                                    str6 = this.f32750h;
                                                                    ar5VarM9952f0.m10368u();
                                                                    ar5VarM9952f0.mo5038t();
                                                                    y42.m12851X(str6);
                                                                    c0805jo3 = new C0805jo();
                                                                    cursorRawQuery = ar5VarM9952f0.m3197l0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) c0805jo3.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                c0805jo3.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        c0805jo3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r0 = c0805jo3;
                                                                    y42.m12851X(str110);
                                                                    c0805jo4 = new C0805jo();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            cb6Var3 = (cb6) map2.get(num);
                                                                            list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r18 = r0;
                                                                            it3 = it2;
                                                                            qm6Var2 = qm6Var3;
                                                                            c0805jo4.put(num, cb6Var3);
                                                                            r0 = r18;
                                                                            it2 = it3;
                                                                            str15 = str15;
                                                                            qm6Var3 = qm6Var2;
                                                                        }
                                                                    }
                                                                    str4 = str15;
                                                                    qm6Var = qm6Var3;
                                                                    map3 = c0805jo4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    qm6Var = qm6Var3;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map3;
                                                                map4 = map2;
                                                                while (r17.hasNext()) {
                                                                    num4.getClass();
                                                                    cb6Var = (cb6) map5.get(num4);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    c0805jo = new C0805jo();
                                                                    if (cb6Var != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (j96Var.m7056o()) {
                                                                                cb6 cb6Var9 = cb6Var;
                                                                                Integer numValueOf11 = Integer.valueOf(j96Var.m7057p());
                                                                                if (j96Var.m7058q()) {
                                                                                    lValueOf = Long.valueOf(j96Var.m7059r());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                c0805jo.put(numValueOf11, lValueOf);
                                                                                cb6Var = cb6Var9;
                                                                            }
                                                                        }
                                                                    }
                                                                    cb6Var2 = cb6Var;
                                                                    c0805jo2 = new C0805jo();
                                                                    if (cb6Var2 != null) {
                                                                        it = cb6Var2.m3968u().iterator();
                                                                        while (it.hasNext()) {
                                                                            fb6Var = (fb6) it.next();
                                                                            if (!fb6Var.m5631o()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map16 = map5;
                                                                    if (cb6Var2 != null) {
                                                                        i = 0;
                                                                        while (i < cb6Var2.m3963p() * 64) {
                                                                            if (q76.m9775e0((li6) cb6Var2.m3962o(), i)) {
                                                                                z4 = zM9225E;
                                                                                oa6Var4.mo9019b().f16831L.m12506c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                                                                bitSet2.set(i);
                                                                                if (q76.m9775e0((li6) cb6Var2.m3964q(), i)) {
                                                                                    bitSet.set(i);
                                                                                }
                                                                                i++;
                                                                                zM9225E = z4;
                                                                            } else {
                                                                                z4 = zM9225E;
                                                                            }
                                                                            c0805jo.remove(Integer.valueOf(i));
                                                                            i++;
                                                                            zM9225E = z4;
                                                                        }
                                                                    }
                                                                    boolean z8 = zM9225E;
                                                                    cb6 cb6Var10 = (cb6) map4.get(num4);
                                                                    if (zM9225E2) {
                                                                        while (r2.hasNext()) {
                                                                            int iM5511p4 = f46Var2.m5511p();
                                                                            Integer num9 = num4;
                                                                            jLongValue = this.f32754l.longValue() / 1000;
                                                                            if (f46Var2.m5519x()) {
                                                                                jLongValue = this.f32753k.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iM5511p4);
                                                                            if (c0805jo.containsKey(numValueOf)) {
                                                                                c0805jo.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (c0805jo2.containsKey(numValueOf)) {
                                                                                c0805jo2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num4 = num9;
                                                                        }
                                                                    }
                                                                    this.f32752j.put(num4, new ur6(this, this.f32750h, cb6Var10, bitSet, bitSet2, c0805jo, c0805jo2));
                                                                    obj2 = obj2;
                                                                    map = map;
                                                                    str2 = str2;
                                                                    zM9225E = z8;
                                                                    map5 = map16;
                                                                    map4 = map4;
                                                                    zM9225E2 = zM9225E2;
                                                                }
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str111 = str3;
                                                            ?? r13 = obj2;
                                                            if (!list.isEmpty()) {
                                                                g76Var = new g76(this);
                                                                c0805jo6 = new C0805jo();
                                                                while (r17.hasNext()) {
                                                                    m96VarM5912b = g76Var.m5912b(this.f32750h, m96Var);
                                                                    if (m96VarM5912b != null) {
                                                                        fs5VarM3191e0 = qm6Var.m9952f0().m3191e0(this.f32750h, m96Var, m96VarM5912b.m8247r());
                                                                        qm6Var.m9952f0().m3183V("events", fs5VarM3191e0);
                                                                        if (z) {
                                                                            j = fs5VarM3191e0.f19256c;
                                                                            strM8247r = m96VarM5912b.m8247r();
                                                                            map8 = (Map) c0805jo6.get(strM8247r);
                                                                            if (map8 == null) {
                                                                                ar5 ar5VarM9952f9 = qm6Var.m9952f0();
                                                                                oa6 oa6Var8 = (oa6) ar5VarM9952f9.f36084a;
                                                                                str11 = this.f32750h;
                                                                                ar5VarM9952f9.m10368u();
                                                                                ar5VarM9952f9.mo5038t();
                                                                                y42.m12851X(str11);
                                                                                y42.m12851X(strM8247r);
                                                                                c0805jo7 = new C0805jo();
                                                                                Query = ar5VarM9952f9.m3197l0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM8247r}, null, null, null);
                                                                                if (Query.moveToFirst()) {
                                                                                    str12 = str11;
                                                                                    Query = Query;
                                                                                    r46 = list;
                                                                                    while (true) {
                                                                                        f46 f46Var8 = (f46) ((c46) q76.m9777k0(f46.m5507A(), Query.getBlob(1))).m11056e();
                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                        list6 = (List) c0805jo7.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            r46 = Query;
                                                                                            arrayList4 = new ArrayList();
                                                                                            c0805jo7.put(numValueOf6, arrayList4);
                                                                                            r48 = r46;
                                                                                        } else {
                                                                                            r48 = Query;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(f46Var8);
                                                                                        r47 = r48;
                                                                                        if (!r47.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        Query = r47;
                                                                                        r46 = r47;
                                                                                    }
                                                                                    r47.close();
                                                                                    map8 = c0805jo7;
                                                                                    r43 = r47;
                                                                                } else {
                                                                                    ?? r411 = Query;
                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                    r411.close();
                                                                                    r43 = r411;
                                                                                }
                                                                                c0805jo6.put(strM8247r, map8);
                                                                                list = r43;
                                                                            } else {
                                                                                list = list;
                                                                            }
                                                                            while (r18.hasNext()) {
                                                                                iIntValue2 = num6.intValue();
                                                                                if (this.f32751i.contains(num6)) {
                                                                                    oa6Var4.mo9019b().f16831L.m12505b(num6, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it8 = ((List) map8.get(num6)).iterator();
                                                                                    zM5759a = true;
                                                                                    while (true) {
                                                                                        if (!it8.hasNext()) {
                                                                                            map9 = map8;
                                                                                            g76Var2 = g76Var;
                                                                                            num3 = num6;
                                                                                            break;
                                                                                        }
                                                                                        f46 f46Var9 = (f46) it8.next();
                                                                                        g76Var2 = g76Var;
                                                                                        num3 = num6;
                                                                                        map9 = map8;
                                                                                        fn5Var2 = new fn5(this, this.f32750h, iIntValue2, f46Var9, (byte) 0);
                                                                                        Long l9 = this.f32753k;
                                                                                        Long l10 = this.f32754l;
                                                                                        iM5511p = f46Var9.m5511p();
                                                                                        ur6Var = (ur6) this.f32752j.get(num3);
                                                                                        if (ur6Var == null) {
                                                                                            z5 = false;
                                                                                        } else {
                                                                                            z5 = ur6Var.f32125d.get(iM5511p);
                                                                                        }
                                                                                        zM5759a = fn5Var2.m5759a(l9, l10, m96VarM5912b, j, fs5VarM3191e0, z5);
                                                                                        if (!zM5759a) {
                                                                                            this.f32751i.add(num3);
                                                                                            break;
                                                                                        }
                                                                                        m11942z(num3).m11636a(fn5Var2);
                                                                                        num6 = num3;
                                                                                        map8 = map9;
                                                                                        g76Var = g76Var2;
                                                                                    }
                                                                                    if (!zM5759a) {
                                                                                        this.f32751i.add(num3);
                                                                                    }
                                                                                    g76Var = g76Var2;
                                                                                    map8 = map9;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                C0805jo c0805jo12 = new C0805jo();
                                                                it4 = list2.iterator();
                                                                x64Var = c0805jo12;
                                                                while (it4.hasNext()) {
                                                                    pb6 pb6Var3 = (pb6) it4.next();
                                                                    strM9482q = pb6Var3.m9482q();
                                                                    map6 = (Map) x64Var.get(strM9482q);
                                                                    if (map6 == null) {
                                                                        ar5 ar5VarM9952f10 = qm6Var.m9952f0();
                                                                        oa6Var2 = (oa6) ar5VarM9952f10.f36084a;
                                                                        str9 = this.f32750h;
                                                                        ar5VarM9952f10.m10368u();
                                                                        ar5VarM9952f10.mo5038t();
                                                                        y42.m12851X(str9);
                                                                        y42.m12851X(strM9482q);
                                                                        c0805jo5 = new C0805jo();
                                                                        cursorQuery2 = ar5VarM9952f10.m3197l0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM9482q}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
                                                                                u46 u46Var4 = (u46) ((q46) q76.m9777k0(u46.m11238w(), cursorQuery2.getBlob(1))).m11056e();
                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) c0805jo5.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    oa6Var3 = oa6Var2;
                                                                                    arrayList3 = new ArrayList();
                                                                                    c0805jo5.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    oa6Var3 = oa6Var2;
                                                                                    arrayList3 = list5;
                                                                                }
                                                                                arrayList3.add(u46Var4);
                                                                                str10 = str9;
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                oa6Var2 = oa6Var3;
                                                                                str9 = str10;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map6 = c0805jo5;
                                                                        } else {
                                                                            it5 = it4;
                                                                            map6 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        x64Var.put(strM9482q, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                    }
                                                                    it6 = map6.keySet().iterator();
                                                                    x64Var2 = x64Var;
                                                                    while (it6.hasNext()) {
                                                                        num2 = (Integer) it6.next();
                                                                        iIntValue = num2.intValue();
                                                                        if (this.f32751i.contains(num2)) {
                                                                            oa6Var4.mo9019b().f16831L.m12505b(num2, "Skipping failed audience ID");
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it7 = ((List) map6.get(num2)).iterator();
                                                                        zM5760b = true;
                                                                        x64Var3 = x64Var2;
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                u46Var = (u46) it7.next();
                                                                                map7 = map6;
                                                                                if (Log.isLoggable(oa6Var4.mo9019b().m4402A(), 2)) {
                                                                                    x66 x66Var10 = oa6Var4.mo9019b().f16831L;
                                                                                    if (u46Var.m11239o()) {
                                                                                        numValueOf4 = Integer.valueOf(u46Var.m11240p());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    x66Var10.m12507d("Evaluating filter. audience, filter, property", num2, numValueOf4, oa6Var4.f26518j.m9368c(u46Var.m11241q()));
                                                                                    oa6Var4.mo9019b().f16831L.m12505b(qm6Var.m9958i0().m9792b0(u46Var), "Filter definition");
                                                                                }
                                                                                if (u46Var.m11239o()) {
                                                                                }
                                                                                x66 x66Var11 = oa6Var4.mo9019b().f16838m;
                                                                                z66 z66VarM4401y5 = d76.m4401y(this.f32750h);
                                                                                if (u46Var.m11239o()) {
                                                                                    numValueOf3 = Integer.valueOf(u46Var.m11240p());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                x66Var11.m12506c("Invalid property filter ID. appId, id", z66VarM4401y5, String.valueOf(numValueOf3));
                                                                                this.f32751i.add(num2);
                                                                                map6 = map7;
                                                                                x64Var2 = x64Var3;
                                                                                it6 = it6;
                                                                            } else {
                                                                                map7 = map6;
                                                                                x64Var3 = x64Var3;
                                                                                it6 = it6;
                                                                            }
                                                                            if (!zM5760b) {
                                                                                this.f32751i.add(num2);
                                                                            }
                                                                            map6 = map7;
                                                                            x64Var2 = x64Var3;
                                                                            it6 = it6;
                                                                            m11942z(num2).m11636a(fn5Var);
                                                                            iIntValue = i2;
                                                                            map6 = map7;
                                                                            x64Var3 = x64Var3;
                                                                            it6 = it6;
                                                                        }
                                                                    }
                                                                    it4 = it5;
                                                                    x64Var = x64Var2;
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            C0695go<Integer> c0695go3 = (C0695go) this.f32752j.keySet();
                                                            c0695go3.removeAll(this.f32751i);
                                                            while (r3.hasNext()) {
                                                                int iIntValue5 = num7.intValue();
                                                                ur6 ur6Var4 = (ur6) this.f32752j.get(num7);
                                                                y42.m12854a0(ur6Var4);
                                                                r86 r86VarM11637b3 = ur6Var4.m11637b(iIntValue5);
                                                                arrayList2.add(r86VarM11637b3);
                                                                ar5VarM9952f1 = qm6Var.m9952f0();
                                                                oa6Var = (oa6) ar5VarM9952f1.f36084a;
                                                                str8 = this.f32750h;
                                                                cb6 cb6VarM10239q3 = r86VarM11637b3.m10239q();
                                                                ar5VarM9952f1.m10368u();
                                                                ar5VarM9952f1.mo5038t();
                                                                y42.m12851X(str8);
                                                                y42.m12854a0(cb6VarM10239q3);
                                                                byte[] bArrM5118a3 = cb6VarM10239q3.m5118a();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str8);
                                                                contentValues.put(str5, num7);
                                                                contentValues.put("current_results", bArrM5118a3);
                                                                if (ar5VarM9952f1.m3197l0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    oa6Var.mo9019b().f16835j.m12505b(d76.m4401y(str8), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r5 = r6;
                                                    map2 = c0805jo8;
                                                } else {
                                                    Map map17 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map17;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r5 = r5;
                                                }
                                                if (map2.isEmpty()) {
                                                    str5 = "audience_id";
                                                    qm6Var = qm6Var3;
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z3) {
                                                        String str112 = this.f32750h;
                                                        ar5VarM9952f0 = qm6Var3.m9952f0();
                                                        str6 = this.f32750h;
                                                        ar5VarM9952f0.m10368u();
                                                        ar5VarM9952f0.mo5038t();
                                                        y42.m12851X(str6);
                                                        c0805jo3 = new C0805jo();
                                                        cursorRawQuery = ar5VarM9952f0.m3197l0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) c0805jo3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    c0805jo3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            c0805jo3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r0 = c0805jo3;
                                                        y42.m12851X(str112);
                                                        c0805jo4 = new C0805jo();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                cb6Var3 = (cb6) map2.get(num);
                                                                list4 = (List) r0.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r18 = r0;
                                                                it3 = it2;
                                                                qm6Var2 = qm6Var3;
                                                                c0805jo4.put(num, cb6Var3);
                                                                r0 = r18;
                                                                it2 = it3;
                                                                str15 = str15;
                                                                qm6Var3 = qm6Var2;
                                                            }
                                                        }
                                                        str4 = str15;
                                                        qm6Var = qm6Var3;
                                                        map3 = c0805jo4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        qm6Var = qm6Var3;
                                                        map3 = map2;
                                                    }
                                                    map5 = map3;
                                                    map4 = map2;
                                                    while (r17.hasNext()) {
                                                        num4.getClass();
                                                        cb6Var = (cb6) map5.get(num4);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        c0805jo = new C0805jo();
                                                        if (cb6Var != null) {
                                                            while (r3.hasNext()) {
                                                                if (j96Var.m7056o()) {
                                                                    cb6 cb6Var11 = cb6Var;
                                                                    Integer numValueOf12 = Integer.valueOf(j96Var.m7057p());
                                                                    if (j96Var.m7058q()) {
                                                                        lValueOf = Long.valueOf(j96Var.m7059r());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    c0805jo.put(numValueOf12, lValueOf);
                                                                    cb6Var = cb6Var11;
                                                                }
                                                            }
                                                        }
                                                        cb6Var2 = cb6Var;
                                                        c0805jo2 = new C0805jo();
                                                        if (cb6Var2 != null) {
                                                            it = cb6Var2.m3968u().iterator();
                                                            while (it.hasNext()) {
                                                                fb6Var = (fb6) it.next();
                                                                if (!fb6Var.m5631o()) {
                                                                }
                                                            }
                                                        }
                                                        Map map18 = map5;
                                                        if (cb6Var2 != null) {
                                                            i = 0;
                                                            while (i < cb6Var2.m3963p() * 64) {
                                                                if (q76.m9775e0((li6) cb6Var2.m3962o(), i)) {
                                                                    z4 = zM9225E;
                                                                    oa6Var4.mo9019b().f16831L.m12506c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                                                    bitSet2.set(i);
                                                                    if (q76.m9775e0((li6) cb6Var2.m3964q(), i)) {
                                                                        bitSet.set(i);
                                                                    }
                                                                    i++;
                                                                    zM9225E = z4;
                                                                } else {
                                                                    z4 = zM9225E;
                                                                }
                                                                c0805jo.remove(Integer.valueOf(i));
                                                                i++;
                                                                zM9225E = z4;
                                                            }
                                                        }
                                                        boolean z9 = zM9225E;
                                                        cb6 cb6Var12 = (cb6) map4.get(num4);
                                                        if (zM9225E2) {
                                                            while (r2.hasNext()) {
                                                                int iM5511p5 = f46Var2.m5511p();
                                                                Integer num10 = num4;
                                                                jLongValue = this.f32754l.longValue() / 1000;
                                                                if (f46Var2.m5519x()) {
                                                                    jLongValue = this.f32753k.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iM5511p5);
                                                                if (c0805jo.containsKey(numValueOf)) {
                                                                    c0805jo.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (c0805jo2.containsKey(numValueOf)) {
                                                                    c0805jo2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num4 = num10;
                                                            }
                                                        }
                                                        this.f32752j.put(num4, new ur6(this, this.f32750h, cb6Var12, bitSet, bitSet2, c0805jo, c0805jo2));
                                                        obj2 = obj2;
                                                        map = map;
                                                        str2 = str2;
                                                        zM9225E = z9;
                                                        map5 = map18;
                                                        map4 = map4;
                                                        zM9225E2 = zM9225E2;
                                                    }
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str113 = str3;
                                                ?? r14 = obj2;
                                                if (!list.isEmpty()) {
                                                    g76Var = new g76(this);
                                                    c0805jo6 = new C0805jo();
                                                    while (r17.hasNext()) {
                                                        m96VarM5912b = g76Var.m5912b(this.f32750h, m96Var);
                                                        if (m96VarM5912b != null) {
                                                            fs5VarM3191e0 = qm6Var.m9952f0().m3191e0(this.f32750h, m96Var, m96VarM5912b.m8247r());
                                                            qm6Var.m9952f0().m3183V("events", fs5VarM3191e0);
                                                            if (z) {
                                                                j = fs5VarM3191e0.f19256c;
                                                                strM8247r = m96VarM5912b.m8247r();
                                                                map8 = (Map) c0805jo6.get(strM8247r);
                                                                if (map8 == null) {
                                                                    ar5 ar5VarM9952f11 = qm6Var.m9952f0();
                                                                    oa6 oa6Var9 = (oa6) ar5VarM9952f11.f36084a;
                                                                    str11 = this.f32750h;
                                                                    ar5VarM9952f11.m10368u();
                                                                    ar5VarM9952f11.mo5038t();
                                                                    y42.m12851X(str11);
                                                                    y42.m12851X(strM8247r);
                                                                    c0805jo7 = new C0805jo();
                                                                    Query = ar5VarM9952f11.m3197l0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM8247r}, null, null, null);
                                                                    if (Query.moveToFirst()) {
                                                                        str12 = str11;
                                                                        Query = Query;
                                                                        r46 = list;
                                                                        while (true) {
                                                                            f46 f46Var10 = (f46) ((c46) q76.m9777k0(f46.m5507A(), Query.getBlob(1))).m11056e();
                                                                            numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                            list6 = (List) c0805jo7.get(numValueOf6);
                                                                            if (list6 == null) {
                                                                                r46 = Query;
                                                                                arrayList4 = new ArrayList();
                                                                                c0805jo7.put(numValueOf6, arrayList4);
                                                                                r48 = r46;
                                                                            } else {
                                                                                r48 = Query;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(f46Var10);
                                                                            r47 = r48;
                                                                            if (!r47.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            Query = r47;
                                                                            r46 = r47;
                                                                        }
                                                                        r47.close();
                                                                        map8 = c0805jo7;
                                                                        r43 = r47;
                                                                    } else {
                                                                        ?? r412 = Query;
                                                                        map8 = Collections.EMPTY_MAP;
                                                                        r412.close();
                                                                        r43 = r412;
                                                                    }
                                                                    c0805jo6.put(strM8247r, map8);
                                                                    list = r43;
                                                                } else {
                                                                    list = list;
                                                                }
                                                                while (r18.hasNext()) {
                                                                    iIntValue2 = num6.intValue();
                                                                    if (this.f32751i.contains(num6)) {
                                                                        oa6Var4.mo9019b().f16831L.m12505b(num6, "Skipping failed audience ID");
                                                                    } else {
                                                                        it8 = ((List) map8.get(num6)).iterator();
                                                                        zM5759a = true;
                                                                        while (true) {
                                                                            if (!it8.hasNext()) {
                                                                                map9 = map8;
                                                                                g76Var2 = g76Var;
                                                                                num3 = num6;
                                                                                break;
                                                                            }
                                                                            f46 f46Var11 = (f46) it8.next();
                                                                            g76Var2 = g76Var;
                                                                            num3 = num6;
                                                                            map9 = map8;
                                                                            fn5Var2 = new fn5(this, this.f32750h, iIntValue2, f46Var11, (byte) 0);
                                                                            Long l11 = this.f32753k;
                                                                            Long l12 = this.f32754l;
                                                                            iM5511p = f46Var11.m5511p();
                                                                            ur6Var = (ur6) this.f32752j.get(num3);
                                                                            if (ur6Var == null) {
                                                                                z5 = false;
                                                                            } else {
                                                                                z5 = ur6Var.f32125d.get(iM5511p);
                                                                            }
                                                                            zM5759a = fn5Var2.m5759a(l11, l12, m96VarM5912b, j, fs5VarM3191e0, z5);
                                                                            if (!zM5759a) {
                                                                                this.f32751i.add(num3);
                                                                                break;
                                                                            }
                                                                            m11942z(num3).m11636a(fn5Var2);
                                                                            num6 = num3;
                                                                            map8 = map9;
                                                                            g76Var = g76Var2;
                                                                        }
                                                                        if (!zM5759a) {
                                                                            this.f32751i.add(num3);
                                                                        }
                                                                        g76Var = g76Var2;
                                                                        map8 = map9;
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    C0805jo c0805jo13 = new C0805jo();
                                                    it4 = list2.iterator();
                                                    x64Var = c0805jo13;
                                                    while (it4.hasNext()) {
                                                        pb6 pb6Var4 = (pb6) it4.next();
                                                        strM9482q = pb6Var4.m9482q();
                                                        map6 = (Map) x64Var.get(strM9482q);
                                                        if (map6 == null) {
                                                            ar5 ar5VarM9952f12 = qm6Var.m9952f0();
                                                            oa6Var2 = (oa6) ar5VarM9952f12.f36084a;
                                                            str9 = this.f32750h;
                                                            ar5VarM9952f12.m10368u();
                                                            ar5VarM9952f12.mo5038t();
                                                            y42.m12851X(str9);
                                                            y42.m12851X(strM9482q);
                                                            c0805jo5 = new C0805jo();
                                                            cursorQuery2 = ar5VarM9952f12.m3197l0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM9482q}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                it5 = it4;
                                                                while (true) {
                                                                    u46 u46Var5 = (u46) ((q46) q76.m9777k0(u46.m11238w(), cursorQuery2.getBlob(1))).m11056e();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) c0805jo5.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        oa6Var3 = oa6Var2;
                                                                        arrayList3 = new ArrayList();
                                                                        c0805jo5.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        oa6Var3 = oa6Var2;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(u46Var5);
                                                                    str10 = str9;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    oa6Var2 = oa6Var3;
                                                                    str9 = str10;
                                                                }
                                                                cursorQuery2.close();
                                                                map6 = c0805jo5;
                                                            } else {
                                                                it5 = it4;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            x64Var.put(strM9482q, map6);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        it6 = map6.keySet().iterator();
                                                        x64Var2 = x64Var;
                                                        while (it6.hasNext()) {
                                                            num2 = (Integer) it6.next();
                                                            iIntValue = num2.intValue();
                                                            if (this.f32751i.contains(num2)) {
                                                                oa6Var4.mo9019b().f16831L.m12505b(num2, "Skipping failed audience ID");
                                                                break;
                                                                break;
                                                            }
                                                            it7 = ((List) map6.get(num2)).iterator();
                                                            zM5760b = true;
                                                            x64Var3 = x64Var2;
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    u46Var = (u46) it7.next();
                                                                    map7 = map6;
                                                                    if (Log.isLoggable(oa6Var4.mo9019b().m4402A(), 2)) {
                                                                        x66 x66Var12 = oa6Var4.mo9019b().f16831L;
                                                                        if (u46Var.m11239o()) {
                                                                            numValueOf4 = Integer.valueOf(u46Var.m11240p());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        x66Var12.m12507d("Evaluating filter. audience, filter, property", num2, numValueOf4, oa6Var4.f26518j.m9368c(u46Var.m11241q()));
                                                                        oa6Var4.mo9019b().f16831L.m12505b(qm6Var.m9958i0().m9792b0(u46Var), "Filter definition");
                                                                    }
                                                                    if (u46Var.m11239o()) {
                                                                    }
                                                                    x66 x66Var13 = oa6Var4.mo9019b().f16838m;
                                                                    z66 z66VarM4401y6 = d76.m4401y(this.f32750h);
                                                                    if (u46Var.m11239o()) {
                                                                        numValueOf3 = Integer.valueOf(u46Var.m11240p());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    x66Var13.m12506c("Invalid property filter ID. appId, id", z66VarM4401y6, String.valueOf(numValueOf3));
                                                                    this.f32751i.add(num2);
                                                                    map6 = map7;
                                                                    x64Var2 = x64Var3;
                                                                    it6 = it6;
                                                                } else {
                                                                    map7 = map6;
                                                                    x64Var3 = x64Var3;
                                                                    it6 = it6;
                                                                }
                                                                if (!zM5760b) {
                                                                    this.f32751i.add(num2);
                                                                }
                                                                map6 = map7;
                                                                x64Var2 = x64Var3;
                                                                it6 = it6;
                                                                m11942z(num2).m11636a(fn5Var);
                                                                iIntValue = i2;
                                                                map6 = map7;
                                                                x64Var3 = x64Var3;
                                                                it6 = it6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                        x64Var = x64Var2;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                C0695go<Integer> c0695go4 = (C0695go) this.f32752j.keySet();
                                                c0695go4.removeAll(this.f32751i);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num7.intValue();
                                                    ur6 ur6Var5 = (ur6) this.f32752j.get(num7);
                                                    y42.m12854a0(ur6Var5);
                                                    r86 r86VarM11637b4 = ur6Var5.m11637b(iIntValue6);
                                                    arrayList2.add(r86VarM11637b4);
                                                    ar5VarM9952f1 = qm6Var.m9952f0();
                                                    oa6Var = (oa6) ar5VarM9952f1.f36084a;
                                                    str8 = this.f32750h;
                                                    cb6 cb6VarM10239q4 = r86VarM11637b4.m10239q();
                                                    ar5VarM9952f1.m10368u();
                                                    ar5VarM9952f1.mo5038t();
                                                    y42.m12851X(str8);
                                                    y42.m12854a0(cb6VarM10239q4);
                                                    byte[] bArrM5118a4 = cb6VarM10239q4.m5118a();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str8);
                                                    contentValues.put(str5, num7);
                                                    contentValues.put("current_results", bArrM5118a4);
                                                    if (ar5VarM9952f1.m3197l0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        oa6Var.mo9019b().f16835j.m12505b(d76.m4401y(str8), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        r111.close();
                                        map = c0805jo9;
                                    } else {
                                        str2 = "data";
                                        Query2.close();
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    r19 = Query2;
                                }
                            } catch (SQLiteException e24) {
                                e = e24;
                                str2 = "data";
                            }
                        } catch (SQLiteException e25) {
                            e = e25;
                            str2 = "data";
                            r9 = 0;
                        } catch (Throwable th13) {
                            th = th13;
                            r9 = 0;
                        }
                        ar5 ar5VarM9952f13 = qm6Var3.m9952f0();
                        obj = (oa6) ar5VarM9952f13.f36084a;
                        r5 = this.f32750h;
                        ar5VarM9952f13.m10368u();
                        ar5VarM9952f13.mo5038t();
                        y42.m12851X(r5);
                        cursorQuery = ar5VarM9952f13.m3197l0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            Map map19 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map19;
                            str3 = "Failed to merge filter. appId";
                            obj2 = "Database error querying filters. appId";
                            obj = obj;
                            r5 = r5;
                        } else {
                            c0805jo8 = new C0805jo();
                            r17 = obj;
                            r21 = r5;
                            while (true) {
                                i3 = cursorQuery.getInt(0);
                                cb6 cb6Var13 = (cb6) ((bb6) q76.m9777k0(cb6.m3954w(), cursorQuery.getBlob(1))).m11056e();
                                Object objValueOf2 = Integer.valueOf(i3);
                                c0805jo8.put(objValueOf2, cb6Var13);
                                str3 = str14;
                                obj2 = objM4401y;
                                obj3 = objValueOf2;
                                r6 = r21;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                str14 = str3;
                                objM4401y = obj2;
                                r21 = r21;
                            }
                            cursorQuery.close();
                            obj = obj3;
                            r5 = r6;
                            map2 = c0805jo8;
                        }
                        if (map2.isEmpty()) {
                            str5 = "audience_id";
                            qm6Var = qm6Var3;
                        } else {
                            HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                            if (z3) {
                                String str114 = this.f32750h;
                                ar5VarM9952f0 = qm6Var3.m9952f0();
                                str6 = this.f32750h;
                                ar5VarM9952f0.m10368u();
                                ar5VarM9952f0.mo5038t();
                                y42.m12851X(str6);
                                c0805jo3 = new C0805jo();
                                cursorRawQuery = ar5VarM9952f0.m3197l0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) c0805jo3.get(numValueOf2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            c0805jo3.put(numValueOf2, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    c0805jo3 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r0 = c0805jo3;
                                y42.m12851X(str114);
                                c0805jo4 = new C0805jo();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        cb6Var3 = (cb6) map2.get(num);
                                        list4 = (List) r0.get(num);
                                        if (list4 != null || list4.isEmpty()) {
                                            r18 = r0;
                                            it3 = it2;
                                            qm6Var2 = qm6Var3;
                                            c0805jo4.put(num, cb6Var3);
                                            r0 = r18;
                                            it2 = it3;
                                            str15 = str15;
                                            qm6Var3 = qm6Var2;
                                        } else {
                                            ?? r112 = r0;
                                            it3 = it2;
                                            List listM9794g0 = qm6Var3.m9958i0().m9794g0((li6) cb6Var3.m3964q(), list4);
                                            if (listM9794g0.isEmpty()) {
                                                r0 = r112;
                                                it2 = it3;
                                            } else {
                                                bb6 bb6Var = (bb6) cb6Var3.m13569g();
                                                bb6Var.m3540i();
                                                bb6Var.m11054c();
                                                ((cb6) bb6Var.f31181b).m3956A(listM9794g0);
                                                List listM9794g1 = qm6Var3.m9958i0().m9794g0((li6) cb6Var3.m3962o(), list4);
                                                bb6Var.m3539h();
                                                bb6Var.m11054c();
                                                ((cb6) bb6Var.f31181b).m3970y(listM9794g1);
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it10 = cb6Var3.m3966s().iterator();
                                                while (it10.hasNext()) {
                                                    Iterator it11 = it10;
                                                    j96 j96Var2 = (j96) it10.next();
                                                    qm6 qm6Var4 = qm6Var3;
                                                    if (!list4.contains(Integer.valueOf(j96Var2.m7057p()))) {
                                                        arrayList6.add(j96Var2);
                                                    }
                                                    it10 = it11;
                                                    qm6Var3 = qm6Var4;
                                                }
                                                qm6Var2 = qm6Var3;
                                                bb6Var.m3541j();
                                                bb6Var.m11054c();
                                                ((cb6) bb6Var.f31181b).m3958C(arrayList6);
                                                ArrayList arrayList7 = new ArrayList();
                                                for (fb6 fb6Var2 : cb6Var3.m3968u()) {
                                                    if (!list4.contains(Integer.valueOf(fb6Var2.m5632p()))) {
                                                        arrayList7.add(fb6Var2);
                                                    }
                                                }
                                                bb6Var.m3542k();
                                                bb6Var.m11054c();
                                                ((cb6) bb6Var.f31181b).m3960E(arrayList7);
                                                c0805jo4.put(num, (cb6) bb6Var.m11056e());
                                                r18 = r112;
                                                r0 = r18;
                                                it2 = it3;
                                                str15 = str15;
                                                qm6Var3 = qm6Var2;
                                            }
                                        }
                                    }
                                }
                                str4 = str15;
                                qm6Var = qm6Var3;
                                map3 = c0805jo4;
                            } else {
                                str4 = "audience_id";
                                qm6Var = qm6Var3;
                                map3 = map2;
                            }
                            map5 = map3;
                            map4 = map2;
                            while (r17.hasNext()) {
                                num4.getClass();
                                cb6Var = (cb6) map5.get(num4);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                c0805jo = new C0805jo();
                                if (cb6Var != null && cb6Var.m3967t() != 0) {
                                    while (r3.hasNext()) {
                                        if (j96Var.m7056o()) {
                                            cb6 cb6Var14 = cb6Var;
                                            Integer numValueOf13 = Integer.valueOf(j96Var.m7057p());
                                            if (j96Var.m7058q()) {
                                                lValueOf = Long.valueOf(j96Var.m7059r());
                                            } else {
                                                lValueOf = null;
                                            }
                                            c0805jo.put(numValueOf13, lValueOf);
                                            cb6Var = cb6Var14;
                                        }
                                    }
                                }
                                cb6Var2 = cb6Var;
                                c0805jo2 = new C0805jo();
                                if (cb6Var2 != null && cb6Var2.m3969v() != 0) {
                                    it = cb6Var2.m3968u().iterator();
                                    while (it.hasNext()) {
                                        fb6Var = (fb6) it.next();
                                        if (!fb6Var.m5631o() && fb6Var.m5634r() > 0) {
                                            c0805jo2.put(Integer.valueOf(fb6Var.m5632p()), Long.valueOf(fb6Var.m5635s(fb6Var.m5634r() - 1)));
                                            it = it;
                                            map5 = map5;
                                        }
                                    }
                                }
                                Map map110 = map5;
                                if (cb6Var2 != null) {
                                    i = 0;
                                    while (i < cb6Var2.m3963p() * 64) {
                                        if (q76.m9775e0((li6) cb6Var2.m3962o(), i)) {
                                            z4 = zM9225E;
                                            oa6Var4.mo9019b().f16831L.m12506c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                                            bitSet2.set(i);
                                            if (q76.m9775e0((li6) cb6Var2.m3964q(), i)) {
                                                bitSet.set(i);
                                            }
                                            i++;
                                            zM9225E = z4;
                                        } else {
                                            z4 = zM9225E;
                                        }
                                        c0805jo.remove(Integer.valueOf(i));
                                        i++;
                                        zM9225E = z4;
                                    }
                                }
                                boolean z10 = zM9225E;
                                cb6 cb6Var15 = (cb6) map4.get(num4);
                                if (zM9225E2 && z10 && (list3 = (List) map.get(num4)) != null && this.f32754l != null && this.f32753k != null) {
                                    while (r2.hasNext()) {
                                        int iM5511p6 = f46Var2.m5511p();
                                        Integer num11 = num4;
                                        jLongValue = this.f32754l.longValue() / 1000;
                                        if (f46Var2.m5519x()) {
                                            jLongValue = this.f32753k.longValue() / 1000;
                                        }
                                        numValueOf = Integer.valueOf(iM5511p6);
                                        if (c0805jo.containsKey(numValueOf)) {
                                            c0805jo.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        if (c0805jo2.containsKey(numValueOf)) {
                                            c0805jo2.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        num4 = num11;
                                    }
                                }
                                this.f32752j.put(num4, new ur6(this, this.f32750h, cb6Var15, bitSet, bitSet2, c0805jo, c0805jo2));
                                obj2 = obj2;
                                map = map;
                                str2 = str2;
                                zM9225E = z10;
                                map5 = map110;
                                map4 = map4;
                                zM9225E2 = zM9225E2;
                            }
                            str5 = str4;
                        }
                        str7 = str2;
                        String str115 = str3;
                        ?? r15 = obj2;
                        if (!list.isEmpty()) {
                            g76Var = new g76(this);
                            c0805jo6 = new C0805jo();
                            while (r17.hasNext()) {
                                m96VarM5912b = g76Var.m5912b(this.f32750h, m96Var);
                                if (m96VarM5912b != null) {
                                    fs5VarM3191e0 = qm6Var.m9952f0().m3191e0(this.f32750h, m96Var, m96VarM5912b.m8247r());
                                    qm6Var.m9952f0().m3183V("events", fs5VarM3191e0);
                                    if (z) {
                                        j = fs5VarM3191e0.f19256c;
                                        strM8247r = m96VarM5912b.m8247r();
                                        map8 = (Map) c0805jo6.get(strM8247r);
                                        if (map8 == null) {
                                            ar5 ar5VarM9952f14 = qm6Var.m9952f0();
                                            oa6 oa6Var10 = (oa6) ar5VarM9952f14.f36084a;
                                            str11 = this.f32750h;
                                            ar5VarM9952f14.m10368u();
                                            ar5VarM9952f14.mo5038t();
                                            y42.m12851X(str11);
                                            y42.m12851X(strM8247r);
                                            c0805jo7 = new C0805jo();
                                            Query = ar5VarM9952f14.m3197l0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM8247r}, null, null, null);
                                            if (Query.moveToFirst()) {
                                                str12 = str11;
                                                Query = Query;
                                                r46 = list;
                                                while (true) {
                                                    f46 f46Var12 = (f46) ((c46) q76.m9777k0(f46.m5507A(), Query.getBlob(1))).m11056e();
                                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                    list6 = (List) c0805jo7.get(numValueOf6);
                                                    if (list6 == null) {
                                                        r46 = Query;
                                                        arrayList4 = new ArrayList();
                                                        c0805jo7.put(numValueOf6, arrayList4);
                                                        r48 = r46;
                                                    } else {
                                                        r48 = Query;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(f46Var12);
                                                    r47 = r48;
                                                    if (!r47.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    Query = r47;
                                                    r46 = r47;
                                                }
                                                r47.close();
                                                map8 = c0805jo7;
                                                r43 = r47;
                                            } else {
                                                ?? r413 = Query;
                                                map8 = Collections.EMPTY_MAP;
                                                r413.close();
                                                r43 = r413;
                                            }
                                            c0805jo6.put(strM8247r, map8);
                                            list = r43;
                                        } else {
                                            list = list;
                                        }
                                        while (r18.hasNext()) {
                                            iIntValue2 = num6.intValue();
                                            if (this.f32751i.contains(num6)) {
                                                oa6Var4.mo9019b().f16831L.m12505b(num6, "Skipping failed audience ID");
                                            } else {
                                                it8 = ((List) map8.get(num6)).iterator();
                                                zM5759a = true;
                                                while (true) {
                                                    if (!it8.hasNext()) {
                                                        map9 = map8;
                                                        g76Var2 = g76Var;
                                                        num3 = num6;
                                                        break;
                                                    }
                                                    f46 f46Var13 = (f46) it8.next();
                                                    g76Var2 = g76Var;
                                                    num3 = num6;
                                                    map9 = map8;
                                                    fn5Var2 = new fn5(this, this.f32750h, iIntValue2, f46Var13, (byte) 0);
                                                    Long l13 = this.f32753k;
                                                    Long l14 = this.f32754l;
                                                    iM5511p = f46Var13.m5511p();
                                                    ur6Var = (ur6) this.f32752j.get(num3);
                                                    if (ur6Var == null) {
                                                        z5 = false;
                                                    } else {
                                                        z5 = ur6Var.f32125d.get(iM5511p);
                                                    }
                                                    zM5759a = fn5Var2.m5759a(l13, l14, m96VarM5912b, j, fs5VarM3191e0, z5);
                                                    if (!zM5759a) {
                                                        this.f32751i.add(num3);
                                                        break;
                                                    }
                                                    m11942z(num3).m11636a(fn5Var2);
                                                    num6 = num3;
                                                    map8 = map9;
                                                    g76Var = g76Var2;
                                                }
                                                if (!zM5759a) {
                                                    this.f32751i.add(num3);
                                                }
                                                g76Var = g76Var2;
                                                map8 = map9;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            C0805jo c0805jo14 = new C0805jo();
                            it4 = list2.iterator();
                            x64Var = c0805jo14;
                            while (it4.hasNext()) {
                                pb6 pb6Var5 = (pb6) it4.next();
                                strM9482q = pb6Var5.m9482q();
                                map6 = (Map) x64Var.get(strM9482q);
                                if (map6 == null) {
                                    ar5 ar5VarM9952f15 = qm6Var.m9952f0();
                                    oa6Var2 = (oa6) ar5VarM9952f15.f36084a;
                                    str9 = this.f32750h;
                                    ar5VarM9952f15.m10368u();
                                    ar5VarM9952f15.mo5038t();
                                    y42.m12851X(str9);
                                    y42.m12851X(strM9482q);
                                    c0805jo5 = new C0805jo();
                                    cursorQuery2 = ar5VarM9952f15.m3197l0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM9482q}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        it5 = it4;
                                        while (true) {
                                            u46 u46Var6 = (u46) ((q46) q76.m9777k0(u46.m11238w(), cursorQuery2.getBlob(1))).m11056e();
                                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) c0805jo5.get(numValueOf5);
                                            if (list5 == null) {
                                                oa6Var3 = oa6Var2;
                                                arrayList3 = new ArrayList();
                                                c0805jo5.put(numValueOf5, arrayList3);
                                            } else {
                                                oa6Var3 = oa6Var2;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(u46Var6);
                                            str10 = str9;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            oa6Var2 = oa6Var3;
                                            str9 = str10;
                                        }
                                        cursorQuery2.close();
                                        map6 = c0805jo5;
                                    } else {
                                        it5 = it4;
                                        map6 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    x64Var.put(strM9482q, map6);
                                } else {
                                    it5 = it4;
                                }
                                it6 = map6.keySet().iterator();
                                x64Var2 = x64Var;
                                while (it6.hasNext()) {
                                    num2 = (Integer) it6.next();
                                    iIntValue = num2.intValue();
                                    if (this.f32751i.contains(num2)) {
                                        oa6Var4.mo9019b().f16831L.m12505b(num2, "Skipping failed audience ID");
                                        break;
                                        break;
                                    }
                                    it7 = ((List) map6.get(num2)).iterator();
                                    zM5760b = true;
                                    x64Var3 = x64Var2;
                                    while (true) {
                                        if (it7.hasNext()) {
                                            u46Var = (u46) it7.next();
                                            map7 = map6;
                                            if (Log.isLoggable(oa6Var4.mo9019b().m4402A(), 2)) {
                                                x66 x66Var14 = oa6Var4.mo9019b().f16831L;
                                                if (u46Var.m11239o()) {
                                                    numValueOf4 = Integer.valueOf(u46Var.m11240p());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                x66Var14.m12507d("Evaluating filter. audience, filter, property", num2, numValueOf4, oa6Var4.f26518j.m9368c(u46Var.m11241q()));
                                                oa6Var4.mo9019b().f16831L.m12505b(qm6Var.m9958i0().m9792b0(u46Var), "Filter definition");
                                            }
                                            if (u46Var.m11239o() || u46Var.m11240p() > 256) {
                                                x66 x66Var15 = oa6Var4.mo9019b().f16838m;
                                                z66 z66VarM4401y7 = d76.m4401y(this.f32750h);
                                                if (u46Var.m11239o()) {
                                                    numValueOf3 = Integer.valueOf(u46Var.m11240p());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                x66Var15.m12506c("Invalid property filter ID. appId, id", z66VarM4401y7, String.valueOf(numValueOf3));
                                                this.f32751i.add(num2);
                                                map6 = map7;
                                                x64Var2 = x64Var3;
                                                it6 = it6;
                                            } else {
                                                i2 = iIntValue;
                                                fn5Var = new fn5(this, this.f32750h, i2, u46Var, (byte) 1);
                                                Long l15 = this.f32753k;
                                                Long l16 = this.f32754l;
                                                int iM11240p = u46Var.m11240p();
                                                ur6 ur6Var6 = (ur6) this.f32752j.get(num2);
                                                zM5760b = fn5Var.m5760b(l15, l16, pb6Var5, ur6Var6 == null ? false : ur6Var6.f32125d.get(iM11240p));
                                                if (zM5760b) {
                                                    m11942z(num2).m11636a(fn5Var);
                                                    iIntValue = i2;
                                                    map6 = map7;
                                                    x64Var3 = x64Var3;
                                                    it6 = it6;
                                                } else {
                                                    this.f32751i.add(num2);
                                                    x64Var3 = x64Var3;
                                                }
                                            }
                                        } else {
                                            map7 = map6;
                                            x64Var3 = x64Var3;
                                            it6 = it6;
                                        }
                                        if (!zM5760b) {
                                            this.f32751i.add(num2);
                                        }
                                        map6 = map7;
                                        x64Var2 = x64Var3;
                                        it6 = it6;
                                    }
                                }
                                it4 = it5;
                                x64Var = x64Var2;
                            }
                        }
                        arrayList2 = new ArrayList();
                        C0695go<Integer> c0695go5 = (C0695go) this.f32752j.keySet();
                        c0695go5.removeAll(this.f32751i);
                        while (r3.hasNext()) {
                            int iIntValue7 = num7.intValue();
                            ur6 ur6Var7 = (ur6) this.f32752j.get(num7);
                            y42.m12854a0(ur6Var7);
                            r86 r86VarM11637b5 = ur6Var7.m11637b(iIntValue7);
                            arrayList2.add(r86VarM11637b5);
                            ar5VarM9952f1 = qm6Var.m9952f0();
                            oa6Var = (oa6) ar5VarM9952f1.f36084a;
                            str8 = this.f32750h;
                            cb6 cb6VarM10239q5 = r86VarM11637b5.m10239q();
                            ar5VarM9952f1.m10368u();
                            ar5VarM9952f1.mo5038t();
                            y42.m12851X(str8);
                            y42.m12854a0(cb6VarM10239q5);
                            byte[] bArrM5118a5 = cb6VarM10239q5.m5118a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str8);
                            contentValues.put(str5, num7);
                            contentValues.put("current_results", bArrM5118a5);
                            if (ar5VarM9952f1.m3197l0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                oa6Var.mo9019b().f16835j.m12505b(d76.m4401y(str8), "Failed to insert filter results (got -1). appId");
                            }
                        }
                        return arrayList2;
                    }
                    z3 = z2;
                    str2 = "data";
                    if (cursorQuery.moveToFirst()) {
                        Map map111 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map111;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r5 = r5;
                    } else {
                        c0805jo8 = new C0805jo();
                        r17 = obj;
                        r21 = r5;
                        while (true) {
                            i3 = cursorQuery.getInt(0);
                            cb6 cb6Var16 = (cb6) ((bb6) q76.m9777k0(cb6.m3954w(), cursorQuery.getBlob(1))).m11056e();
                            Object objValueOf3 = Integer.valueOf(i3);
                            c0805jo8.put(objValueOf3, cb6Var16);
                            str3 = str14;
                            obj2 = objM4401y;
                            obj3 = objValueOf3;
                            r6 = r21;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str14 = str3;
                            objM4401y = obj2;
                            r21 = r21;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r5 = r6;
                        map2 = c0805jo8;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e26) {
                e = e26;
                r17 = obj;
                r21 = r5;
            }
            cursorQuery = ar5VarM9952f13.m3197l0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
        } catch (SQLiteException e27) {
            e = e27;
            r17 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r21 = r5;
            cursorQuery = null;
        } catch (Throwable th15) {
            th = th15;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map10;
        ar5 ar5VarM9952f16 = qm6Var3.m9952f0();
        obj = (oa6) ar5VarM9952f16.f36084a;
        r5 = this.f32750h;
        ar5VarM9952f16.m10368u();
        ar5VarM9952f16.mo5038t();
        y42.m12851X(r5);
        if (map2.isEmpty()) {
            str5 = "audience_id";
            qm6Var = qm6Var3;
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z3) {
                String str116 = this.f32750h;
                ar5VarM9952f0 = qm6Var3.m9952f0();
                str6 = this.f32750h;
                ar5VarM9952f0.m10368u();
                ar5VarM9952f0.mo5038t();
                y42.m12851X(str6);
                c0805jo3 = new C0805jo();
                cursorRawQuery = ar5VarM9952f0.m3197l0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) c0805jo3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c0805jo3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    c0805jo3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r0 = c0805jo3;
                y42.m12851X(str116);
                c0805jo4 = new C0805jo();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        cb6Var3 = (cb6) map2.get(num);
                        list4 = (List) r0.get(num);
                        if (list4 != null) {
                        }
                        r18 = r0;
                        it3 = it2;
                        qm6Var2 = qm6Var3;
                        c0805jo4.put(num, cb6Var3);
                        r0 = r18;
                        it2 = it3;
                        str15 = str15;
                        qm6Var3 = qm6Var2;
                    }
                }
                str4 = str15;
                qm6Var = qm6Var3;
                map3 = c0805jo4;
            } else {
                str4 = "audience_id";
                qm6Var = qm6Var3;
                map3 = map2;
            }
            map5 = map3;
            map4 = map2;
            while (r17.hasNext()) {
                num4.getClass();
                cb6Var = (cb6) map5.get(num4);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                c0805jo = new C0805jo();
                if (cb6Var != null) {
                    while (r3.hasNext()) {
                        if (j96Var.m7056o()) {
                            cb6 cb6Var17 = cb6Var;
                            Integer numValueOf14 = Integer.valueOf(j96Var.m7057p());
                            if (j96Var.m7058q()) {
                                lValueOf = Long.valueOf(j96Var.m7059r());
                            } else {
                                lValueOf = null;
                            }
                            c0805jo.put(numValueOf14, lValueOf);
                            cb6Var = cb6Var17;
                        }
                    }
                }
                cb6Var2 = cb6Var;
                c0805jo2 = new C0805jo();
                if (cb6Var2 != null) {
                    it = cb6Var2.m3968u().iterator();
                    while (it.hasNext()) {
                        fb6Var = (fb6) it.next();
                        if (!fb6Var.m5631o()) {
                        }
                    }
                }
                Map map112 = map5;
                if (cb6Var2 != null) {
                    i = 0;
                    while (i < cb6Var2.m3963p() * 64) {
                        if (q76.m9775e0((li6) cb6Var2.m3962o(), i)) {
                            z4 = zM9225E;
                            oa6Var4.mo9019b().f16831L.m12506c("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i));
                            bitSet2.set(i);
                            if (q76.m9775e0((li6) cb6Var2.m3964q(), i)) {
                                bitSet.set(i);
                            }
                            i++;
                            zM9225E = z4;
                        } else {
                            z4 = zM9225E;
                        }
                        c0805jo.remove(Integer.valueOf(i));
                        i++;
                        zM9225E = z4;
                    }
                }
                boolean z11 = zM9225E;
                cb6 cb6Var18 = (cb6) map4.get(num4);
                if (zM9225E2) {
                    while (r2.hasNext()) {
                        int iM5511p7 = f46Var2.m5511p();
                        Integer num12 = num4;
                        jLongValue = this.f32754l.longValue() / 1000;
                        if (f46Var2.m5519x()) {
                            jLongValue = this.f32753k.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iM5511p7);
                        if (c0805jo.containsKey(numValueOf)) {
                            c0805jo.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (c0805jo2.containsKey(numValueOf)) {
                            c0805jo2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num4 = num12;
                    }
                }
                this.f32752j.put(num4, new ur6(this, this.f32750h, cb6Var18, bitSet, bitSet2, c0805jo, c0805jo2));
                obj2 = obj2;
                map = map;
                str2 = str2;
                zM9225E = z11;
                map5 = map112;
                map4 = map4;
                zM9225E2 = zM9225E2;
            }
            str5 = str4;
        }
        str7 = str2;
        String str117 = str3;
        ?? r16 = obj2;
        if (!list.isEmpty()) {
            g76Var = new g76(this);
            c0805jo6 = new C0805jo();
            while (r17.hasNext()) {
                m96VarM5912b = g76Var.m5912b(this.f32750h, m96Var);
                if (m96VarM5912b != null) {
                    fs5VarM3191e0 = qm6Var.m9952f0().m3191e0(this.f32750h, m96Var, m96VarM5912b.m8247r());
                    qm6Var.m9952f0().m3183V("events", fs5VarM3191e0);
                    if (z) {
                        j = fs5VarM3191e0.f19256c;
                        strM8247r = m96VarM5912b.m8247r();
                        map8 = (Map) c0805jo6.get(strM8247r);
                        if (map8 == null) {
                            ar5 ar5VarM9952f17 = qm6Var.m9952f0();
                            oa6 oa6Var11 = (oa6) ar5VarM9952f17.f36084a;
                            str11 = this.f32750h;
                            ar5VarM9952f17.m10368u();
                            ar5VarM9952f17.mo5038t();
                            y42.m12851X(str11);
                            y42.m12851X(strM8247r);
                            c0805jo7 = new C0805jo();
                            Query = ar5VarM9952f17.m3197l0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM8247r}, null, null, null);
                            if (Query.moveToFirst()) {
                                str12 = str11;
                                Query = Query;
                                r46 = list;
                                while (true) {
                                    f46 f46Var14 = (f46) ((c46) q76.m9777k0(f46.m5507A(), Query.getBlob(1))).m11056e();
                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                    list6 = (List) c0805jo7.get(numValueOf6);
                                    if (list6 == null) {
                                        r46 = Query;
                                        arrayList4 = new ArrayList();
                                        c0805jo7.put(numValueOf6, arrayList4);
                                        r48 = r46;
                                    } else {
                                        r48 = Query;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(f46Var14);
                                    r47 = r48;
                                    if (!r47.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    Query = r47;
                                    r46 = r47;
                                }
                                r47.close();
                                map8 = c0805jo7;
                                r43 = r47;
                            } else {
                                ?? r414 = Query;
                                map8 = Collections.EMPTY_MAP;
                                r414.close();
                                r43 = r414;
                            }
                            c0805jo6.put(strM8247r, map8);
                            list = r43;
                        } else {
                            list = list;
                        }
                        while (r18.hasNext()) {
                            iIntValue2 = num6.intValue();
                            if (this.f32751i.contains(num6)) {
                                oa6Var4.mo9019b().f16831L.m12505b(num6, "Skipping failed audience ID");
                            } else {
                                it8 = ((List) map8.get(num6)).iterator();
                                zM5759a = true;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        map9 = map8;
                                        g76Var2 = g76Var;
                                        num3 = num6;
                                        break;
                                    }
                                    f46 f46Var15 = (f46) it8.next();
                                    g76Var2 = g76Var;
                                    num3 = num6;
                                    map9 = map8;
                                    fn5Var2 = new fn5(this, this.f32750h, iIntValue2, f46Var15, (byte) 0);
                                    Long l17 = this.f32753k;
                                    Long l18 = this.f32754l;
                                    iM5511p = f46Var15.m5511p();
                                    ur6Var = (ur6) this.f32752j.get(num3);
                                    if (ur6Var == null) {
                                        z5 = false;
                                    } else {
                                        z5 = ur6Var.f32125d.get(iM5511p);
                                    }
                                    zM5759a = fn5Var2.m5759a(l17, l18, m96VarM5912b, j, fs5VarM3191e0, z5);
                                    if (!zM5759a) {
                                        this.f32751i.add(num3);
                                        break;
                                    }
                                    m11942z(num3).m11636a(fn5Var2);
                                    num6 = num3;
                                    map8 = map9;
                                    g76Var = g76Var2;
                                }
                                if (!zM5759a) {
                                    this.f32751i.add(num3);
                                }
                                g76Var = g76Var2;
                                map8 = map9;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            C0805jo c0805jo15 = new C0805jo();
            it4 = list2.iterator();
            x64Var = c0805jo15;
            while (it4.hasNext()) {
                pb6 pb6Var6 = (pb6) it4.next();
                strM9482q = pb6Var6.m9482q();
                map6 = (Map) x64Var.get(strM9482q);
                if (map6 == null) {
                    ar5 ar5VarM9952f18 = qm6Var.m9952f0();
                    oa6Var2 = (oa6) ar5VarM9952f18.f36084a;
                    str9 = this.f32750h;
                    ar5VarM9952f18.m10368u();
                    ar5VarM9952f18.mo5038t();
                    y42.m12851X(str9);
                    y42.m12851X(strM9482q);
                    c0805jo5 = new C0805jo();
                    cursorQuery2 = ar5VarM9952f18.m3197l0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM9482q}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        it5 = it4;
                        while (true) {
                            u46 u46Var7 = (u46) ((q46) q76.m9777k0(u46.m11238w(), cursorQuery2.getBlob(1))).m11056e();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) c0805jo5.get(numValueOf5);
                            if (list5 == null) {
                                oa6Var3 = oa6Var2;
                                arrayList3 = new ArrayList();
                                c0805jo5.put(numValueOf5, arrayList3);
                            } else {
                                oa6Var3 = oa6Var2;
                                arrayList3 = list5;
                            }
                            arrayList3.add(u46Var7);
                            str10 = str9;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            oa6Var2 = oa6Var3;
                            str9 = str10;
                        }
                        cursorQuery2.close();
                        map6 = c0805jo5;
                    } else {
                        it5 = it4;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    x64Var.put(strM9482q, map6);
                } else {
                    it5 = it4;
                }
                it6 = map6.keySet().iterator();
                x64Var2 = x64Var;
                while (it6.hasNext()) {
                    num2 = (Integer) it6.next();
                    iIntValue = num2.intValue();
                    if (this.f32751i.contains(num2)) {
                        oa6Var4.mo9019b().f16831L.m12505b(num2, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it7 = ((List) map6.get(num2)).iterator();
                    zM5760b = true;
                    x64Var3 = x64Var2;
                    while (true) {
                        if (it7.hasNext()) {
                            u46Var = (u46) it7.next();
                            map7 = map6;
                            if (Log.isLoggable(oa6Var4.mo9019b().m4402A(), 2)) {
                                x66 x66Var16 = oa6Var4.mo9019b().f16831L;
                                if (u46Var.m11239o()) {
                                    numValueOf4 = Integer.valueOf(u46Var.m11240p());
                                } else {
                                    numValueOf4 = null;
                                }
                                x66Var16.m12507d("Evaluating filter. audience, filter, property", num2, numValueOf4, oa6Var4.f26518j.m9368c(u46Var.m11241q()));
                                oa6Var4.mo9019b().f16831L.m12505b(qm6Var.m9958i0().m9792b0(u46Var), "Filter definition");
                            }
                            if (u46Var.m11239o()) {
                            }
                            x66 x66Var17 = oa6Var4.mo9019b().f16838m;
                            z66 z66VarM4401y8 = d76.m4401y(this.f32750h);
                            if (u46Var.m11239o()) {
                                numValueOf3 = Integer.valueOf(u46Var.m11240p());
                            } else {
                                numValueOf3 = null;
                            }
                            x66Var17.m12506c("Invalid property filter ID. appId, id", z66VarM4401y8, String.valueOf(numValueOf3));
                            this.f32751i.add(num2);
                            map6 = map7;
                            x64Var2 = x64Var3;
                            it6 = it6;
                        } else {
                            map7 = map6;
                            x64Var3 = x64Var3;
                            it6 = it6;
                        }
                        if (!zM5760b) {
                            this.f32751i.add(num2);
                        }
                        map6 = map7;
                        x64Var2 = x64Var3;
                        it6 = it6;
                        m11942z(num2).m11636a(fn5Var);
                        iIntValue = i2;
                        map6 = map7;
                        x64Var3 = x64Var3;
                        it6 = it6;
                    }
                }
                it4 = it5;
                x64Var = x64Var2;
            }
        }
        arrayList2 = new ArrayList();
        C0695go<Integer> c0695go6 = (C0695go) this.f32752j.keySet();
        c0695go6.removeAll(this.f32751i);
        while (r3.hasNext()) {
            int iIntValue8 = num7.intValue();
            ur6 ur6Var8 = (ur6) this.f32752j.get(num7);
            y42.m12854a0(ur6Var8);
            r86 r86VarM11637b6 = ur6Var8.m11637b(iIntValue8);
            arrayList2.add(r86VarM11637b6);
            ar5VarM9952f1 = qm6Var.m9952f0();
            oa6Var = (oa6) ar5VarM9952f1.f36084a;
            str8 = this.f32750h;
            cb6 cb6VarM10239q6 = r86VarM11637b6.m10239q();
            ar5VarM9952f1.m10368u();
            ar5VarM9952f1.mo5038t();
            y42.m12851X(str8);
            y42.m12854a0(cb6VarM10239q6);
            byte[] bArrM5118a6 = cb6VarM10239q6.m5118a();
            contentValues = new ContentValues();
            contentValues.put("app_id", str8);
            contentValues.put(str5, num7);
            contentValues.put("current_results", bArrM5118a6);
            if (ar5VarM9952f1.m3197l0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                oa6Var.mo9019b().f16835j.m12505b(d76.m4401y(str8), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: z */
    public final ur6 m11942z(Integer num) {
        if (this.f32752j.containsKey(num)) {
            return (ur6) this.f32752j.get(num);
        }
        String str = this.f32750h;
        ur6 ur6Var = new ur6();
        ur6Var.f32129h = this;
        ur6Var.f32122a = str;
        ur6Var.f32123b = true;
        ur6Var.f32125d = new BitSet();
        ur6Var.f32126e = new BitSet();
        ur6Var.f32127f = new C0805jo(0);
        ur6Var.f32128g = new C0805jo(0);
        VarHandle.storeStoreFence();
        this.f32752j.put(num, ur6Var);
        return ur6Var;
    }

    @Override // p000.rl6
    /* JADX INFO: renamed from: x */
    public final void mo3209x() {
    }
}
