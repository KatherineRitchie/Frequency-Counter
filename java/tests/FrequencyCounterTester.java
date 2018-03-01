import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;

public class FrequencyCounterTester {

    //Test test files taken from : http://textfiles.com/stories/

    @Test
    public void testGetUrlContentAsString_One() {
        String actualContentString = FrequencyCounter.getUrlContentAsString("http://textfiles.com/stories/3lpigs.txt");
        String expectedContentString = "                  THE THREE LITTLE PIGS\n" + "\n" + "   Once upon a time . . . there were three little pigs, who left their mummy\n" + "and daddy to see the world.\n" + "   All summer long, they roamed through the woods and over the plains,playing\n" + "games and having fun. None were happier than the three little pigs, and they\n" + "easily made friends with everyone. Wherever they went, they were given a warm \n" + "welcome, but as summer drew to a close, they realized that folk were drifting\n" + "back to their usual jobs, and preparing for winter. Autumn came and it began\n" + "to rain. The three little pigs started to feel they needed a real home. Sadly\n" + "they knew that the fun was over now and they must set to work like the others,\n" + "or they'd be left in the cold and rain, with no roof over their heads. They\n" + "talked about what to do, but each decided for himself. The laziest little pig\n" + "said he'd build a straw hut.\n" + "   \"It wlll only take a day,' he said. The others disagreed.\n" + "   \"It's too fragile,\" they said disapprovingly, but he refused to listen. Not\n" + "quite so lazy, the second little pig went in search of planks of seasoned\n" + "wood.\n" + "   \"Clunk! Clunk! Clunk!\" It took him two days to nail them together. But the\n" + "third little pig did not like the wooden house.\n" + "   \"That's not the way to build a house!\" he said. \"It takes time, patience \n" + "and hard work to buiid a house that is strong enough to stand up to wind, \n" + "rain, and snow, and most of all, protect us from the wolf!\"\n" + "   The days went by, and the wisest little pig's house took shape, brick by\n" + "brick. From time to time, his brothers visited him, saying with a chuckle:\n" + "   \"Why are you working so hard? Why don't you come and play?\" But the\n" + "stubborn bricklayer pig just said \"no\".\n" + "   \"I shall finish my house first. It must be solid and sturdy. And then I'll\n" + "come and play!\" he said. \"I shall not be foolish like you! For he who laughs\n" + "last, laughs longest!\"\n" + "   It was the wisest little pig that found the tracks of a big wolf in the\n" + "neighbourhood.\n" + "   The little pigs rushed home in alarm. Along came the wolf, scowling \n" + "fiercely at the laziest pig's straw hut.\n" + "   \"Come out!\" ordered the wolf, his mouth watering. I want to speak to you!\"\n" + "   \"I'd rather stay where I am!\" replied the little pig in a tiny voice.\n" + "   \"I'll make you come out!\" growled the wolf angrily, and puffing out his\n" + "chest, he took a very deep breath. Then he blew wlth all his might, right onto\n" + "the house. And all the straw the silly pig had heaped against some thin poles,\n" + "fell down in the great blast. Excited by his own cleverness, the wolf did not\n" + "notice that the little pig had slithered out from underneath the heap of\n" + "straw, and was dashing towards his brother's wooden house. When he realized \n" + "that the little pig was escaping, the wolf grew wild with rage.\n" + "   \"Come back!\" he roared, trying to catch the pig as he ran into the wooden \n" + "house. The other little pig greeted his brother, shaking like a leaf.\n" + "   \"I hope this house won't fall down! Let's lean against the door so he can't\n" + "break in!\"\n" + "   Outside, the wolf could hear the little pigs' words. Starving as he was, at\n" + "the idea of a two-course meal, he rained blows on the door.\n" + "   \"Open up! Open up! I only want to speak to you!\"\n" + "   Inside, the two brothers wept in fear and did their best to hold the door\n" + "fast against the blows. Then the furious wolf braced himself a new effort: he\n" + "drew in a really enormous breath, and went ... WHOOOOO! The wooden house\n" + "collapsed like a pack of cards.\n" + "   Luckily, the wisest little pig had been watching the scene from the window\n" + "of his own brick house, and he rapidly opened the door to his fleeing \n" + "brothers. And not a moment too soon, for the wolf was already hammering \n" + "furiously on the door. This time, the wolf had grave doubts. This house had a\n" + "much more solid air than the others. He blew once, he blew again and then for\n" + "a third time. But all was in vain. For the house did not budge an lnch. The\n" + "three little pigs watched him and their fear began to fade. Quite exhausted by\n" + "his efforts, the wolf decided to try one of his tricks. He scrambled up a\n" + "nearby ladder, on to the roof to have a look at the chimney. However, the\n" + "wisest little pig had seen thls ploy, and he quickly said:\n" + "   \"Quick! Light the fire!\" With his long legs thrust down the chimney, the\n" + "wolf was not sure if he should slide down the black hole. It wouldn'tbe easy\n" + "to get in, but the sound of the little pigs' voices below only made him feel\n" + "hungrier.\n" + "   \"I'm dying of hunger! I'm goin to try and get down.\" And he let himself \n" + "drop. But landing was rather hot, too hot! The wolf landed in the fire, stunned\n" + "by his fall.\n" + "   The flames licked his hairy coat and his tail became a flaring torch.\n" + "   \"Never again! Never again will I go down a chimneyl\" he squealed, as he\n" + "tried to put out the flames in his tail. Then he ran away as fast as he could.\n" + "   The three happy little pigs, dancing round and round the yard, began to \n" + "sing:\n" + "   \"Tra-la-la! Tra-la-la! The wicked black wolf will never come back...!\"\n" + "   From that terrible day on, the wisest little pig's brothers set to work\n" + "with a will. In less than no time, up went the two new brick houses. The wolf\n" + "did return once to roam in the neighbourhood, but when he caught sight of\n" + "three chimneys, he remembered the terrible pain of a burnt tail, and he left\n" + "for good.\n" + "   Now safe and happy, the wisest little pig called to his brothers:\n" + "   \"No more work! Come on, let's go and play!\"";
        Assert.assertEquals(actualContentString, expectedContentString);
    }

    @Test
    public void testGetUrlContentAsString_Two() {
        String actualContentString = FrequencyCounter.getUrlContentAsString("http://textfiles.com/stories/the-tree.txt");
        String expectedContentString = "\u007FTHE TREE\n" + "\n" + "IN THE WOOD THERE GREW A TREE\n" + "AND A FINE, FINE TREE WAS HE\n" + "AND ON THAT TREE THERE WAS A LIMB\n" + "AND ON THAT LIMB THERE WAS A BRANCH\n" + "AND ON THAT BRANCH THERE WAS A NEST\n" + "AND IN THAT NEST THERE WAS AN EGG\n" + "AND IN THAT EGG THERE WAS A BIRD\n" + "AND ON THAT BIRD A FEATHER CAME\n" + "AND ON THAT FEATHER WAS A BED\n" + "\n" + "AND ON THAT BED THERE WAS A GIRL\n" + "AND ON THAT GIRL THERE WAS A MAN\n" + "AND ON THAT MAN THERE WAS A SEED\n" + "AND ON THAT SEED THERE WAS A BOY \n" + "AND ON THAT BOY THERE WAS A MAN\n" + "AND ON THAT MAN THERE WAS A GRAVE\n" + "AND ON THAT GRAVE THERE GREW A TREE";
        Assert.assertEquals(actualContentString, expectedContentString);
    }

    @Test
    public void testGetUrlContentAsString_Three() {
        String actualContentString = FrequencyCounter.getUrlContentAsString("http://textfiles.com/stories/pussboot.txt");
        String expectedContentString = "                        PUSS IN BOOTS\n" + "   Once upon a time . . . a miller died leaving the mill to his eldest son, \n" + "his donkey to his second son and . . . a cat to his youngest son.\n" + "   \"Now that's some difference!\" you might say; but there you are, that's how \n" + "the miller was!\n" + "   The eldest son kept the mill, the second son took the donkey and set off in\n" + "search of his fortune . . . while the third sat down on a stone and sighed,\n" + "   \"A cat! What am I going to do with that?\" But the cat heard his words and \n" + "said,\n" + "   \"Don't worry, Master. What do you think? That I'm worth less than a \n" + "half-ruined mill or a mangy donkey? Give me a cloak, a hat with a feather in \n" + "it, a bag and a pair of boots, and you will see what I can do.\" The young man,\n" + "by no means surprised, for it was quite common for cats to talk in those days,\n" + "gave the cat what he asked for, and as he strode away, confident and cheerful.\n" + "the cat said. \"Don't look so glum, Master. See you soon!\"\n" + "   Swift of foot as he was, the cat caught a fat wild rabbit, popped it into \n" + "his bag, knocked at the castle gate, went before the King and, removing his \n" + "hat, with a sweeping bow, he said:\n" + "   \"Sire, the famous Marquis of Carabas sends you this fine plump rabbit as a \n" + "gift.\"\n" + "   \"Oh,\" said the King, \"thanks so much.\"\n" + "   \"Till tomorrow,\" replied the cat as he went out. And the next day, back he \n" + "came with some partridges tucked away in his bag. \"Another gift from the brave\n" + "Marquis of Carabas,\" he announced. The Queen remarked,\n" + "   \"This Marquis of Carabas is indeed a very courteous gentleman.\"\n" + "   In the days that followed, Puss in Boots regularly visited the castle, \n" + "carrying rabbits, hares, partridges and skylarks, presenting them all to the \n" + "King in the name of the Marquis of Carabas. Folk at the palace began to talk \n" + "about this noble gentleman.\n" + "   \"He must be a great hunter,\" someone remarked. \"He must be very loyal to \n" + "the King,\" said someone else. And yet another, \"But who is he? I've never \n" + "heard of him.\" At this someone who wanted to show people how much he knew, \n" + "replied,\n" + "   \"Oh, yes, I've heard his name before. In fact, I knew his father.\"\n" + "   The Queen was very interested in this generous man who sent these gifts. \n" + "\"Is your master young and handsome?\" she asked the cat.\n" + "   \"Oh yes. And very rich, too,\" answered Puss in Boots. \"In fact, he would be\n" + "very honoured if you and the King called to see him in his castle.\" When the \n" + "cat returned home and told his master that the King and Queen were going to \n" + "visit him, he was horrified.\n" + "   \"Whatever shall we do?\" he cried. \"As soon as they see me they will know \n" + "how poor I am.\"\n" + "   \"Leave everything to me,\" replied Puss in Boots. \"I have a plan.\" For \n" + "several days, the crafty cat kept on taking gifts to the King and Queen, and \n" + "one day he discovered that they were taking the Princess on a carriage ride \n" + "that very afternoon.\n" + "   The cat hurried home in great excitement. \"Master, come along,\" he cried. \n" + "\"It is time to carry out my plan. You must go for a swim in the river.\"\n" + "   \"But I can't swim,\" replied the young man.\n" + "   \"That's all right,\" replied Puss in Boots. \"Just trust me.\" So they went to\n" + "the river and when the King's carriage appeared the cat pushed his master into\n" + "the water.\n" + "   \"Help!\" cried the cat. \"The Marquis of Carabas is drowning.\" The King heard\n" + "his cries and sent his escorts to the rescue. They arrived just in time to \n" + "save the poor man, who really was drowning. The King, the Queen and the \n" + "Princess fussed around and ordered new clothes to be brought for the Marquis \n" + "of Carabas.\n" + "   \"Wouldn't you like to marry such a handsome man?\" the Queen asked her \n" + "daughter.\n" + "   \"Oh, yes,\" replied the Princess. However, the cat overheard one of the \n" + "ministers remark that they must find out how rich he was.\n" + "   \"He is very rich indeed,\" said Puss in Boots. \"He owns the castle and all \n" + "this land. Come and see for yourself. I will meet you at the castle.\" \n" + "   And with these words, the cat rushed off in the direction of the castle, \n" + "shouting at the peasants working in the fields, \"If anyone asks you who your \n" + "master is, answer: the Marquis of Carabas. Otherwise you will all be sorry.\" \n" + "And so, when the King's carriage swept past, the peasants told the King that \n" + "their master was the Marquis of Carabas.\n" + "   In the meantime, Puss in Boots had arrived at the castle, the home of a \n" + "huge, cruel ogre. Before knocking at the gate, the cat said to himself, \"I \n" + "must be very careful, or I'll never get out of here alive.\" When the door \n" + "opened, Puss in Boots removed his feather hat, exclaiming, \"My Lord Ogre, my \n" + "respects!\"\n" + "   \"What do you want, cat?\" asked the ogre rudely.\n" + "   \"Sire, I've heard you possess great powers. That, for instance, you can \n" + "change into a lion or an elephant.\"\n" + "   \"That's perfectly true,\" said the ogre, \"and so what?\"\n" + "   \"Well,\" said the cat, \"I was talking to certain friends of mine who said \n" + "that you can't turn into a tiny little creature, like a mouse.\"\n" + "   \"Oh, so that's what they say, is it?\" exclaimed the ogre. The cat nodded,\n" + "   \"Well, Sire, that's my opinion too, because folk that can do big things \n" + "never can manage little ones.\"\n" + "   \"Oh, yes? Well, just watch this!\" retorted the ogre, turning into a mouse. \n" + "In a flash, the cat leapt on the mouse and ate it whole. Then he dashed to the\n" + "castle gate, just in time, for the King's carriage was drawing up. With a bow,\n" + "Puss in Boots said,\n" + "   \"Sire, welcome to the castle of the Marquis of Carabas!\" The King and \n" + "Queen, the Princess and the miller's son who, dressed in his princely clothes,\n" + "really did look like a marquis, got out of the carriage and the King spoke:\n" + "   \"My dear Marquis, you're a fine, handsome, young man, you have a great deal\n" + "of land and a magnificent castle. Tell me, are you married?\"\n" + "   \"No,\" the young man answered, \"but I would like to find a wife.\" He looked \n" + "at the Princess as he spoke. She in turn smiled at him.\n" + "   To cut a long story short, the miller's son, now Marquis of Carabas, \n" + "married the Princess and lived happily with her in the castle. And from time \n" + "to time, the cat would wink and whisper, \"You see, Master, I am worth a lot \n" + "more than any mangy donkey or half-ruined mill, aren't I?\"";
        Assert.assertEquals(actualContentString, expectedContentString);
    }

    @Rule
    public ExpectedException expectedIllegalArgumentException = ExpectedException.none();
    public ExpectedException expectedNullPointerException = ExpectedException.none();

    @Test
    public void testStringToMostFrequentMap_Empty() {
        FrequencyCounter.analyseWordFrequency("", 10);
        expectedIllegalArgumentException.expect(IllegalArgumentException.class);
        expectedIllegalArgumentException.expectMessage("The file you have passed doesn't have any words to analyse");
    }

    @Test
    public void testStringToMostFrequentMap_Null() {
        FrequencyCounter.analyseWordFrequency(null, 10);
        expectedNullPointerException.expect(NullPointerException.class);
        expectedNullPointerException.expectMessage("Are you sure that is a .txt file?");
    }

    @Test
    public void testStringToMostFrequentMap_BasicOne() {
        String textString = "hello I am a test string";
        HashMap<String, Integer> expectedMap = new HashMap<String, Integer>();
        expectedMap.put("hello", 1);
        expectedMap.put("I", 1);
        expectedMap.put("am", 1);
        expectedMap.put("a", 1);
        expectedMap.put("test", 1);
        expectedMap.put("string", 1);
        HashMap<String, Integer> actualMap = FrequencyCounter.analyseWordFrequency(textString, 10);
        Assert.assertEquals(expectedMap, actualMap);
    }

    @Test
    public void testStringToMostFrequent_BasicTwo() {
        String textString = "Today the weather is absolutely gorgeous! I have no idea why... its ridiculous because it's February!!! I hope that this weather lasts forever because this weekened I want to go railfanning. I should text my dad about this, he'll find it interesting.";
        HashMap<String, Integer> expectedMap = new HashMap<String, Integer>();
        expectedMap.put("i", 4);
        expectedMap.put("it", 3);
        expectedMap.put("this", 3);
        expectedMap.put("weather", 2);
        expectedMap.put("because", 2);
        expectedMap.put("go", 1);
        expectedMap.put("to", 1);
        expectedMap.put("ridiculous", 1);
        expectedMap.put("want", 1);
        expectedMap.put("hell", 1);
        HashMap<String, Integer> actualMap = FrequencyCounter.analyseWordFrequency(textString, 10);
        Assert.assertEquals(expectedMap, actualMap);
    }

    @Test
    public void testStringToMostFrequent_Alphanumerical() {
        String textString = "hello2 unfor4tuanately 5this s%^&*(tring ha-;s 6 a bunch&*) of     other stu&&*(ff.";
        HashMap<String, Integer> expectedMap = new HashMap<String, Integer>();
        expectedMap.put("hello", 1);
        expectedMap.put("unfortuanately", 1);
        expectedMap.put("this", 1);
        expectedMap.put("string", 1);
        expectedMap.put("has", 1);
        expectedMap.put("a", 1);
        expectedMap.put("bunch", 1);
        expectedMap.put("other", 1);
        expectedMap.put("of", 1);
        expectedMap.put("stuff", 1);
        HashMap<String, Integer> actualMap = FrequencyCounter.analyseWordFrequency(textString, 10);
        Assert.assertEquals(expectedMap, actualMap);
    }

    @Test
    public void testStringToMostFrequent_WhiteSpace() {
        String textString = "         ******************              help";
        HashMap<String, Integer> expectedMap = new HashMap<String, Integer>();
        expectedMap.put("help", 1);
        HashMap<String, Integer> actualMap = FrequencyCounter.analyseWordFrequency(textString, 10);
        Assert.assertEquals(expectedMap, actualMap);
    }

    @Test
    public void testStringToMostFrequent_IgnoreCase() {
        String textString = "hello HELLO hE^^lLo will th444is eVen wORK";
        HashMap<String, Integer> expectedMap = new HashMap<String, Integer>();
        expectedMap.put("hello", 3);
        expectedMap.put("will", 1);
        expectedMap.put("this", 1);
        expectedMap.put("even", 1);
        expectedMap.put("work", 1);
        HashMap<String, Integer> actualMap = FrequencyCounter.analyseWordFrequency(textString, 10);
        Assert.assertEquals(expectedMap, actualMap);
    }

    @Test
    //data for expected Map derived from the following application: https://wordcounter.com
    public void testStringToMostPopularMap_Stress() {
        String textString = "                  THE THREE LITTLE PIGS\n" + "\n" + "   Once upon a time . . . there were three little pigs, who left their mummy\n" + "and daddy to see the world.\n" + "   All summer long, they roamed through the woods and over the plains,playing\n" + "games and having fun. None were happier than the three little pigs, and they\n" + "easily made friends with everyone. Wherever they went, they were given a warm \n" + "welcome, but as summer drew to a close, they realized that folk were drifting\n" + "back to their usual jobs, and preparing for winter. Autumn came and it began\n" + "to rain. The three little pigs started to feel they needed a real home. Sadly\n" + "they knew that the fun was over now and they must set to work like the others,\n" + "or they'd be left in the cold and rain, with no roof over their heads. They\n" + "talked about what to do, but each decided for himself. The laziest little pig\n" + "said he'd build a straw hut.\n" + "   \"It wlll only take a day,' he said. The others disagreed.\n" + "   \"It's too fragile,\" they said disapprovingly, but he refused to listen. Not\n" + "quite so lazy, the second little pig went in search of planks of seasoned\n" + "wood.\n" + "   \"Clunk! Clunk! Clunk!\" It took him two days to nail them together. But the\n" + "third little pig did not like the wooden house.\n" + "   \"That's not the way to build a house!\" he said. \"It takes time, patience \n" + "and hard work to buiid a house that is strong enough to stand up to wind, \n" + "rain, and snow, and most of all, protect us from the wolf!\"\n" + "   The days went by, and the wisest little pig's house took shape, brick by\n" + "brick. From time to time, his brothers visited him, saying with a chuckle:\n" + "   \"Why are you working so hard? Why don't you come and play?\" But the\n" + "stubborn bricklayer pig just said \"no\".\n" + "   \"I shall finish my house first. It must be solid and sturdy. And then I'll\n" + "come and play!\" he said. \"I shall not be foolish like you! For he who laughs\n" + "last, laughs longest!\"\n" + "   It was the wisest little pig that found the tracks of a big wolf in the\n" + "neighbourhood.\n" + "   The little pigs rushed home in alarm. Along came the wolf, scowling \n" + "fiercely at the laziest pig's straw hut.\n" + "   \"Come out!\" ordered the wolf, his mouth watering. I want to speak to you!\"\n" + "   \"I'd rather stay where I am!\" replied the little pig in a tiny voice.\n" + "   \"I'll make you come out!\" growled the wolf angrily, and puffing out his\n" + "chest, he took a very deep breath. Then he blew wlth all his might, right onto\n" + "the house. And all the straw the silly pig had heaped against some thin poles,\n" + "fell down in the great blast. Excited by his own cleverness, the wolf did not\n" + "notice that the little pig had slithered out from underneath the heap of\n" + "straw, and was dashing towards his brother's wooden house. When he realized \n" + "that the little pig was escaping, the wolf grew wild with rage.\n" + "   \"Come back!\" he roared, trying to catch the pig as he ran into the wooden \n" + "house. The other little pig greeted his brother, shaking like a leaf.\n" + "   \"I hope this house won't fall down! Let's lean against the door so he can't\n" + "break in!\"\n" + "   Outside, the wolf could hear the little pigs' words. Starving as he was, at\n" + "the idea of a two-course meal, he rained blows on the door.\n" + "   \"Open up! Open up! I only want to speak to you!\"\n" + "   Inside, the two brothers wept in fear and did their best to hold the door\n" + "fast against the blows. Then the furious wolf braced himself a new effort: he\n" + "drew in a really enormous breath, and went ... WHOOOOO! The wooden house\n" + "collapsed like a pack of cards.\n" + "   Luckily, the wisest little pig had been watching the scene from the window\n" + "of his own brick house, and he rapidly opened the door to his fleeing \n" + "brothers. And not a moment too soon, for the wolf was already hammering \n" + "furiously on the door. This time, the wolf had grave doubts. This house had a\n" + "much more solid air than the others. He blew once, he blew again and then for\n" + "a third time. But all was in vain. For the house did not budge an lnch. The\n" + "three little pigs watched him and their fear began to fade. Quite exhausted by\n" + "his efforts, the wolf decided to try one of his tricks. He scrambled up a\n" + "nearby ladder, on to the roof to have a look at the chimney. However, the\n" + "wisest little pig had seen thls ploy, and he quickly said:\n" + "   \"Quick! Light the fire!\" With his long legs thrust down the chimney, the\n" + "wolf was not sure if he should slide down the black hole. It wouldn'tbe easy\n" + "to get in, but the sound of the little pigs' voices below only made him feel\n" + "hungrier.\n" + "   \"I'm dying of hunger! I'm goin to try and get down.\" And he let himself \n" + "drop. But landing was rather hot, too hot! The wolf landed in the fire, stunned\n" + "by his fall.\n" + "   The flames licked his hairy coat and his tail became a flaring torch.\n" + "   \"Never again! Never again will I go down a chimneyl\" he squealed, as he\n" + "tried to put out the flames in his tail. Then he ran away as fast as he could.\n" + "   The three happy little pigs, dancing round and round the yard, began to \n" + "sing:\n" + "   \"Tra-la-la! Tra-la-la! The wicked black wolf will never come back...!\"\n" + "   From that terrible day on, the wisest little pig's brothers set to work\n" + "with a will. In less than no time, up went the two new brick houses. The wolf\n" + "did return once to roam in the neighbourhood, but when he caught sight of\n" + "three chimneys, he remembered the terrible pain of a burnt tail, and he left\n" + "for good.\n" + "   Now safe and happy, the wisest little pig called to his brothers:\n" + "   \"No more work! Come on, let's go and play!\"";
        HashMap<String, Integer> expectedMap = new HashMap<String, Integer>();
        expectedMap.put("the", 83);
        expectedMap.put("and", 33);
        expectedMap.put("to", 32);
        expectedMap.put("he", 28);
        expectedMap.put("pig", 26);
        expectedMap.put("a", 26);
        expectedMap.put("little", 22);
        expectedMap.put("his", 17);
        expectedMap.put("wolf", 16);
        expectedMap.put("in", 15);
        HashMap<String, Integer> actualMap = FrequencyCounter.analyseWordFrequency(textString, 10);

        Assert.assertEquals(expectedMap, actualMap);
    }
}
